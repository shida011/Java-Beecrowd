import java.util.Scanner;

public class ex1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N, resto, horas, minutos, segundos;

        N = input.nextInt();
        input.close();

        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
