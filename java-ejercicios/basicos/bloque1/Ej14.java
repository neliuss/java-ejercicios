
package bloque1;
import java.util.Scanner;

public class Ej14 {


    
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);       
       
      int n;
      double acum;

     
    System.out.println("Introduce n ");    
    n=teclado.nextInt();
      
    acum=0;
    for (int i=1; i<=n; i++){
     acum=acum+(i/Math.pow(2, i));
       }
    System.out.println("la suma de los valores es : " + acum);
            
            
       }
}
