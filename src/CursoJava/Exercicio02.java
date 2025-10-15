package CursoJava;

import java.util.Scanner;

public class Exercicio02 {
    static void main(String[] args) {
        float raio;
        float area;
        float pi = 3.14159F;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio do circulo: ");
        raio = scanner.nextFloat();
        area = pi * (raio * raio);
        System.out.printf("%.4f%n", area);
        scanner.close();
    }
}
