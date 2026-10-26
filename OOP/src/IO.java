import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {


    public static String readsString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        return text;

    }

}
