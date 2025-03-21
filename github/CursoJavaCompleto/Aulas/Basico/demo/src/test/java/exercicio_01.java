import java.util.Locale;

public class exercicio_01 {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US)
        String produto1 = "Computador";
        String produto2 = "Mesa";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.00;
        double preco2 = 650.00;
        double medida = 53.1234567;


        System.out.println("Produtos:");
        System.out.printf("%s, Custa R$%.2f \n",produto1,preco1);
        System.out.printf("%s, Custa R$%.2f %n",produto2,preco2);
        System.out.printf("%d, Anos de idade, Codigo %d, Genero %s", idade, codigo, genero);
        
    }
}
