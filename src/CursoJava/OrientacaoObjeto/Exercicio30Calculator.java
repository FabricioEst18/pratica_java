package CursoJava.OrientacaoObjeto;

import CursoJava.OrientacaoObjeto.entities.Calculator;
import java.util.Locale;
import java.util.Scanner;

// Classe principal que executa o programa de teste da classe Calculator.
// Demonstra como acessar membros estáticos diretamente a partir do nome da classe.
public class Exercicio30Calculator {

    // Método principal: ponto de entrada do programa.
    public static void main(String[] args) { // <--- 'public' é necessário para execução correta.
        Locale.setDefault(Locale.US); // Define o formato numérico padrão (ponto ao invés de vírgula).

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados pelo teclado.

        // OBS: Como os métodos da classe Calculator são estáticos,
        // não é necessário criar um objeto da classe.
        // A linha abaixo não é usada, mas deixada aqui apenas para demonstração.
        Calculator calc = new Calculator();

        System.out.print("Enter radius: "); // Solicita o valor do raio ao usuário.
        double radius = sc.nextDouble(); // Lê o valor informado.

        // Chama métodos estáticos da classe Calculator diretamente pelo nome da classe.
        double c = Calculator.circumference(radius); // Calcula a circunferência.
        double v = Calculator.volume(radius);        // Calcula o volume.

        // Exibe os resultados formatados com duas casas decimais.
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);

        // Exibe o valor de PI diretamente da classe.
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close(); // Fecha o Scanner para liberar recursos do sistema.
    }
}
