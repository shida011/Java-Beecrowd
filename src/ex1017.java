// Gasto de Combustível.
import java.util.Locale;
import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int tempoGasto = input.nextInt();
        int velocidadeMedia = input.nextInt();

        double distancia = tempoGasto * velocidadeMedia;
        double litros = distancia / 12;

        System.out.printf("%.3f%n", litros);
    }
}
