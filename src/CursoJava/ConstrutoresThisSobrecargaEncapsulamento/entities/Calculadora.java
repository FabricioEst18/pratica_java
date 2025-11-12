package CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities;

public class Calculadora {
    //Como não iremos usar os valores de a,b,c para alguma operação depois, não é necessário passa-los como atributos e
    // nem colocar os construtores.Essa classe é uma classe ESTÁTICA -> métodos estáticos ou de instância que fazem os cálculos.

    //Método somar int a + int b
    public int somar(int a, int b){
        return  a + b;
    }

    //Método somar double a + double b
    public double somar(double a, double b){
        return a + b;
    }

    //Método somar int a + int b + int c
    public int somar(int a, int b, int c){
        return a + b + c;
    }


}
