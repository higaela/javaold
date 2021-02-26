import java.util.Scanner;

public class Leitura {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a;
        double b;

        System.out.print("Digite inteiro ");
        a = teclado.nextInt();
        System.out.println(a);

        System.out.print("Digite double ");
        b = teclado.nextDouble();
        System.out.println(b);
    }
}