
package bloque1;
import java.util.Scanner;

public class EJ4 {


    public static void main(String[] args) {

        int num;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el número");
        num = teclado.nextInt();
        
        if (num < 0) 
           System.out.println("El número introducido es negativo");  
        else System.out.println("El número introducido es positivo"); 
        
    }
    
}
