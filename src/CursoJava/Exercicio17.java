package CursoJava;

import java.util.Scanner;

public class Exercicio17 {
    static void main(String[] args) {
        /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o utilizador informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.
        * */

        Scanner scanner = new Scanner(System.in);
        int codigoCombustivel;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        do {
            System.out.println("Digite o número do tipo de combustível: ");
            codigoCombustivel = scanner.nextInt();
            if (codigoCombustivel == 1){
                alcool +=  1;
            } else if (codigoCombustivel == 2) {
                gasolina += 1;
            } else if (codigoCombustivel == 3) {
                diesel += 1;
            } else if (codigoCombustivel == 4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
            } else {
                System.out.println("Código inválido");
            }
        }while (codigoCombustivel != 4);
        scanner.close();
    }
}
