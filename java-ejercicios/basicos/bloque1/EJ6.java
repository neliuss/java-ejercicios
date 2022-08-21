
package bloque1;
import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {
      
        float a, b, h ;
        //int a, b;
       // double cuadrado, h;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el primer lado del triángulo");
        a = teclado.nextFloat();
        
        System.out.println("Introduce el segundo lado del triángulo");
        b = teclado.nextFloat();
        
        System.out.println("Los lados del triángulo son:\n " + a + "\n" + b);
          
        System.out.println (Math.hypot(a, b)); //o sólo esto, o dos
         
/*
        cuadrado = Math.pow(a, b);
        h= Math.sqrt(cuadrado);
        System.out.println("La hipotenusa es: " + h); 
       */
    }
    
}



