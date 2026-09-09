public class FuncionariosPJ extends Pessoa implements SistemasInternos, TrabalhoRemoto {
    private String contrato;

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String anexarNotaFiscal() {
        return "Anexando nota fiscal";
    }
    public String autenticarVia2FA(){
        return "Anexando nota fiscal";
    }

    @Override
    public String mostrarRemuneracao() {
        return "Sua remuneração é igual a " + getRemuneracao();
    }
}
