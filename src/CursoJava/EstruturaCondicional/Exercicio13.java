package CursoJava.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double renda;
        double imposto;

        System.out.println("Digite qual é sua renda(com duas casas decimais): ");
        renda = scanner.nextDouble();

        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (renda <= 4500.00) {
            imposto = (1000.00 * 0.08) + ((renda - 3000.00) * 0.18);
            System.out.printf("R$ %.2f%n", imposto);
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((renda - 4500.00) * 0.28);
            System.out.printf("R$ %.2f%n", imposto);
        }
        scanner.close();
    }
}
