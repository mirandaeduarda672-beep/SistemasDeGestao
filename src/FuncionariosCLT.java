public class FuncionariosCLT extends Pessoa implements  SistemasInternos, TrabalhoRemoto{

    private Double remuneracao;
    private double horasExtras;
    private double beneficios;
    public String solicitarFerias(){
        return "Por favor me de ferias";
    }
    public boolean acessarSistema(String usuario, String senha) {
        return true;
    }
    @Override
    public String mostrarRemuneracao() {

        return "Sua remuneração é igual a "+ remuneracao+horasExtras+beneficios;
    }
}
