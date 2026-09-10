public interface TrabalhoRemoto {

public default String remoto(){
    return "Trabalhou remotamente";
}

    String registrarPontoComGeolocalizacao();
}