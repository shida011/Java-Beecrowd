import java.util.Locale;
import java.util.Scanner;

public class equacao2grau {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, delta, bhaskara1, bhaskara2;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();

        delta = Math.pow(b, 2.0) - 4.0 * a * c;
        bhaskara1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        bhaskara2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.printf("X1 = %.2f%n", bhaskara1);
        System.out.printf("X2 = %.2f%n", bhaskara2);
    }
}