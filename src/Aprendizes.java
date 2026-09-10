public class Aprendizes extends Pessoa {

    public Aprendizes(String nome, String cpf, String matricula, double valorHora, double horasTrabalhadas) {
        super(nome, cpf, matricula); // Envia nome, cpf e matricula para a classe Pessoa
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String consultarTrilhaDeTreinamento() {
        return "Acessando trilha de treinamento";
    }
    private double valorHora;
    private double horasTrabalhadas;

    @Override
    public boolean acessarSistema(String usuario, String senha) {
        return false;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String mostrarRemuneracao() {
        double total = valorHora * horasTrabalhadas;
        return "Sua remuneração é igual a R$ " + total;
    }
}
