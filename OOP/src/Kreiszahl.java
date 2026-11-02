import java.io.IOException;


public class Kreiszahl {
    public static void main(String[] args) throws IOException {


        System.out.println("Wie viele Durchlaeufe?");
        int n = IO.readInteger();


        double summe = 0;
        for (int i = 1; i <= n; i++) {
            summe += Math.pow(-1, i) / (2 * i + 1);
        }

        double pi = summe * 4;

        double abweisung = Math.abs(Math.PI - pi);

        System.out.println("Berchnr Pi-Zahl " + pi);
        System.out.println("Abweisung: " + abweisung);
    }
}