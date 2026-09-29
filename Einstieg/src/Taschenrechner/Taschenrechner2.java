package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taschenrechner2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte die erste Zahl eingeben: ");
        double x = Double.parseDouble(br.readLine());

        System.out.println("Bitte die zeite zahle eingeben");
        double y = Double.parseDouble(br.readLine());


        System.out.println("A) Addition + ");
        System.out.println("B) Subtration - ");
        System.out.println("C) MUltiplikation * ");
        System.out.println("D) Differenz / ");
        String operation = br.readLine();


        switch (operation) {
            case "+":
                double summe = x + y;
                System.out.println("summe = " + summe);

            case "-":
                double differenz = x-y;
                System.out.println("differenz = " + differenz);

            case "*":
                double produkt = x * y;
                System.out.println("produkt = " + produkt);

            case "/":
                double quotient = x / y;
                System.out.println("quotient = " + quotient);

            default:
                System.out.println("Die eingegebene Rechenoperation kenn ich nicht!");
        }
    }
}
