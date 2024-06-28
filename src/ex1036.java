import java.util.Locale;
import java.util.Scanner;

public class ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, delta, raiz1, raiz2;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();
        delta = Math.pow(b, 2.0) - 4.0 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.printf("R1 = %.5f%n", raiz1);
            System.out.printf("R2 = %.5f%n", raiz2);
        }

    }
}
