import java.util.Scanner;

public class exMaiorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        if (a < b && a < c) {
            System.out.println("MENOR = " + a);
        } else if (b < c) {
            System.out.println("MENOR = " + b);
        } else {
            System.out.println("MENOR = " + c);
        }

    }
}
