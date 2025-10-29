package CursoJava.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        float x;
        float y;

        System.out.println("Digite o valor de x (com uma casa decimal): ");
        x = scanner.nextFloat();
        System.out.println("Digite o valor de y (com uma casa decimal):");
        y = scanner.nextFloat();

        if ((x == 0) && (y == 0)) {
            System.out.println("Origem");
        } else if((x >= 0) && (y >= 0) ){
            System.out.println("Q1");
        } else if ((x <= 0) && (y >= 0)) {
            System.out.println("Q2");
        } else if ((x <= 0) && (y <= 0)) {
            System.out.println("Q3");
        } else if ((x >= 0) && (y <= 0)) {
            System.out.println("Q4");
        }
        scanner.close();
    }
}
