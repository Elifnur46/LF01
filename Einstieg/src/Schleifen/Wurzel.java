package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wurzel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Bitte den Startwert eingeben");
        int standwert = Integer.parseInt(br.readLine());

        System.out.println("Bitte den Endwert eingeben");
        int endwert = Integer.parseInt(br.readLine());


        for (int i = standwert; i <= endwert; i++) {
            System.out.println(i + " " + Math.sqrt(i));


        }

    }
}
