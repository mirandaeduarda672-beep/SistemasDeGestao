import java.time.LocalDateTime;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String matricula;


    public Pessoa() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public abstract boolean acessarSistema(String usuario, String senha);

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
    public abstract String mostrarRemuneracao() ;
    public Pessoa(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    }

