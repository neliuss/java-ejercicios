
package bloque1;
import java.util.Scanner;

public class EJ3 {


    public static void main(String[] args) {
       
       int num1, num2, num3=0;
       
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número ");
        num2 = teclado.nextInt();
        
        System.out.println(" Tu primer número es: " + num1 + "y tu segundo número es: " +num2);
        
        if (num1>num2) 
        { num3=num1;
            num1=num2;
            num2=num3;

            System.out.println(" Tu primer número es: " + num1 + "y tu segundo número es: " +num2);
        }
    }
    
}

