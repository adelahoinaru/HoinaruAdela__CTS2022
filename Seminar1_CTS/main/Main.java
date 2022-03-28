package main;

import clase.Girafa;
import clase.IngrijitorZOO;
import clase.ZOO;
import clase.Zebra;

public class Main {

    public static void main(String[] args) {
        IngrijitorZOO ingrijitor = new IngrijitorZOO("Adela");

        Zebra z1 = new Zebra("Alina");
        Zebra z2 = new Zebra("Mihai");

        Girafa g1 = new Girafa("Alexandra");
        Girafa g2 = new Girafa("Cosmina");

        ZOO zoo = new ZOO("Bucuresti ZOO", ingrijitor);

        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(g1);
        zoo.adaugaAnimal(g2);

        zoo.hranesteAnimale("banane");
    }
}

