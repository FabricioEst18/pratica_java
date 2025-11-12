package CursoJava.ConstrutoresThisSobrecargaEncapsulamento;

import CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio34Calculadora {
    static void main(String[] args) {

        //Locale para aceitar dados no formato US com "."
        Locale.setDefault(Locale.US);

        //Método Scanner para fazer a leitura da entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Instância do objeto Calculadora
        Calculadora calculadora = new Calculadora();

        //Entrada dos dados
        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();

        //Chamada do método somar para somar os dados digitados pelo usuário
        System.out.println(calculadora.somar(a, b, c));

        scanner.close();
    }
}
