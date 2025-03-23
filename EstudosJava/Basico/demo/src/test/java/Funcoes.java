import java.util.Scanner;


public class Funcoes { //Bloco de uma classe
    public static void main(String[] args) {  //Função principal
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite três números: "); 

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c); //Chama a função max e atribui o valor retornado à variável higher
        showResult(higher); //Chama a função showResult e passa o valor da variável higher como argumento

        sc.close(); 
    }

    public static int max(int x, int y, int z) { //Função que retorna um valor inteiro
        int aux;
        if (x > y && x > z) { 
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux; //Retorna o valor da variável aux
    }
    public static void showResult(int value) { //Função que não retorna valor
        System.out.println("Higher = " + value); //Imprime o valor da variável value
    }
}

