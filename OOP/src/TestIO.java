import java.io.IOException;

public class TestIO {

    public static void main(String[] args) throws IOException {
        System.out.println("Hallo, wie gehts es dir?");
        String eingabe = IO.readsString();
        System.out.println(eingabe);
        System.out.println("Was machst du heute?");
        String eingabe = IO.readsString();
        System.out.println(eingabe);
        
    }
}
