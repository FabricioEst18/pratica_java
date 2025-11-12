package CursoJava.ConstrutoresThisSobrecargaEncapsulamento;

import CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities.Carro;
import CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities.Motor;

import java.util.Scanner;

public class Exercicio35Carro {
    static void main(String[] args) {

        //Início do método Scanner
        Scanner scanner = new Scanner(System.in);

        // Cria o motor: entrada dos dados com as informações do motor do carro
        System.out.print("Potência do motor (cv): ");
        int potencia = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha
        System.out.print("Tipo de combustível: ");
        String combustivel = scanner.nextLine();

        //Instância da classe Motor
        Motor motor = new Motor(potencia, combustivel);

        // Cria o carro: entrada dos dados específicos do veículo
        System.out.print("Marca do carro: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        //Instância da classe Carro,após já ter passado os dados do motor
        Carro carro = new Carro(marca, modelo, ano, motor);

        System.out.println();

        //Chamada do método de ligar o carro
        carro.ligar();

        //Chamada do método para imprimir as informações do Carro
        System.out.println(carro.mostrarInfo());

        scanner.close();
    }
}
