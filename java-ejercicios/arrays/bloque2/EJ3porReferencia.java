
package bloque2;
import java.util.Scanner;

public class EJ3porReferencia {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in); 
    double n;
    
     System.out.println("Introduce n :");    
      n=teclado.nextInt();
       
    sumauno(n);   
    }
    
        public static void sumauno (double n){
      while (n>=0 && n<=99) {
        n=n+1;
     System.out.println(n); 
    }
    }

    
}

