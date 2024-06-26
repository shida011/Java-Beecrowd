import java.util.Locale;
import java.util.Scanner;

public class ex1011 {
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi, volume;
        int raio = input.nextInt();
        pi = 3.14159;
        input.close();

        volume = (double) (4.0/3) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
