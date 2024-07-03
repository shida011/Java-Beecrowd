import java.util.Scanner;

public class ex1114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = input.nextInt();
        }

        System.out.println("Acesso Permitido");
        input.close();
    }
}
