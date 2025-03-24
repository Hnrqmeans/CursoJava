package Entidades;

public class Produtos {

    private String name;
    private Double Price; //atributos
    private int Quantity;

    public Produtos (String name, double Price, int Quantity){//construtor
        this.name = name;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public Produtos(String name, double Price){
        this.name = name;
        this.Price = Price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return Price;
    }

    public void setPrice(double Price){
        this.Price = Price;
    }

    public int getQuantity(){
        return Quantity;    
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
