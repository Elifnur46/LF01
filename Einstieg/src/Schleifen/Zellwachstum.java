package Schleifen;

import oop.IO;

import java.io.IOException;

public class Zellwachstum {
    public static void main(String[] args) throws IOException {
        String antwort;

        do {
            System.out.println("Bitte die aktuele Zellmenge eingeben: ");
            double zellmenge = IO.readDouble();

            System.out.println("Bitte den Wachstumsfaktor eingeben: ");
            double wachstumsfaktor = IO.readDouble();

            System.out.println("Bitte die Laufzeit der Hochrechnung in Tagen eingeben ");
            int tage = Integer.parseInt(IO.readsString());

            System.out.println("Tag" + "\t10" + "Zellmenge");

            for (int i = 1; i <= tage; i++) {
                double ergebnis = zellmenge * Math.pow(wachstumsfaktor, i);
                System.out.println(i + "\t" + ergebnis);
            }
            System.out.println("weiteren Wachsttumsprozess berechnen?");
            antwort = IO.readsString();

        }while (antwort.equalsIgnoreCase("j"));
    }
}
