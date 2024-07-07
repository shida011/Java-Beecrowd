import java.util.Locale;
import java.util.Scanner;

public class ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        double A, B, C;
        if (n1 > n2 && n1 > n3) {
            A = n1;
            if (n2 > n3) {
                B = n2;
                C = n3;
            } else {
                B = n3;
                C = n2;
            }
        } else if (n2 > n3) {
            A = n2;
            if (n1 > n3) {
                B = n1;
                C = n3;
            } else {
                B = n3;
                C = n1;
            }
        } else {
            A = n3;
            if (n1 > n2) {
                B = n1;
                C = n2;
            } else {
                B = n2;
                C = n1;
            }
        }

        double A2 = Math.pow(A, 2.0);
        double B2 = Math.pow(B, 2.0);
        double C2 = Math.pow(C, 2.0);

        if (A >= B+C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A2 == B2+C2) {
            System.out.println("TRIANGULO RETANGULO");
            if (A == B && B == C && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else if (A2 > B2+C2) {
            System.out.println("TRIANGULO OBTUSANGULO");
            if (A == B && B == C && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else if (A2 < B2+C2) {
            System.out.println("TRIANGULO ACUTANGULO");
            if (A == B && B == C && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        input.close();
    }
}
