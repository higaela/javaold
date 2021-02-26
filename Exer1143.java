import java.util.Scanner;
public class Exer1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, linhas, temp;
        
        a = teclado.nextInt();
        linhas = 1;
        temp = 0;

        while (linhas <= a) {

            temp = linhas;
            System.out.printf("%d", temp);
            temp = linhas * linhas;
            System.out.printf(" %d", temp);
            temp = temp * linhas;
            System.out.printf(" %d\n", temp);

            linhas++;
        }
    }

}