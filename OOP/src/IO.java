import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {


    public static String readsString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        return text;
    }

    public static int readInteger() throws IOException {
        while (true) {
            try {
                String eingabe = IO.readsString();
                int ganzeZahl = Integer.parseInt(eingabe);
                return ganzeZahl;
            } catch (NumberFormatException e) {
                System.out.println("Keine ganzeZahl!!! Bitte erneut vesuchen");
            }
        }

    }

    public static double readDouble() throws IOException {
        while (true) {
            try {
                String eingabe = IO.readsString();
                double kommazahl = Double.parseDouble(eingabe.replace(",", "."));
                return kommazahl;
            } catch (NumberFormatException e) {
                System.out.println("Keine ganzeZahl!!! Bitte erneut vesuchen");
            }
        }

    }

}
