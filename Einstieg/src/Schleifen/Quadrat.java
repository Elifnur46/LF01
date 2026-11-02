package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie groß soll das Quadrat sein");
        int n = Integer.parseInt(br.readLine());
        double summe = 0;

        // oben
        for (int i=1; i<= n; i++) {
            System.out.print("*");
        }

        System.out.println();
        // mitte
        for (int i = 1; i <= n-2; i++) {
            System.out.print("*");
            for (int j = 1; j <= n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // unten
        for (int i=1; i<= n; i++) {
            System.out.print("*");
        }

    }
}
