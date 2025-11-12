package CursoJava.ConstrutoresThisSobrecargaEncapsulamento.entities;

public class Account {

    //Atributos da classe(private SEMPRE)
    private int numeroConta;
    private String titularConta;
    private double saldo;

    //Construtor que recebe 3 parâmetros
    public Account(int numeroConta, String titularConta, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        //Operação de depósito passando o depósito inicial como parâmetro
        deposito(depositoInicial);
    }

    //Construtor que recebe 2 parâmetros
    public Account(int numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }

    //Por nossos atributos serem private,precisamos criar os métodos de acesso(getters e setters)
    //saldo -> só é permitido ser obtido por meio do método GET(só pode mudar por meio de DEPÓSITO ou SAQUE)
    //titularConta -> é possível obter o nome ou alterar,por exemplo caso a pessoa case,ela mudará o nome
    //numeroConta -> só é possível obter o número da conta por meio do método GET(número da conta é ÚNICO)

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Método para depósito do usuário
    public void deposito(double valor){
        saldo += valor;
    }

    //Método para saque do usuário
    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    //toString para retornar os dados formatados corretamente
    public String toString() {
        return "Conta " + numeroConta + ", Titular da conta: " + titularConta + ", Saldo: $ " + String.format("%.2f", saldo);
    }
}
