package one.digitalinnovation.gof;

//Singleton "Preguiçoso"

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
