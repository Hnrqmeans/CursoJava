import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();


        //for (inicio; condição; incremento) {
        //    comando 1
        //    comando 2
        
        for (int i = 0; i < x ; i++) {
            System.out.println(i);
        }
        
        sc.close();
}}
