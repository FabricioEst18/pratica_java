package CursoJava.OrientacaoObjeto.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    /*
    Vai no atributo quantity e altera o valor dele,para isso acontecer devemos DIFERENCIAR o atributo do argumento
    que são iguais(quantity).Para referenciar o atributo da classe,usamos a palavra reservada this
    this-> Autoreferência para o objeto
     */
    public void addProduct(int quantity){
        this.quantity += quantity; //soma do quantity da class + quantity do parâmetro
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity; //subtração do quantity da class - quantity do parâmetro
    }

    //Como nossa classe Product também é um Object,estamos SOBREPONDO a operação toString que vem no Object
    //Poderemos implementar assim A NOSSA VERSÃO do toString()

    //String.format() -> similar ao printf,formata os dados da forma que quisermos
    public  String toString(){
        return name + " , $ " + String.format("%.2f%", price) + " , " + quantity + " units, Total: $ " + String.format("%.2f%", totalValueInStock());
    }
}
