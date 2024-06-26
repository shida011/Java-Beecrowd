import java.util.Locale;
import java.util.Scanner;

public class ex1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
        pi = 3.14159;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();

        areaTriangulo = (a * c) / 2;
        areaCirculo = pi * Math.pow(c, 2);
        areaTrapezio =  ((a + b) * c) / 2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
