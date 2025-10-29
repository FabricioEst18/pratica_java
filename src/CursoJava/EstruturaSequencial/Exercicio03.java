package CursoJava.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        int numero;
        int horasTrabalhadas;
        float valorHora;
        float salario;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número: ");
        numero = scanner.nextInt();
        System.out.println("Digite quantas horas você trabalhou: ");
        horasTrabalhadas = scanner.nextInt();
        System.out.println("Digite qual é o valor que você recebe por hora: ");
        valorHora = scanner.nextFloat();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NÚMERO: " + numero);
        System.out.printf("SALÁRIO: U$%.2f%n", salario);
        scanner.close();


    }
}
