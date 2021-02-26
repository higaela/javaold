import java.util.Scanner;

public class Exer1014 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int X;
    double Y, TOTAL;

    X = teclado.nextInt();
    Y = teclado.nextDouble();
   
    TOTAL = (X / Y);

    System.out.printf("%.3f km/l\n", TOTAL);

    }
}