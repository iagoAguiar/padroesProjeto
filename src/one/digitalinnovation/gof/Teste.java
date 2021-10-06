package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.strategy.*;

public class Teste {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        //SingletonLazyHolder lazyHolder = new SingletonLazyHolder();

        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoOfensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);


        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();


        // Facade

        Facade facade = new Facade();
        facade.migrarCLiente("Venilton", "2802029");

    }
}
