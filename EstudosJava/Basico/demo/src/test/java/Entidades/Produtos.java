package Entidades;

public class Produtos {

    public String name;
    public Double Price; //atributos
    public int Quantity;

    public Produtos (String name, double Price, int Quantity){//construtor
        this.name = name;
        this.Price = Price;
        this.Quantity = Quantity;
    }

public double totalValue(){  //metodos
    return Price*Quantity;
}
public void addedProducts(int Quantity){
    this.Quantity += Quantity; //This --> vai somar Quantity argumento com o Quantity da Classe
}
public void removedProducts(int Quantity){
    this.Quantity -= Quantity;
}
public String toString(){
   return name + ", $ " + String.format("%.2f", Price) + ", " + Quantity + " Units, Total: $ " + String.format("%.2f", totalValue()); 

}

}
