import java.util.Scanner;
public class Exer1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a,  cont;
        a = teclado.nextInt();
    
        for ( cont = 1; cont <= a; cont++) {
             if (cont % 2 != 0)  System.out.printf("%d\n", cont); 
        } 
    }
}