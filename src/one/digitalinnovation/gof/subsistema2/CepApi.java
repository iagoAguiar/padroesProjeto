package one.digitalinnovation.gof.subsistema2;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia   = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Campos dos jordão";
    }
    public String recuperarEstado(String cep){
        return "RJ";
    }

}
