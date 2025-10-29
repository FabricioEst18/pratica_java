package CursoJava.OrientacaoObjeto;

import CursoJava.OrientacaoObjeto.entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24Triangule {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangule x, y;

        x = new Triangule();
        y = new Triangule();

        System.out.println("Enter the measures of triangle X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //Chamado do método area() que irá calcular a área de cada um dos triângulos
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
