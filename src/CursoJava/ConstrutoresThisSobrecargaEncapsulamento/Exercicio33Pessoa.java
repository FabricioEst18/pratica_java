package CursoJava.ConstrutoresThisSobrecargaEncapsulamento;
import CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities.Pessoa;

import java.util.Scanner;

public class Exercicio33Pessoa {
    static void main(String[] args) {
        //Método Scanner para fazer a leitura da entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Instância do objeto Pessoa
        Pessoa pessoa;

        //Entrada dos dados do objeto pessoa
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        pessoa = new Pessoa(nome, idade);

        //Impressão dos dados por meio do método toString()
        System.out.println();
        System.out.println(pessoa);

        scanner.close();
    }
}
