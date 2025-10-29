package CursoJava.OrientacaoObjeto;

import CursoJava.OrientacaoObjeto.entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio29Student {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter your name: ");
        student.name = scanner.nextLine();

        System.out.println("Enter your three trimester grades:");
        student.nota1 = scanner.nextFloat();
        student.nota2 = scanner.nextFloat();
        student.nota3 = scanner.nextFloat();

        System.out.println();
        System.out.println(student);

        scanner.close();
    }
}
