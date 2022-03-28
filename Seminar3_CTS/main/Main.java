package main;
import simple_factory.*;
import singleton.*;

public class Main {
    public static void main(String[] args) {
        // SINGLETON
        Singleton s1 = Singleton.getInstnata();
        Singleton s2 = Singleton.getInstnata();
        System.out.println(s1);
        System.out.println(s2);


        //SIMPLE FACTORY
        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz, "B 77 AAA");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai, "B 33 ABB");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz, "B 77 BBB");

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());
    }
}
