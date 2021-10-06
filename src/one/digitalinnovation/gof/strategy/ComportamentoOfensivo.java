package one.digitalinnovation.gof.strategy;

public class ComportamentoOfensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");

    }
}
