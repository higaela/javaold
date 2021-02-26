
import java.util.Scanner;

public class Exercicio2e {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float basemenor;
        float basemaior;
        float altura;
        float area;

        System.out.print("Digite base menor do trapezio = ");
        basemenor = teclado.nextFloat();

        System.out.print("Digite base maior do trapezio = ");
        basemaior = teclado.nextFloat();
      
        System.out.print("Digite altura do trapezio = ");
        altura = teclado.nextFloat();

        area = (basemaior + basemenor) * altura/2;  
        
        System.out.println("Area trapezio = " + area);
    }
}