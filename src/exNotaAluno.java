import java.util.Locale;
import java.util.Scanner;

public class exNotaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double nota1, nota2, notaFinal;
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        input.close();

        notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60.00) {
            System.out.println("REPROVADO!");
        } else {
            System.out.println("APROVADO!");
        }

    }
}
