import java.io.IOException;

public class Kreiszahl2 {
    public static void main(String[] args) throws IOException {
        System.out.println("KREISZAHL-Berechnung");
        System.out.println("Obergrenze, bis zu der gerechnet werden soll: ");
        int obergernze = IO.readInteger();

        double zwischenergebnis = 0;
        for (int i = 0; i <= obergernze; i++) {
            zwischenergebnis += zwischenergebnis + Math.pow(-1, i) / (2 * i + 1);
            // alternativ / kürzer : zwischenergebnis += Math.pow(-1, i) / (2 * i + 1) ;
        }
        double ergebnis = zwischenergebnis * 4;


        System.out.println("Ergebnis = " + ergebnis);
        double abweichung = ergebnis - Math.PI;

    }

}
