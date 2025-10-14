package Exercicios_basicos;

import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do número " + numero + ":");
        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
