public class Aprendizes extends Pessoa {

    public String consultarTrilhaDeTreinamento() {
        return "Acessando trilha de treinamento";
    }

    @Override
    public String mostrarRemuneracao() {
        return "Sua remuneração é igual a " + getRemuneracao() + getCargaHoraria();
    }
}
