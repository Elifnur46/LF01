package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taschenrechner {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte die erste Zahl eingeben: ");
        double x = Double.parseDouble(br.readLine());

        System.out.println("Bitte die zeite zahle eingeben");
        double y = Double.parseDouble(br.readLine());

        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        double summe = x + y;
        System.out.println("Summe = " + summe);

        double differenz = x - y;
        System.out.println("Differenz = " + differenz);

        double produkt = x * y;
        System.out.println("Produkt = " + produkt);

        double quotient = x / y;
        System.out.println("Quotient = " + quotient);



    }
}
