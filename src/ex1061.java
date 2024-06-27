import java.util.Locale;
import java.util.Scanner;

public class ex1061 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
        String s;

        s = input.next();
        W1 = input.nextInt();
        X1 = input.nextInt();
        s = input.next();
        Y1 = input.nextInt();
        s = input.next();
        Z1 = input.nextInt();
        s = input.next();
        W2 = input.nextInt();
        X2 = input.nextInt();
        s = input.next();
        Y2 = input.nextInt();
        s = input.next();
        Z2 = input.nextInt();

        inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
        fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
        duracao = fim - inicio;

        W = duracao / (24*60*60);
        resto = duracao % (24*60*60);
        X = resto / (60*60);
        resto = resto % (60*60);
        Y = resto / 60;
        Z = resto % 60;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");

        input.close();
    }
}