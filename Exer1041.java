import java.util.Scanner;

public class Exer1041 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    
    double x, y;
    String texto;


    x = teclado.nextDouble();
    y = teclado.nextDouble();
    texto = "";

    if ((x == 0) || (y == 0)) {
        if ((x == 0) && (y == 0)) texto = "Origem\n";  
            else if ((x == 0) && (y != 0)) texto = "Eixo Y\n"; 
                 else if ((y == 0) && (x != 0)) texto = "Eixo X\n"; 
    }
    
    if ((x > 0) && (y > 0))  {  
         texto = "Q1\n"; 
    } 
    if ((x > 0) && (y < 0))  {  
         texto = "Q4\n"; 
    } 
    if ((x < 0) && (y > 0))  {  
         texto = "Q2\n"; 
    } 
    if ((x < 0) && (y < 0))  {  
         texto = "Q3\n"; 
    } 
    
    System.out.println(texto);
    }
    
}