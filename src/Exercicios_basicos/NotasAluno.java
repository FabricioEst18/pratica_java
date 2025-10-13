import java.util.Scanner;

public class NotasAluno {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota de 0 a 100:");
        int nota = scanner.nextInt();

        if (nota > 90){
            System.out.println("NOTA A: Excelente");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("NOTA B: Acima da média");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("NOTA C: Média");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("NOTA D: Abaixo da média");
        } else {
            System.out.println("NOTA F: Reprovado");
        }
        scanner.close();
    }
}
