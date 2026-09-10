public class Consultor extends Pessoa implements SistemasInternos, TrabalhoRemoto {
    private double valorHora;
    private int horasTrabalhadas;

    public Consultor(String nome, String cpf, String matricula, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, matricula);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String mostrarRemuneracao() {
        double total = valorHora * horasTrabalhadas;
        return "Remuneração do Consultor: R$ " + total;
    }

    @Override
    public boolean acessarSistema(String usuario, String senha) {
        return true; // Lógica de acesso ao sistema
    }


    public String registrarPontoComGeolocalizacao() {
        return "Consultor registrando ponto remoto via GPS.";
    }
}