import java.util.Scanner;

public class Exer1019 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int N, H, M, S, TEMP;

    N = teclado.nextInt();

    H = N/3600;
    TEMP = N % 3600;
    M = TEMP/60;
    S = TEMP % 60;


    System.out.println(H + ":" + M + ":" + S);

    }
}