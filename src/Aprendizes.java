public class Aprendizes extends Pessoa {

    public String consultarTrilhaDeTreinamento() {
        return "Acessando trilha de treinamento";
    }
    private double valorPorHora;
    private double cargaHoraria;
    @Override
    public String mostrarRemuneracao() {
        return "Sua remuneração é igual a " + cargaHoraria*valorPorHora;
    }
}
