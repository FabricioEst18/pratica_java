package CursoJava;

import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo; // 1, 2, 3, 4, 5
        int quantidadeItem;
        float valorTotal;

        System.out.println("Digite o código do seu item: ");
        codigo = scanner.nextInt();
        System.out.println("Qual a quantidade? ");
        quantidadeItem = scanner.nextInt();

        if (codigo == 1){
            valorTotal = (float) (4.0 * quantidadeItem);
            System.out.printf("TOTAL: R$ %.2f%n", valorTotal);
        } else if (codigo == 2) {
            valorTotal = (float) (4.50 * quantidadeItem);
            System.out.printf("TOTAL: R$ %.2f%n", valorTotal);
        } else if (codigo == 3) {
            valorTotal = (float) (5.0 * quantidadeItem);
            System.out.printf("TOTAL: R$ %.2f%n", valorTotal);
        } else if (codigo == 4) {
            valorTotal = (float) (2.0 * quantidadeItem);
            System.out.printf("TOTAL: R$ %.2f%n", valorTotal);
        } else if (codigo == 5) {
            valorTotal = (float) (1.50 * quantidadeItem);
            System.out.printf("TOTAL: R$ %.2f%n", valorTotal);
        }
        scanner.close();
    }
}
