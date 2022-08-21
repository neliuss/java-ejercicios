package bloque1;
import java.util.Scanner;

public class EJ10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
      
        float año;
        
        System.out.println("Introduce el año para comprobar si es bisiesto ");
        año = teclado.nextFloat();
        
        if (((año%4==0) && (año%100!=0)) || (año%400==0))
        System.out.println("El año es bisiesto");
        
        else System.out.println("El año introducido no es bisiesto");
    }
    
}


