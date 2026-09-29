package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taschenrechner3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("wähle eine rechenoparation: ");
        System.out.println("A) Addition + ");
        System.out.println("B) Subtration - ");
        System.out.println("C) MUltiplikation * ");
        System.out.println("D) Differenz / ");

        String operation = br.readLine();


        System.out.println("Bitte die erste zahle eingeben");
        double x = Double.parseDouble(br.readLine());


        System.out.println("Bitte die zweite zahle eingeben");
        double y = Double.parseDouble(br.readLine());



        switch (operation) {
            case "+", "A":
                double summe = x + y;
                System.out.println("summe = " + summe);
                break;

            case "-":
                double differenz = x - y;
                System.out.println("differenz = " + differenz);
                break;

            case "*":
                double produkt = x * y;
                System.out.println("produkt = " + produkt);
                break;

            case "/":
                double quotient = x / y;
                System.out.println("quotient = " + quotient);
                break;

            default:
                System.out.println("Die eingegebene Rechenoperation kenn ich nicht!");
                break;
        }


    }

}