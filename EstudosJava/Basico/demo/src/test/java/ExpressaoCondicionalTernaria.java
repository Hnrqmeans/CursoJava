import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    public static void main(SobreString[] args) {
        Scanner sc = new Scanner(System.in);


        // double preco = 34.5;
        // double desconto;
        // if(preco < 20.0){
        //     desconto = preco * 0.1;
        // }
        // else{
        //     desconto = preco * 0.05;
        //}

        double preco = 100;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(preco);
        System.out.println(desconto);

        sc.close();

    }
}
