import java.util.Scanner;

public class Exer1020 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int N, A, M, D, TEMP;

    N = teclado.nextInt();

    A = N/365;
    TEMP = N % 365;
    M = TEMP/30;
    D = TEMP % 30;


    System.out.println(A + " ano(s)");
    System.out.println(M + " mes(es)");
    System.out.println(D + " dia(s)");

    }
}