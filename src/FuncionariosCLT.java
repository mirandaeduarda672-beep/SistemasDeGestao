public class FuncionariosCLT extends Pessoa implements TrabalhoRemoto {
    private double remuneracao;
    private double horasExtras;
    private double beneficios;

    // Apenas ESTE construtor deve existir:
    public FuncionariosCLT(String nome, String cpf, String matricula, double remuneracao, double horasExtras) {
        super(nome, cpf, matricula);
        this.remuneracao = remuneracao;
        this.horasExtras = horasExtras;
        this.beneficios = beneficios;
    }

    public String solicitarFerias() {
        return "Por favor me de ferias;";
    }

    @Override
    public boolean acessarSistema(String usuario, String senha) {
        return true;
    }

    @Override
    public String mostrarRemuneracao() {
        return "Sua remuneração é igual a " + (remuneracao + horasExtras + beneficios);
    }

    @Override
    public String remoto() {
        return TrabalhoRemoto.super.remoto();
    }

    @Override

    public String registrarPontoComGeolocalizacao() {
        return "Mostrando geolocalização";
    }
}