package Controle_fluxo_loops;

import java.util.Scanner;

public class SomaNumeros {
    static void main(String[] args) {
        //Soma de números: Leia números até o usuário digitar 0 e mostre a soma total.
        Scanner input = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite números para somar (0 para sair):");

        while (true) {
            numero = input.nextInt();

            if (numero == 0) {
                break; // encerra o loop
            }

            soma += numero;
        }

        System.out.println("Soma total: " + soma);
        input.close();
    }
}
