import java.util.Locale;
import java.util.Scanner;

public class ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();
        double reajuste = 0;
        double novoSalario = 0;
        int porcentagem = 0;


        if (salario <= 400.00) {
            reajuste = salario * 0.15;
            novoSalario = salario + reajuste;
            porcentagem = 15;
        } else if (salario > 400.00 && salario <= 800.00) {
            reajuste = salario * 0.12;
            porcentagem = 12;
            novoSalario = salario + reajuste;
        } else if (salario > 800.00 && salario <= 1200.00) {
            reajuste = salario * 0.10;
            novoSalario = salario + reajuste;
            porcentagem = 10;
        } else if (salario > 1200.00 && salario <= 2000.00) {
            reajuste = salario * 0.07;
            novoSalario = salario + reajuste;
            porcentagem = 7;
        } else {
            System.out.println("Algo deu errado.");
        }

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + porcentagem + " %");
    }
}
