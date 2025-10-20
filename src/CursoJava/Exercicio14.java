package CursoJava;

import java.util.Scanner;

public class Exercicio14 {
    static void main(String[] args) {
        //Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        int soma = 0;
        while (numero != 0){
            System.out.println("Digite outro número: ");
            soma += numero;
            numero = scanner.nextInt();
        }
        System.out.println(soma);
        scanner.close();
    }
}
