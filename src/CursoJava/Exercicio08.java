package CursoJava;

import java.util.Scanner;

public class Exercicio08 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int calculoMultiplos;

        System.out.println("Digite o valor de A: ");
        A = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextInt();

        if ((A % B == 0) || (B % A == 0 )){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        scanner.close();
    }
}
