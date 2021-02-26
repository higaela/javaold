
import java.util.Scanner;

public class Exercicio2c {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float base;
        float altura;
        float area;

        System.out.print("Digite base do triangulo = ");
        base = teclado.nextFloat();
      
        System.out.print("Digite altura do triangulo = ");
        altura = teclado.nextFloat();

        area = (base * altura)/2;  
        
        System.out.println("Area triangulo = " + area);
    }
}