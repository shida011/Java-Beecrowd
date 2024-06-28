import java.util.Scanner;

public class ex1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo = input.nextInt();
        int quant = input.nextInt();
        input.close();
        double conta = 0.00;

        if (codigo == 1) {
            conta = 4.00;
        } else if (codigo == 2) {
            conta = 4.50;
        } else if (codigo == 3) {
            conta = 5.00;
        } else if (codigo == 4) {
            conta = 2.00;
        } else if (codigo == 5) {
            conta = 1.50;
        } else {
            System.out.println("Produto inválido.");
        }

        double total = conta * quant;
        System.out.printf("Total: R$ %.2f%n", total);

    }
}
