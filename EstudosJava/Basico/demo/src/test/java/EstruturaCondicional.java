import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(SobreString[] args) {
    //--------------------------------//   
        Scanner sc = new Scanner (System.in); 
        int hora;
    //--------------------------------//
        System.out.println("Que horas são? ");
        hora = sc.nextInt();
    //--------------------------------//

        if(hora < 12 ){  //Condicional Simples
            System.out.println("Bom dia!");}
            else if(hora <= 18){
            System.out.println("Boa tarde!");}
            else{
            System.out.println("Boa noite!");
            }
    
        sc.close();  
        }
    }
