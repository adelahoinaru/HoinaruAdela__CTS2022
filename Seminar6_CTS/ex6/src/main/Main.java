package main;

import clase.Autobuz;
import clase.Grup;
import clase.MijlocTransport;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Main {
    public static void main(String[] args) {
        MijlocTransport a1 = new Autobuz("STB", "MERCEDES", 10);
        MijlocTransport a2 = new Autobuz("RATB", "OTOKAR", 8);
        MijlocTransport a3 = new Autobuz("PTB", "AUDI", 40);

        MijlocTransport g1 = new Grup("Mici");
        MijlocTransport g2 = new Grup("Medii");
        MijlocTransport g3 = new Grup("Flota");

        try {
            g1.adaugaMijlocTransport(a1);
            g2.adaugaMijlocTransport(a2);
            g2.adaugaMijlocTransport(a3);
            g3.adaugaMijlocTransport(g1);
            g3.adaugaMijlocTransport(g2);
        }catch (NotImplementedException e){
            e.printStackTrace();
        }

        g3.afiseazaDescriere();
    }
}
