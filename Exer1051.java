import java.util.Scanner;

public class Exer1051 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    double salario, imposto;
   
    salario = teclado.nextDouble();
    imposto = 0.0;
    
        if ( (salario>=0.00) && (salario<=2000.00) ) {
            System.out.printf("Isento\n");
        }
        if ( (salario>=2000.01) && (salario<=3000.00) ) {
            imposto = ( ( (salario - 2000.00) * 8)) / 100;
            System.out.printf("R$ %.2f\n", imposto);
        }
        if ( (salario>=3000.01) && (salario<=4500.00) ) {
           imposto = ((salario - 3000.00) * 0.18) + 80.00;
           System.out.printf("R$ %.2f\n", imposto);
        }
        if ( salario>4500 ) {
            imposto = ((salario - 4500.00) * 0.28) + 80.00 + 270.00;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}