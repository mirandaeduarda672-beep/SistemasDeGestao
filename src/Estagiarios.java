public class Estagiarios extends Pessoa implements SistemasInternos, TrabalhoRemoto {
    public Double bolsaAuxilio;

    public String mostrarBolsaAuxilio() {
        return "Parabens, voce recebeu sua bolsa auxilio com o valor de " + bolsaAuxilio;
    }
     public String registrarPontoComGeolocalizacao(){
        return "Mostrando geolocalização";
     }

    @Override
    public String mostrarRemuneracao() {
        return "Sua remuneração é igual a " + getRemuneracao() + bolsaAuxilio;
    }
}
