package Entidades;

public class Product {

    public String name;
    public Double Price;
    public int Quantity;

public double totalValue(){
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
