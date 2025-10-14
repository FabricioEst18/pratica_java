package Controle_fluxo_loops;

import java.util.Scanner;

public class Fatorial2 {
    //Fatorial: Leia um número e calcule seu fatorial usando for e depois while.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número e iremos calcular seu fatorial: ");
        int numero = scanner.nextInt();
        scanner.close();

        long fatorial = 1; // variável para guardar o resultado
        int i = 1; // contador

        while (i <= numero) {
            fatorial *= i; // multiplicamos fatorial pelo contador
            i++; // incrementa o contador
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
