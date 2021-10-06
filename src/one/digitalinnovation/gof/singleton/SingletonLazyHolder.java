package one.digitalinnovation.gof.singleton;

//Singleton "Preguiçoso"
// Thread Safe
public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }

}
