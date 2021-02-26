import java.util.Scanner;
public class Exer1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, alcool, gasolina, diesel;
        
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        x = 0;
        
        while (x!=4)  {
            
            x = teclado.nextInt();
        
            if ( x == 1 ) alcool++;
            if ( x == 2 ) gasolina++;
            if ( x == 3 ) diesel++;
            if ( x == 4 ) break;
            
        } 

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }

}