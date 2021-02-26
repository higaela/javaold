import java.util.Scanner;
public class Exer1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, cont, exp;

        cont = 1;
        exp = 0;

        a = teclado.nextInt();
      

        while ( cont <=a) {
             if (cont % 2 == 0) { exp = cont * cont; System.out.printf("%d^2 = %d\n", cont, exp); }
             cont++;
        } 
    }
}