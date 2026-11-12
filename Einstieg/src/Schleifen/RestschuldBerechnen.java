package Schleifen;

import oop.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestschuldBerechnen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Bitte Kreditsumme eingeben: ");
            double kreditsumme = IO.readDouble();

            System.out.println("Bitte Jahreszins eingeben: ");
            double jahreszins = IO.readDouble();

            System.out.println("Bitte Laufzeit in Monat eingeben: ");
            double laufzei = IO.readDouble();


        }

    }
}
