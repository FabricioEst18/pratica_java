package CursoJava;

import java.util.Scanner;

public class Exercicio18 {
    static void main(String[] args) {
        /*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.
         */

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        for(int i = 1; i <= numero; i += 2){
            System.out.println(i);
        }
        scanner.close();
    }
}
