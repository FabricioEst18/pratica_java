package Exercicios_basicos;

import java.util.Scanner;

public class CalculadoraBasica {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float numero1 = scanner.nextFloat();
        System.out.println();
        System.out.println("Digite outro número: ");
        float numero2 = scanner.nextFloat();
        System.out.println();
        System.out.println("Operações dos números digitados:");
        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
        System.out.println(numero1 % numero2);
        scanner.close();
    }
}
