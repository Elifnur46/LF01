package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeometrischeReihe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie viele Durchgänge möchten Sie berechnen?");
        int n = Integer.parseInt(br.readLine());

        double ergebnis = berechnen(n);

        System.out.println("ergebnis: " + ergebnis);

    }
    private static double berechnen(int n){
        double summe = 0;

        for (int i = 1; i <= n; i++) {
            summe = summe + 1.0 / Math.pow(2, i);
        }
        return summe;
    }
}