package one.digitalinnovation.gof;

public class Teste {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        //SingletonLazyHolder lazyHolder = new SingletonLazyHolder();

        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);

    }
}
