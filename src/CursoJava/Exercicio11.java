package CursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        float valor; // Intervalos -> [0 a 25], [25 a 50], [50 a 75], [75 a 100]

        System.out.println("Digite um valor qualquer: ");
        valor = scanner.nextFloat();

        if ((valor >= 0) && (valor <= 25)){
            System.out.println("Intervalo [0 a 25]");
        } else if ((valor >= 25) && (valor <= 50)) {
            System.out.println("Intervalo [25 a 50]");
        } else if ((valor >= 50) && (valor <= 75)){
            System.out.println("Intervalo [50 a 75]");
        } else if ((valor >= 75) && (valor <= 100)) {
            System.out.println("Intervalo [75 a 100]");
        } else {
            System.out.println("Fora do intervalo");
        }
        scanner.close();
    }
}
