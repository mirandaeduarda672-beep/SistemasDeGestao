import java.util.ArrayList;
import java.util.List;

// ==========================================
// 1. INTERFACES (Comportamentos Adicionais)
// ==========================================

interface Autenticavel {
    boolean acessarSistema(String usuario, String senha);
}

interface TrabalhadorRemoto {
    void trabalharRemotamente();
}

// ==========================================
// 2. CLASSE BASE ABSTRATA
// ==========================================

abstract class Colaborador {
    private String nome;
    private String cpf;
    private String matricula;

    public Colaborador(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    // Método abstrato para Polimorfismo
    public abstract double calcularRemuneracao();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public void exibirInformacoes() {
        System.out.println("----------------------------------------");
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.printf("Remuneração: R$ %.2f\n", calcularRemuneracao());
    }
}

// ==========================================
// 3. SUBCLASSES (Tipos de Colaboradores)
// ==========================================

// CLT: Recebe salário + benefícios / Acessa sistema e trabalha remoto
class FuncionarioCLT extends Colaborador implements Autenticavel, TrabalhadorRemoto {
    private double salarioBase;
    private double beneficios;

    public FuncionarioCLT(String nome, String cpf, String matricula, double salarioBase, double beneficios) {
        super(nome, cpf, matricula);
        this.salarioBase = salarioBase;
        this.beneficios = beneficios;
    }

    @Override
    public double calcularRemuneracao() {
        return salarioBase + beneficios;
    }

    @Override
    public boolean acessarSistema(String usuario, String senha) {
        return "admin".equals(usuario) && "1234".equals(senha);
    }

    @Override
    public void trabalharRemotamente() {
        System.out.println("💻 " + getNome() + " está trabalhando em home office (CLT).");
    }
}

// PJ: Recebe valor fixo do contrato / Trabalha remoto, mas sem acesso aos sistemas internos
class FuncionarioPJ extends Colaborador implements TrabalhadorRemoto {
    private double valorContrato;

    public FuncionarioPJ(String nome, String cpf, String matricula, double valorContrato) {
        super(nome, cpf, matricula);
        this.valorContrato = valorContrato;
    }

    @Override
    public double calcularRemuneracao() {
        return valorContrato;
    }

    @Override
    public void trabalharRemotamente() {
        System.out.println("💻 " + getNome() + " está prestando serviço remoto (PJ).");
    }
}

// Estagiário: Recebe bolsa-auxílio / Acessa sistema, mas não trabalha remoto
class Estagiario extends Colaborador implements Autenticavel {
    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, String matricula, double bolsaAuxilio) {
        super(nome, cpf, matricula);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularRemuneracao() {
        return bolsaAuxilio;
    }

    @Override
    public boolean acessarSistema(String usuario, String senha) {
        return "estagio".equals(usuario) && "1234".equals(senha);
    }
}

// Aprendiz: Recebe por hora / Não acessa sistema nem trabalha remoto
class Aprendiz extends Colaborador {
    private double valorHora;
    private int horasTrabalhadas;

    public Aprendiz(String nome, String cpf, String matricula, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, matricula);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularRemuneracao() {
        return valorHora * horasTrabalhadas;
    }
}

// ==========================================
// 4. CLASSE PRINCIPAL (Testes)
// ==========================================

public class Main {
    public static void main(String[] args) {
        List<Colaborador> colaboradores = new ArrayList<>();

        // Cadastrando diferentes tipos de colaboradores
        colaboradores.add(new FuncionarioCLT("Maria Silva", "111.222.333-44", "CLT01", 4500.00, 800.00));
        colaboradores.add(new FuncionarioPJ("João Souza", "555.666.777-88", "PJ01", 9500.00));
        colaboradores.add(new Estagiario("Ana Costa", "888.999.000-11", "EST01", 1500.00));
        colaboradores.add(new Aprendiz("Carlos Oliveira", "222.333.444-55", "APR01", 12.50, 80));

        System.out.println("=== 1. LISTAGEM E CÁLCULO DE REMUNERAÇÃO ===");
        for (Colaborador c : colaboradores) {
            c.exibirInformacoes();
        }

        System.out.println("\n=== 2. TESTANDO ACESSO AO SISTEMA (Interfaces) ===");
        for (Colaborador c : colaboradores) {
            if (c instanceof Autenticavel) {
                Autenticavel usuarioAutenticavel = (Autenticavel) c;
                boolean login = usuarioAutenticavel.acessarSistema("admin", "1234");
                System.out.println("🔑 " + c.getNome() + " tem permissão de acesso ao sistema? SIM (Login de teste: " + (login ? "Sucesso" : "Falha") + ")");
            } else {
                System.out.println("🚫 " + c.getNome() + " NÃO tem acesso ao sistema interno.");
            }
        }

        System.out.println("\n=== 3. TESTANDO TRABALHO REMOTO (Interfaces) ===");
        for (Colaborador c : colaboradores) {
            if (c instanceof TrabalhadorRemoto) {
                ((TrabalhadorRemoto) c).trabalharRemotamente();
            } else {
                System.out.println("🏢 " + c.getNome() + " deve trabalhar presencialmente.");
            }
        }
    }
}