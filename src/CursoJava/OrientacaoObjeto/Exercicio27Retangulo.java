package CursoJava.OrientacaoObjeto;

import CursoJava.OrientacaoObjeto.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio27Retangulo {
    /*
    Fazer um programa para ler os valores da largura e altura
    de um retângulo. Em seguida, mostrar na tela o valor de
    sua área, perímetro e diagonal. Usar uma classe como
    mostrado no projeto ao lado.
     */
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo= new Retangulo();

        System.out.println("Enter rectangle width and height:");
        retangulo.width = scanner.nextDouble();
        retangulo.height = scanner.nextDouble();

        System.out.println(retangulo);

        scanner.close();
    }
}
