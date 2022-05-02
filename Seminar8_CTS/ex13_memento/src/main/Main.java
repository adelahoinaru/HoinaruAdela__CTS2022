package main;

import clase.Autobaza;
import clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Gigel", 6, 2008, "Otokar");

        Autobaza autobaza = new Autobaza();
        autobaza.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setNumeSofer("Doru");
        autobaza.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setConsumMediu(8);
        autobaza.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        System.out.println(autobuz);

        autobuz.setMementoAutobuz(autobaza.getMementoAutobuz(0));
        System.out.println(autobuz);
    }
}
