package CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities;

public class Motor {

    //Atributos da classe Motor
    private int potencia;
    private String tipoCombustivel;

    //Construtor da classe Motor
    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    //Métodos de acesso(getters)
    public int getPotencia() {
        return potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    //Método toString() para descrever o motor do carro
    public String toString() {
        return "Potência: " + potencia + "cv, Combustível: " + tipoCombustivel;
    }
}
