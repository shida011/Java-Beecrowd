import java.util.Locale;
import java.util.Scanner;

public class ex1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome;
        nome = input.next();
        double salario = input.nextDouble();
        double vendas =  input.nextDouble();

        double total = salario + vendas * 0.15;

        System.out.printf("TOTAL = %.2f%n", total);

        input.close();
    }
}