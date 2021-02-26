import java.util.Scanner;

public class Exer2787 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    
    int L, C;
    double contaL, contaC;
   
    
    L = teclado.nextInt();
    C = teclado.nextInt();

    contaL = L % 2;
    contaC = C % 2;
    
        if ( (contaL != 0) && (contaC != 0) ) {
            System.out.printf("1\n");
        }
        if ( (contaL != 0) && (contaC == 0) ) {
            System.out.printf("0\n");
        }
        if ( (contaL == 0) && (contaC != 0) ) {
            System.out.printf("0\n");
        }
        if ( (contaL == 0) && (contaC == 0) ) {
            System.out.printf("1\n");
        }
    }
}