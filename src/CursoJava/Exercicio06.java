package CursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    static void main(String[] args) {
        float A;
        float B;
        float C;
        float pi = 3.14159F;
        float areaTrianguloRetangulo;
        float areaCirculo;
        float areaTrapezio;
        float areaQuadrado;
        float areaRetangulo;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = scanner.nextFloat();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextFloat();
        System.out.println("Digite o valor de C: ");
        C = scanner.nextFloat();

        areaTrianguloRetangulo = (A * C) / 2;
        areaCirculo = (C * C) * pi;
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.printf("TRIÂNGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETÂNGULO: %.3f%n", areaRetangulo);

        scanner.close();
    }
}
