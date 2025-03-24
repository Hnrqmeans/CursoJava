import java.util.Locale;
import java.util.Scanner;

import Entidades.Produtos;

public class Construtor {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter product Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.println("Enter product Price: ");
        System.out.print("Price: ");
        double Price = sc.nextDouble();
        Produtos produtos = new Produtos(name, Price);

        produtos.setName("Computer");
        System.out.println("Updated name: " + produtos.getName());
        produtos.setPrice(1200.00);
        System.out.println("Updated price: " + produtos.getPrice());

        System.out.println("Enter product Quantity in Stock: ");
        System.out.print("Quantity: ");
        int Quantity = sc.nextInt();
        //Produtos produtos = new Produtos(name, Price, Quantity);

        System.out.println("Product Data: " + produtos);
        System.out.println();
        System.err.print("Enter the number of products to be added in stock: ");
        
        Quantity = sc.nextInt();
        produtos.addedProducts(Quantity);

        System.out.println();
        System.out.println("Updated data: " + produtos);

        System.out.println("Product Data: " + produtos);
        System.out.println();
        System.err.print("Enter the number of products to be remmoved in stock: ");
        
        Quantity = sc.nextInt();
        produtos.removedProducts(Quantity);

        System.out.println();
        System.out.println("Updated data: " + produtos);

        //System.out.printf("Product: %s, Price: $ %.2f, Quantity: %d", product.name, product.Price, product.Quantity);





        sc.close();

    }
}
