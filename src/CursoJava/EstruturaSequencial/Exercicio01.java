package CursoJava.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;

        System.out.println("Digite um número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = scanner.nextInt();
        soma = numero1 + numero2;

        System.out.println("SOMA: " + soma);
        scanner.close();
    }
}
