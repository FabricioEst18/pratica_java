package CursoJava.OrientacaoObjeto;

import CursoJava.OrientacaoObjeto.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio26Product {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        /*
        Por a classe Product e qualquer outra classe que criarmos ser uma subclasse da classe Object,teremos muitas
        opções de membros da classe Object,por exemplo o toString()

        toString() -> Converte o objeto para String
         */
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        //Variável que o usuário irá digitar e passaremos como parâmetro na hora de executar o método addProduct da classe Product
        int quantity = scanner.nextInt();
        //Atualização da quantidade dentro do Objeto Product
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        //Variável que o usuário irá digitar e passaremos como parâmetro na hora de executar o método removeProduct da classe Product
        quantity = scanner.nextInt();
        //Atualização da quantidade dentro do Objeto Product
        product.removeProducts(quantity);

        scanner.close();

    }
}
