package CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities;

public class Pessoa {
    //Atributos da classe pessoa
    private String nome;
    private int idade;

    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos de acesso(getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método 'apresentar' para retornar o nome e idade da pessoa
    public String toString(){
        return "Olá, meu nome é " + nome + " e tenho " + idade + " anos.";
    }
}
