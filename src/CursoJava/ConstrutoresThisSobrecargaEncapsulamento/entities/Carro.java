package CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities;

public class Carro {

    //Atributos da classe Carro
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    //Construtor com os parâmetros da classe Carro e também tem como parâmetro a classe Motor
    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    //Método para ligar o carro
    public void ligar(){
        System.out.println("O carro está ligado!");
    }

    // Método que retorna a descrição do carro
    public String mostrarInfo() {
        return "Carro: " + marca + " " + modelo + " (" + ano + ")\n" +
                "Motor: " + motor.toString();
    }
}
