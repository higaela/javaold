import java.util.Scanner;
public class Exer1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a;
        
        a=0;

        while (a!=2002) {
             a = teclado.nextInt();
             if (a == 2002) {
                 System.out.println("Acesso Permitido");
                 break;
             } 
             else {
                 System.out.println("Senha Invalida");
             }
        } 
    }
}