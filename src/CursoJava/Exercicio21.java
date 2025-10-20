package CursoJava;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        /* Fazer um programa para ler um número N.
           Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
           Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de casos: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o par " + i + " (numerador e denominador): ");
            double numero1 = scanner.nextDouble();
            double numero2 = scanner.nextDouble();

            if (numero2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = numero1 / numero2;
                System.out.printf("%.1f%n", resultado);
            }
        }

        scanner.close();
    }
}
