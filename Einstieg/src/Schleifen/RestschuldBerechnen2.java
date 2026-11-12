package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestschuldBerechnen2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double kredutsumme;
        double jahreszins;
        double monatsrate;
        double laufzeit;
        double restschuld;
        double zinsbetrag;

        System.out.println("Eingabe Kreditsumme: ");
        kredutsumme = Double.parseDouble(br.readLine());

        System.out.println("Eingabe Jahreszins: ");
        jahreszins = Double.parseDouble(br.readLine());

        System.out.println("Eingabe Monatsrate: ");
        int Laufzeit = Integer.parseInt(br.readLine());

        restschuld = kredutsumme;

        System.out.println("tKreditsumme/tJahreszins/tMonaten/tRestschuld");

        for (int Monaten = 1; Monaten <= Laufzeit; Monaten++);
        zinsbetrag = restschuld * jahreszins / 100 / 12;
        restschuld = restschuld + zinsbetrag - jahreszins;


        System.out.println(monatsrate + "\t" + zinsbetrag + "\t" + restschuld);
        System.out.println("Es bleibt eine Restschuld in Höhe von" + restschuld + "€.");
        System.out.println("Wollen Sie eine weitere Berechnung durchführen?");

    }
}
