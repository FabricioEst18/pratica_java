package CursoJava.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    static void main(String[] args) {
        /* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
           Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
           Apresente a média ponderada para cada conjunto de 3 valores,
           sendo que o primeiro tem peso 2, o segundo peso 3 e o terceiro peso 5. */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos casos de teste você irá informar: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o primeiro valor: ");
            float v1 = scanner.nextFloat();

            System.out.print("Digite o segundo valor: ");
            float v2 = scanner.nextFloat();

            System.out.print("Digite o terceiro valor: ");
            float v3 = scanner.nextFloat();

            float mediaPonderada = (v1 * 2 + v2 * 3 + v3 * 5) / 10;

            System.out.printf("Média ponderada: %.1f%n", mediaPonderada);
        }

        scanner.close();
    }
}
