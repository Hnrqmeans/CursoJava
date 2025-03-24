
//Este exercicio esta vinculado a Entidades/Triangulo
import java.util.Scanner;

import Entidades.Triangulo;

public class Exercicio01 {
    public static void main(String[] args) {
        
//------------------------------------------------//
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
//------------------------------------------------//
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
//------------------------------------------------//

        double areax = x.area(); 
        double areay = y.area();

//------------------------------------------------//
        System.out.println("Area do Triangulo X: " + areax);
        System.out.println("Area do Triangulo Y: " + areay);

        if (areax > areay){
            System.out.println("O Triangulo X é maior");
        }else{
            System.out.println("O Triangulo Y é maior");
        }
//------------------------------------------------//
        sc.close();
    }
}
