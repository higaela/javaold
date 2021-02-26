import java.util.Scanner;
public class Exer1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a,  par, impar, positivo, negativo;
        
        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;

        for (int cont = 1; cont <= 5; cont++ ) {
        a = teclado.nextInt();
        if (a % 2 == 0) par++; else impar++;
        if (a < 0) negativo++; else if (a > 0) positivo++;
        }
        
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
}