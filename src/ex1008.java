import java.util.Locale;
import java.util.Scanner;

public class ex1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        int horas = input.nextInt();
        double pagPorHora = input.nextDouble();
        double salario = horas * pagPorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
