import java.util.Scanner;

public class Exer1048 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    double salario, nreajuste, nsalario;
    int reajuste;

    salario = teclado.nextDouble();
    reajuste = 0;

    if ((salario >= 0.0) && (salario <= 400.0)) { 
         reajuste = 15;  
    } 
    if ((salario >= 400.01) && (salario <= 800.00)) { 
        reajuste = 12;
    } 
    if ((salario >= 800.01) && (salario <= 1200.00))  { 
        reajuste = 10; 
    } 
    if ((salario >= 1200.01) && (salario <= 2000.00)) { 
        reajuste = 7;
    } 
    if (salario > 2000.00) { 
        reajuste = 4; 
    } 

    nreajuste = salario * reajuste / 100;
    nsalario = nreajuste + salario;


    System.out.printf("Novo salario: %.2f\n", nsalario);
    System.out.printf("Reajuste ganho: %.2f\n", nreajuste);
    System.out.printf("Em percentual: %d %%\n", reajuste);
    }
}