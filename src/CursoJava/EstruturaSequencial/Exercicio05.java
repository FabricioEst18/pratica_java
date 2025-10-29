package CursoJava.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    static void main(String[] args) {
        int codigoPeca1;
        int numeroPecas1;
        float valorUnidadePecas1;
        float calculoPecas1;
        int codigoPeca2;
        int numeroPecas2;
        float valorUnidadePecas2;
        float calculoPecas2;
        float valorTotalPagar;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código da peça 1: ");
        codigoPeca1 = scanner.nextInt();
        System.out.println("Digite o número de peças 1 que foram pegas: ");
        numeroPecas1 = scanner.nextInt();
        System.out.println("Digite o valor da unidade da peça 1: ");
        valorUnidadePecas1 = scanner.nextFloat();
        calculoPecas1 = numeroPecas1 * valorUnidadePecas1;

        System.out.println("Digite o código da peça 2: ");
        codigoPeca2 = scanner.nextInt();
        System.out.println("Digite o número de peças 2 que foram pegas: ");
        numeroPecas2 = scanner.nextInt();
        System.out.println("Digite o valor da unidade da peça 2: ");
        valorUnidadePecas2 = scanner.nextFloat();
        calculoPecas2 = numeroPecas2 * valorUnidadePecas2;

        valorTotalPagar = calculoPecas1 + calculoPecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotalPagar);
        scanner.close();
    }
}
