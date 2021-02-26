import java.util.Scanner;

public class Exer1018 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    
    int N, TEMP, CEM, CINQUENTA, VINTE, DEZ, CINCO, DOIS, UM;

    N = teclado.nextInt();

    CEM = N/100;
    TEMP = N % 100;
    
    CINQUENTA = TEMP/50;
    TEMP = TEMP % 50;

    VINTE = TEMP/20;
    TEMP = TEMP % 20;
 
    DEZ = TEMP/10;
    TEMP = TEMP % 10;

    CINCO = TEMP/5;
    TEMP = TEMP % 5;
    
    DOIS = TEMP/2;
    UM = TEMP % 2;

    System.out.printf("%s\n", N);
    System.out.printf("%s nota(s) de R$ 100,00\n", CEM);
    System.out.printf("%s nota(s) de R$ 50,00\n", CINQUENTA); 
    System.out.printf("%s nota(s) de R$ 20,00\n", VINTE);
    System.out.printf("%s nota(s) de R$ 10,00\n", DEZ);
    System.out.printf("%s nota(s) de R$ 5,00\n", CINCO);
    System.out.printf("%s nota(s) de R$ 2,00\n", DOIS);
    System.out.printf("%s nota(s) de R$ 1,00\n", UM);
   }
}