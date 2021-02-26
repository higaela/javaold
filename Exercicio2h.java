
import java.util.Scanner;

public class Exercicio2h {

    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);

    double volume;
    double raio;
    double altura;
    double pi;

    pi = 3.14;

    do { 
        System.out.print("Digite raio do cilindro= ");
        raio = teclado.nextDouble();
    } while (raio < 1);
    
    do {
         System.out.print("Digite altura do cilindro = ");
         altura = teclado.nextDouble();
    } while (altura < 1);
    
    volume = pi * raio * raio * altura;

    System.out.println ("Volume do Cilindro (pi * " + raio + " " + raio + " " + altura + ")  = " + volume);

    System.out.println ("Tenha um ótimo dia!");

    }
}