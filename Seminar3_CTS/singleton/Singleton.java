package singleton;

public class Singleton {
    private String nume;
    private static Singleton instanta = null;

    private Singleton() {}

    public static synchronized Singleton getInstnata() {
        if (instanta == null){
            instanta = new Singleton();
        }
        return instanta;
    }
}
