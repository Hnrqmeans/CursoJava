import java.util.Scanner;

public class While {
    public static void main(SobreString[] args) {
        
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = 0;

        //while (condição) {
        //    comando 1
        while (x != 0) {
            y += x;
            x = sc.nextInt();
        }
        System.out.printf("A soma dos numeros foi: %d", y);
        sc.close();
    }
}
