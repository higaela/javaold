import java.util.Scanner;

public class Exer1050 {

    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int DDD;
    String SDDD;

    DDD = teclado.nextInt();

    switch (DDD) {
        case 61:
            SDDD = "Brasilia";
            break;
        case 71:
            SDDD = "Salvador";
            break;    
        case 11:
            SDDD = "Sao Paulo";
            break;
        case 21:
            SDDD = "Rio de Janeiro";
            break;
        case 32:
            SDDD = "Juiz de Fora";
            break;
        case 19:
            SDDD = "Campinas";
            break;
        case 27:
            SDDD = "Vitoria";
            break;
        case 31:
            SDDD = "Belo Horizonte";
            break;
        default:
            SDDD = "DDD nao cadastrado";
    }
    System.out.println(SDDD);
    }
}