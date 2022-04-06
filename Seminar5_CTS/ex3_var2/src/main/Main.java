package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Gigel");
        autobuzBuilder.setNrLinie(3);

        Autobuz autobuz = autobuzBuilder.builder();
        System.out.println(autobuz.toString());
    }
}
