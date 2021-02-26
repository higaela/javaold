import java.util.Scanner;
public class Exer1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, b, c, a1, b1, c1;
        
        a1 = 0;
        b1 = 0;
        c1 = 0;
       
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        
        
            
            if (( a > b ) && (a > c) ) {
                a1 = a;
                if (b > c) { b1 = b; c1 = c; } else { b1 = c; c1 = b; }
            } 
            if (( a > b ) && (a < c) ) {
                a1 = c;
                b1 = a;
                c1 = b;
            } 
            if (( a < b ) && (b > c) ) {
                a1 = b;
                if (a > c) { b1 = a; c1 = c; } else { b1 = c; c1 = a; }
            }
            if (( a < b ) && (b < c) ) {
                a1 = c;
                 if (a > b) { b1 = a; c1 = b; } else { b1 = b; c1 = a; }
            }


            System.out.printf("%d\n", c1);
            System.out.printf("%d\n", b1);
            System.out.printf("%d\n\n", a1);
            System.out.printf("%d\n", a);
            System.out.printf("%d\n", b);
            System.out.printf("%d\n", c);
    
    }

}