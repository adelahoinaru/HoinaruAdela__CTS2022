package main;

import clase.Autobuz;
import clase.StareLaCapatDeLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz a = new Autobuz(305);
        a.pleacaInCursa();
        a.intraInService();
        a.ieseDinService();
        a.ajungeLaCapatDeLinie();
        a.pleacaInCursa();
      //  a.setStare(new StareLaCapatDeLinie());
        a.intraInService();
        a.pleacaInCursa();
    }
}
