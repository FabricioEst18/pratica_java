package CursoJava.OrientacaoObjeto.entities;

public class Triangule {
    //Declaração dos 3 atributos(dados/campos) da minha class Triangule
    public double a;
    public double b;
    public double c;

    //Criação de método/função que irá calcular a área do triângulo
    public double area(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
