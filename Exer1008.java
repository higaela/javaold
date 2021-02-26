import java.util.Scanner;

public class Exer1008 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int NUMERO, HORAS;
    double VALORHORA, SALARIO;

    NUMERO = teclado.nextInt();
    HORAS = teclado.nextInt();
    VALORHORA = teclado.nextDouble();
   
   
    SALARIO = (HORAS * VALORHORA);

    System.out.println("NUMBER = " + NUMERO);
    System.out.printf("SALARY = U$ %.2f\n", SALARIO);

    }
}