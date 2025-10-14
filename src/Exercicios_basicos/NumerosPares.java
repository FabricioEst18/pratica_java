package Exercicios_basicos;

import java.util.Scanner;

public class NumerosPares {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual será o número que iremos contar até ele de dois em dois: ");
        int i = 0;
        int numero = scanner.nextInt();
        System.out.println("CONTADOR: ");
        while (i < numero){
            System.out.println(i += 2);
        }
        scanner.close();
    }
}
