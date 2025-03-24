import java.util.Locale;
import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {
        
        //Arranjo unidimensionais
        /*  Estrutura de dados
            Homogenea = dados do mesmo tipo
            ordenada = elementos acessados por meio de posicoes
            Alocada de uma vez só, em um bloco contiguo de memoria

            //Vantagens acesso imediato aos elementos pela sua posicao
            //Descantagens tamanho fixo, Dificuldade para se realiza insercoes e delecoes!
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        double [] vect = new double[n];
        
        for (int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
        }

        double  sum =0.0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.println(avg);

        sc.close();

    }
}
