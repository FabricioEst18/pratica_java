package CursoJava;

import java.util.Scanner;

public class Exercicio15 {
    static void main(String[] args) {
        /*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
        * Para cada leitura de senha incorreta, escrever a mensagem "Senha Invalida".
        * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
        * e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */

        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 2002;
        int tentativa;

        do {
            System.out.print("Digite sua senha: ");
            tentativa = scanner.nextInt();

            if (tentativa != senhaCorreta) {
                System.out.println("Senha Invalida");
            }

        } while (tentativa != senhaCorreta);

        System.out.println("Acesso Permitido");
        scanner.close();
    }
}
