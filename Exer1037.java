import java.util.Scanner;

public class Exer1037 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    
    double a;
    String intervalo;

    intervalo = "Fora de intervalo";
    a = teclado.nextDouble();
 

    if ((a >= 0) && (a <= 25)) { 
       intervalo = "Intervalo [0,25]";  
    } 
    if ((a > 25) && ( a <= 50)) { 
         intervalo = "Intervalo (25,50]"; 
    } 
    if ((a > 50) && (a <= 75))  {  
         intervalo = "Intervalo (50,75]"; 
    } 
    if ((a > 75) && (a <= 100))  {  
         intervalo = "Intervalo (75,100]"; 
    } 
    
    System.out.println(intervalo);
    }
}