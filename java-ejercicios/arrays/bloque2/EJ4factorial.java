
package bloque2;
import java.util.Scanner;

public class EJ4factorial {
 
    public static void main(String[] args) {
  Scanner teclado = new Scanner (System.in);

    int n;
    
     System.out.println("Introduce n :");    
      n=teclado.nextInt();
      System.out.println ("el factorial de "+n+ " es " +factorial(n));
       
    }
    
public static double factorial (int n) {
    double cuenta=1;
    for (int i=2; i<=n; i++) {
    cuenta=cuenta*i;
    }
    return cuenta;

}
}