import java.util.Locale;
import java.util.Scanner;

public class ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        double nota4 = input.nextDouble();
        double notaExame = 0;
        double mediaFinal = 0;

        double media = (((nota1*2) + (nota2 *3) + (nota3*4) + nota4) / 10);

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            notaExame = input.nextDouble();

            System.out.printf("Nota do exame: %.1f%n", notaExame);
            mediaFinal = (media + notaExame) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
            }
        } else {
            System.out.println("Notas inválidas");
        }

        input.close();
    }
}
