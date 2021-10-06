package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.CrmService;
import one.digitalinnovation.gof.subsistema2.CepApi;

public class Facade {



    public void migrarCLiente(String nome, String cep){

        String cidade =CepApi.getInstance().recuperarCidade(cep);
        String estado =CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cidade, estado,cep);
    }

}
