package CursoJava.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int diferencaProduto;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        C = scanner.nextInt();
        System.out.println("Digite o valor de D: ");
        D = scanner.nextInt();

        diferencaProduto = ((A * B) - (C *D));

        System.out.println("DIFERENÇA: " + diferencaProduto);
        scanner.close();
    }
}
