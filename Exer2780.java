import java.util.Scanner;

public class Exer2780 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    
    int D, cesta;

    cesta = 0;
    D = teclado.nextInt();
 

    if (D <= 800) { 
         cesta = 1;  
    } 
    if ((D > 800) && ( D <= 1400)) { 
        cesta = 2;
    } 
    if ((D > 1400) && (D <= 2000))  {  
        cesta = 3; 
    } 
    
    System.out.println(cesta);
    }
}