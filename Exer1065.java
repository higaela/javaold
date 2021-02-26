import java.util.Scanner;
public class Exer1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a,cont,cont1;
        cont1=0;

        for (cont = 1; cont <= 5; cont++ ) {
        a = teclado.nextInt();
        if (a % 2 == 0) cont1++;
        }
        
        System.out.printf("%d valores pares\n", cont1);
    }
}