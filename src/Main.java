import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista usando a sua classe base Pessoa
        List<Pessoa> colaboradores = new ArrayList<>();

        // Instanciando com os nomes EXATOS das suas classes
        colaboradores.add(new FuncionariosCLT("Maria Silva", "111.222.333-44", "CLT01", 4500.00, 800.00));
        colaboradores.add(new FuncionariosPJ("João Souza", "555.666.777-88", "PJ01",20000));
        colaboradores.add(new Estagiario("Ana Costa", "888.999.000-11", "EST01", 1500.00));
        colaboradores.add(new Aprendizes("Carlos Oliveira", "222.333.444-55", "APR01", 12.50, 80));
        colaboradores.add(new Consultor("Roberto Alves", "999.888.777-66", "CONS01", 150.00, 40));

        System.out.println("=== 1. LISTAGEM E REMUNERAÇÃO ===");
        for (Pessoa p : colaboradores) {
            System.out.println("----------------------------------------");
            System.out.println("Matrícula: " + p.getMatricula() + " | Nome: " + p.getNome());
            System.out.println(p.mostrarRemuneracao());
        }

        System.out.println("\n=== 2. TESTANDO ACESSO AO SISTEMA ===");
        for (Pessoa p : colaboradores) {
            if (p instanceof SistemasInternos) {
                SistemasInternos sistema = (SistemasInternos) p;
                boolean login = sistema.acessarSistema("admin", "1234");
                System.out.println("🔑 " + p.getNome() + " tem acesso ao sistema? SIM (Status: " + (login ? "Sucesso" : "Falha") + ")");
            } else {
                System.out.println("🚫 " + p.getNome() + " NÃO tem acesso ao sistema interno.");
            }
        }

        System.out.println("\n=== 3. TESTANDO TRABALHO REMOTO ===");
        for (Pessoa p : colaboradores) {
            if (p instanceof TrabalhoRemoto) {
                TrabalhoRemoto remoto = (TrabalhoRemoto) p;
                System.out.println("💻 " + p.getNome() + ": " + remoto.registrarPontoComGeolocalizacao());
            } else {
                System.out.println("🏢 " + p.getNome() + " trabalha apenas presencialmente.");
            }
        }
    }
}