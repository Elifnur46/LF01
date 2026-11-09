package Schleifen;

import oop.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadratischeGleichungen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Gib p ein: ");
            double p = IO.readDouble();

            System.out.println("Gib q ein: ");
            double q = IO.readDouble();

            double x1 = -p / 2 + Math.sqrt((p / 2) * (p / 2) - q);
            double x2 = -p / 2 - Math.sqrt((p / 2) * (p / 2) - q);

            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);

    }
}
