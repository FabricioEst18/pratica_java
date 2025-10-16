package CursoJava;

import java.util.Scanner;

public class Exercicio09 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Digite a hora inicial: ");
        horaInicial = scanner.nextInt();
        System.out.println("Digite a hora final: ");
        horaFinal = scanner.nextInt();

        if (horaFinal > horaInicial){
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou " + duracao + " hora(s)");
        } else if(horaFinal == horaInicial){
            System.out.println("O jogo durou 24 horas");
        } else if (horaFinal < horaInicial){
            duracao = (24 - horaInicial) + horaFinal;
            System.out.println("O jogo durou " + duracao + " hora(s)");
        }
        scanner.close();
    }
}
