import java.util.Locale;
import java.util.Scanner;

public class ex1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, media;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        media = (a * 2 + b * 3 + c * 5) / 10;

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
