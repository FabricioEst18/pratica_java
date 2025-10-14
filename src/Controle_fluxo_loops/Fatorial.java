package Controle_fluxo_loops;

import java.util.Scanner;

public class Fatorial {
    static void main(String[] args) {

        //Fatorial: Leia um número e calcule seu fatorial usando for e depois while.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número e iremos calcular seu fatorial: ");
        int numero = scanner.nextInt();
        scanner.close();

        long fatorial = 1; // usamos long para suportar números maiores

        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // multiplicamos fatorial pelo contador
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
