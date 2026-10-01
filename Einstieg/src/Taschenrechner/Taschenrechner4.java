package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taschenrechner4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("wähle eine rechenoparation: ");
        System.out.println("A) Addition + ");
        System.out.println("B) Subtration - ");
        System.out.println("C) Multiplikation * ");
        System.out.println("D) Differenz / ");
        System.out.println("E) Potenzieren p ");
        System.out.println("F) Wurzelziehen w ");

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

            case "p":
                double potenz = Math.pow(x , y);
                System.out.println("potenz = " + potenz);

            case "w":
                double wurzel = wurzel();
                System.out.println("wurzel = " + wurzel);


            default:
                System.out.println("Die eingegebene Rechenoperation kenn ich nicht!");
                break;
        }


    }

    private static double wurzel() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie eine wurzel zahl: ");
        double zahl = Double.parseDouble(br.readLine());

        double wurzel = Math.sqrt(zahl);
        return wurzel;
    }




}