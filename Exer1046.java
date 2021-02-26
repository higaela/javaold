import java.util.Scanner;

public class Exer1046 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    
    int hi, hf, horas;
    String texto;

    
    hi = teclado.nextInt();
    hf = teclado.nextInt();
 

        if (hi == hf) {
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        } 
        else {
            if ((hi < hf) || (hf == 0)) {
                if (hf == 0) hf=24;
                horas = hf - hi;
                System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
            }  else
            {
                horas = (24 - hi) + hf;
                System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
            }
        }
    }
}