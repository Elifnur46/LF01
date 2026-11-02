package Schleifen;

import oop.IO;

import java.io.IOException;

public class Schaltjahr {
    public static void main(String[] args) throws IOException {

        System.out.println("Bei welchem Jahr soll Ihre Berechnung starten?");
        int startJahr = IO.readInteger();

        System.out.println("Bis zu welchem Jahr soll Ihre Berechnung  gehen?");
        int endeJahr = IO.readInteger();

        for (int i = startJahr; i <= endeJahr; i++){
            if (i % 4 == 0 ) {
                System.out.println(i);
            } else if (i % 100 == 0){
                System.out.println(i);
            }else if (i % 400 == 0){
                System.out.println(i);
            }
        }

    }
}
