package CursoJava;

import java.util.Scanner;

public class Exercicio16 {
    static void main(String[] args) {
        /* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos
           no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
           O algoritmo será encerrado quando pelo menos uma das duas coordenadas for NULA. */

        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.print("Digite o valor de X: ");
        x = scanner.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }

            System.out.print("Digite o valor de X: ");
            x = scanner.nextInt();
            System.out.print("Digite o valor de Y: ");
            y = scanner.nextInt();
        }

        scanner.close();
    }
}
