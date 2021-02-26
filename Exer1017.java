import java.util.Scanner;

public class Exer1017 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    double X, Y;
    double TOTAL;

    X = teclado.nextInt();
    Y = teclado.nextInt();
   
    TOTAL = (X * Y)/12;

    System.out.printf("%.3f\n", TOTAL);

    }
}