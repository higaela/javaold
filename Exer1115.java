import java.util.Scanner;
public class Exer1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x,y;
        
        x=0;
        y=0;

        x = teclado.nextInt();
        y = teclado.nextInt();
        
        while ( (x!=0) && (y!=0) ) {
             
            if ( (x > 0) && (y > 0) ) System.out.println("primeiro");
            if ( (x < 0) && (y > 0) ) System.out.println("segundo");
            if ( (x > 0) && (y < 0) ) System.out.println("quarto");
            if ( (x < 0) && (y < 0) ) System.out.println("terceiro");

             x = teclado.nextInt();
             y = teclado.nextInt();
        } 
    }
}