package Exercicios_basicos;

import java.util.Scanner;

public class ParImpar {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float numero = scanner.nextFloat();

        if (numero % 2 == 0){
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }
        scanner.close();
    }
}
