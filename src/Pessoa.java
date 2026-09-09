import java.time.LocalDateTime;

public abstract class Pessoa {
    private String Nome;
    private String CPF;
    private String Matricula;
    private double Salario;
    private LocalDateTime cargaHoraria;
    private LocalDateTime horasExtras;
    private double salario;
    private Double remuneracao;

    public Double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao() {
        this.remuneracao = remuneracao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public LocalDateTime getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(LocalDateTime horasExtras) {
        this.horasExtras = horasExtras;
    }

    public LocalDateTime getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(LocalDateTime cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setRemuneracao(Double remuneracao) {
        this.remuneracao = remuneracao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", Matricula='" + Matricula + '\'' +
                ", Salario=" + Salario +
                ", horasExtras=" + horasExtras +
                ", salario=" + salario +
                ", remuneracao=" + remuneracao +
                '}';
    }

    public abstract String mostrarRemuneracao();
}
