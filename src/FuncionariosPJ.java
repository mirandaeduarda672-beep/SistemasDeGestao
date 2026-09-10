public class FuncionariosPJ extends Pessoa implements  TrabalhoRemoto {
    private double valorContrato;

    public FuncionariosPJ(String nome, String cpf, String matricula, double valorContrato) {
        super(nome, cpf, matricula);
        this.valorContrato = valorContrato;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public String anexarNotaFiscal() {
        return "Anexando nota fiscal";
    }
    public String autenticarVia2FA(){
        return "Anexando via2fa";
    }

    @Override
    public boolean acessarSistema(String usuario, String senha) {
        return false;
    }

@Override
    public String mostrarRemuneracao() {
        return "Sua remuneração é igual a R$ " + valorContrato;
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
