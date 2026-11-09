package Schleifen;

import oop.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadratischeGleichung2 {
    public static void main(String[] args) throws IOException {

        //Berechnung der Diskriminante.
        double d = Math.pow(p / 2,2) - q;

        //Berechnung der Lösungen.
        if (d < 0){
            System.out.println("Keine Lösung vorhanden!");
        } else if (d == 0) {
            double ergebnis = -p / 2;
            System.out.println("Doppelte Nullstelle bei x = " + ergebnis);
        }else {
            double ergebnis1 = -p / 2 + Math.sqrt(d);
            double ergebnis2 = -p / 2 - Math.sqrt(d);
            //Ausgabe der Lösung.
            System.out.println("Eine Nullstelle bei x = " + ergebnis1);
            System.out.println("Eine Nullstelle bei x = " + ergebnis2);
        }string
    }
}
