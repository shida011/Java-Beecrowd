import java.util.Locale;
import java.util.Scanner;

public class ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        double litros = input.nextDouble();

        double consumo = (double) distancia / litros;

        System.out.printf("%.3f km/l%n", consumo);

        input.close();
    }
}
