import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1002 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double area, n, raio;
        n = 3.14159;
        raio = input.nextDouble();
        input.close();
        area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

    }
}
