import java.util.Locale;
import java.util.Scanner;

import Entidades.Product;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Product product = new Product();
        System.out.println("Enter product Data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.println("Enter product Price: ");
        System.out.print("Price: ");
        product.Price = sc.nextDouble();

        System.out.println("Enter product Quantity in Stock: ");
        System.out.print("Quantity: ");
        product.Quantity = sc.nextInt();

        System.out.println("Product Data: " + product);
        System.out.println();
        System.err.print("Enter the number of products to be added in stock: ");
        
        int Quantity = sc.nextInt();
        product.addedProducts(Quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println("Product Data: " + product);
        System.out.println();
        System.err.print("Enter the number of products to be remmoved in stock: ");
        
        Quantity = sc.nextInt();
        product.removedProducts(Quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        //System.out.printf("Product: %s, Price: $ %.2f, Quantity: %d", product.name, product.Price, product.Quantity);





        sc.close();

    }
}
