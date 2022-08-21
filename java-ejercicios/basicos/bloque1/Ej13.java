
package bloque1;
import java.util.Scanner;

public class Ej13 {


    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);       
       
       int n;
       float acum;

     
            System.out.println("Introduce n ");    
            n=teclado.nextInt();
            
            //for (inicialización; condición; iteración) {
// cuerpo}
            acum=0;
            for (int i=1; i<=n; i++){
             acum=acum+(1.0f/i);
       }
              System.out.println("la suma de los valores es : " + acum);
            
            
       }
       }
       


                

        