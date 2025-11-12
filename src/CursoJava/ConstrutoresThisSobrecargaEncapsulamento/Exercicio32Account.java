package CursoJava.ConstrutoresThisSobrecargaEncapsulamento;


import CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio32Account {
    static void main(String[] args) {
        //Locale US para aceitar dados com "."
        Locale.setDefault(Locale.US);
        //Inicio do método Scanner
        Scanner scanner = new Scanner(System.in);

        //Instância do objeto account
        Account account;

        //Entrada dos dados
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o nome do titular: ");
        scanner.nextLine();
        String titularConta = scanner.nextLine();
        System.out.print("Irá fazer algum depósito inicial (s/n)? ");
        char resposta =  scanner.next().charAt(0);

        //Condicional para saber se o usuário quer fazer um depoósito inicial ou não,dependendo da resposta,diferentes construtores(com sobrecarga) e métodos são usados
        if (resposta == 's' || resposta == 'S') {
            System.out.print("Digite o valor inicial de depósito: ");
            double depositoInicial = scanner.nextDouble();
            account = new Account(numeroConta, titularConta, depositoInicial);
        } else {
            account = new Account(numeroConta, titularConta);
        }

        //Impressão dos dados da conta do usuário
        System.out.println("Dados da conta: ");
        System.out.println(account);

        System.out.println();
        //Caso o usuário não faça um depósito inicila,o saldo será $ 0.00
        System.out.print("Digite um valor de depósito: ");
        double valorDeposito = scanner.nextDouble();

        //Chamada do método 'deposito' na classe Account para receber o valorDeposito e atualizar o saldo e impressão do objeto account
        account.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(account);

        //Chamada do método 'saque' na classe Account para receber o valorSaque e atualizar o saldo e impressão do objeto account
        System.out.println();
        System.out.print("Digite um valor de saque: ");
        double valorSaque = scanner.nextDouble();
        account.saque(valorSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(account);


        scanner.close();
    }
}
