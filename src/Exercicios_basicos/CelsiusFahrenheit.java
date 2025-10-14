package Exercicios_basicos;

import java.util.Scanner;

public class CelsiusFahrenheit {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        float temperatura = scanner.nextFloat();

        double fahrenheit = (1.8 * temperatura) + 32;
        System.out.println(temperatura + " Celsius em Fahrenheit é igual a " + fahrenheit);
        scanner.close();
    }
}
