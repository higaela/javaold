import java.util.Scanner;
public class Exer1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, cont;

        cont = 1;
        a = teclado.nextInt();
    
        while ( cont <=6) {
             if (a % 2 != 0) { System.out.printf("%d\n", a); cont++; }
             a++;
        } 
    }
}