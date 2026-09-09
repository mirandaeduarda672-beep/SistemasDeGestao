public class FuncionariosCLT extends Pessoa{
    @Override
    public double getSalario() {
        return super.getSalario();
    }
    public String solicitarFerias(){
        return "Por favor me de ferias";
    }
    @Override
    public String mostrarRemuneracao() {

        return "Sua remuneração é igual a "+ getRemuneracao()+getHorasExtras();
    }
}
