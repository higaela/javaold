import java.util.Scanner;

public class Exercicio2a {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int lado;
        int area;

        System.out.print("Digite lado do quadrado = ");
        lado = teclado.nextInt();

        area = lado * lado;  
        
        System.out.println("Area do quadrado =" + area);
    }
}
