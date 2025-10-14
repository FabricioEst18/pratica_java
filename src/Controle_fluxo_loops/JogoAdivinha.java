package Controle_fluxo_loops;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // gera de 1 a 100
        int tentativa;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número (entre 1 e 100):");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = input.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }

        } while (tentativa != numeroSecreto);

        input.close();
    }
}
