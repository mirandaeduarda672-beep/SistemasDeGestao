public class Estagiario extends Pessoa implements SistemasInternos, TrabalhoRemoto {
    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, String matricula, double bolsaAuxilio) {
        super(nome, cpf, matricula);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public boolean acessarSistema(String usuario, String senha) {
        return true;
    }


    public String registrarPontoComGeolocalizacao() {
        return "Mostrando geolocalização";
    }

    @Override
    public String mostrarRemuneracao() {
        return "Sua remuneração é igual a R$ " + bolsaAuxilio;
    }
}