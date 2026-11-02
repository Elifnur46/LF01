package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratsumme {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bis zu welcher ganzen Zahl soll die Quadratsumme?");
        int n = Integer.parseInt(br.readLine());

        int summe = 0;

        for (int i = 1; i <= n; i++) {
           summe = summe + i * i;
        }
        System.out.println("Quadratsumme ist" + summe);

    }


}
