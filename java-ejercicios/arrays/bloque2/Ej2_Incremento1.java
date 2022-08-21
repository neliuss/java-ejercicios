
package bloque2;
import java.util.Scanner;

public class Ej2_Incremento1 {


    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in); 
    
    int n;
    
    System.out.println("Introduce n (El máximo es 100)");    
    n=teclado.nextInt();
    
    do{
    n=n+1;
    System.out.println(n);
    }
    while (n<=99);           
    }   
}
