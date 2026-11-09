package Schleifen;

import oop.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticheGleichung3 {
    public static void main(String[] args) throws IOException {

        System.out.println("Wert von a: ");
        double a = IO.readDouble();

        System.out.println("Wert von b: ");
        double b = IO.readDouble();

        System.out.println("Wert von c: ");
        double c = IO.readDouble();

        //Berechnung der Diskriminante
        double d = (Math.pow(b, 2)) - (4 * a * c);

        //Berechnung der Lösungen
        if (d < 0) {
            System.out.println("Keine Lösung vorhanden!");
        }else if (d == 0) {
            double ergebnis = -b / (2 * a);
            System.out.println("Doppelte Nullstelle bei x = " + ergebnis);
        }else {
            double ergebnis1 = (-b + Math.sqrt(d)) / (2 * a);
            double ergebnis2 = (-b - Math.sqrt(d)) / (2 * a);

            //Ausgabe der Lösungen
            System.out.println("x1 = " + ergebnis1);
            System.out.println("x2 = " + ergebnis2);
        }
    }
}
