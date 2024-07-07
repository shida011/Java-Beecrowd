import java.util.Locale;
import java.util.Scanner;

public class ex1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();
        String intervalo;

        if (valor >= 0 && valor <= 25) {
            intervalo = "[0,25]";
            System.out.println("Intervalo " + intervalo);
        } else if (valor > 25 && valor <= 50) {
            intervalo = "(25,50]";
            System.out.println("Intervalo " + intervalo);
        } else if (valor > 50 && valor <= 75) {
            intervalo = "(50,75]";
            System.out.println("Intervalo " + intervalo);
        } else if (valor > 75 && valor <= 100) {
            intervalo = "(75,100]";
            System.out.println("Intervalo " + intervalo);
        } else {
            System.out.println("Fora de intervalo");
        }

        input.close();
    }
}
