
package bloque1;
import java.util.Scanner;

public class EJ5 {


    public static void main(String[] args) {

        int num1, num2, num3;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();
        
         System.out.println("Introduce el segundo número");
        num2 = teclado.nextInt();
        
         System.out.println("Introduce el tercer número");
        num3 = teclado.nextInt();
        
        
        if ((num1>num2)&&(num1>num3))
                { System.out.println("El número mayor es:\n" +num1);
                }
                
         if ((num2>num1)&&(num2>num3))
                 System.out.println("El número mayor es:\n " +num2);
                
         
          if ((num3>num1)&&(num3>num2))
                { System.out.println("El número mayor es:\n" +num3);
                }
    }
    
}
