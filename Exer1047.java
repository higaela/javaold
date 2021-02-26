import java.util.Scanner;
public class Exer1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, hF, mF, tempoI, tempoF, dur, durH, durM;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // passo 1 - converter tudo para minutos
        tempoI = hI * 60 + mI;
        tempoF = hF * 60 + mF;

        // passo 2 - subtrair sempre o final do inicial
        dur = tempoF - tempoI;

        // passo 3 - se a duração for menor ou igual a 0, significa que começou num dia e terminou no outro - somo 24h
        if (dur <= 0){
            dur = dur + 24*60;
        }

        // passo 4 - reconverter para hora/minuot
        durH = dur / 60;
        durM = dur % 60;

        System.out.println("O JOGO DUROU "+ durH+ " HORA(S) E "+durM+" MINUTO(S)");
    }
}