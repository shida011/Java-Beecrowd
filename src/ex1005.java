import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ex1005 {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, media;
        a = input.nextDouble();
        b = input.nextDouble();
        input.close();

        media = (a * 3.5 + b * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n", media);
    }
}