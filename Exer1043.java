import java.util.Scanner;

public class Exer1043 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    
    double A, B, C, conta;
    
    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();

    conta = 0.0;
    
   
        if ( ((A+B)>C) && ((A+C)>B) && ((B+C)>A) ) {
            conta = A + B + C;
            System.out.printf("Perimetro = %.1f\n", conta);
        }
        else {
             conta = ((A + B)*C);
             conta = conta/2;
             System.out.printf("Area = %.1f\n", conta);
        } 

    }
}