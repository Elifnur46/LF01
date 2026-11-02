package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Fakultaet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bis zu welcher ganzen Zahl soll die Fakultät berechnet werden?");
        int n = Integer.parseInt(br.readLine());

        double summe = 1;
        for (int i = 1; i <= n; i++) {
            summe = summe * i;
        }
        System.out.println("fakultät von " + n + " ist " + summe);

    }
}