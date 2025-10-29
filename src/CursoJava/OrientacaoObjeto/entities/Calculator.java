package CursoJava.OrientacaoObjeto.entities;

// Classe utilitária para cálculos geométricos envolvendo um círculo e uma esfera.
// Demonstra o uso de membros estáticos (atributos e métodos).
public class Calculator {

    // Constante estática representando o valor de PI.
    // 'final' significa que o valor não pode ser alterado.
    // 'static' permite o acesso direto via nome da classe, sem precisar criar objetos.
    public static final double PI = 3.14159;

    // Método estático para calcular a circunferência de um círculo.
    // Fórmula: 2 * π * raio
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    // Método estático para calcular o volume de uma esfera.
    // Fórmula: (4 * π * raio³) / 3
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
