package Exercicios_basicos;

import java.util.Scanner;

public class MaiorDosTres {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float numero1 = scanner.nextFloat();
        System.out.println("Digite o segundo número: ");
        float numero2 = scanner.nextFloat();
        System.out.println("Digite o terceiro número: ");
        float numero3 = scanner.nextFloat();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O número " + numero1 + " é o maior dos três números");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número " + numero2 + " é o maior dos três números");
        } else {
            System.out.println("O número " + numero3 + " é o maior dos três números");
        }
        scanner.close();
    }
}
