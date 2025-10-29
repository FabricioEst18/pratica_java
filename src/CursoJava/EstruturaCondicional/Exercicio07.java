package CursoJava.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro qualquer: ");
        numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        scanner.close();
    }
}
