package CursoJava.OrientacaoObjeto;

import CursoJava.OrientacaoObjeto.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio28Employee {
    /*
    Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
    seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
    salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
    afetado pela porcentagem) e mostrar novamente os dados do funcionário.
     */
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = scanner.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.println("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println(employee);
        System.out.println("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);


        scanner.close();
    }
}
