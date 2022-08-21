
package bloque2;
import java.util.Scanner;

public class EJ5 {

    public static double suma (int n1,int n2) {
    double res = n1 + n2;
    return res;
    }
        
    public static int resta (int n1,int n2) {
    int res=n1-n2;
    return res;
    }
        
    public static double producto (int n1,int n2) {
    double res=n1*n2;
    return res;
    }
    
    public static float div(int n1,int n2) {
    float res=n1/n2;
    return res;
    }
    
    
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    int n1,n2;
    
     System.out.println("Introduce n1 :");    
      n1=teclado.nextInt();
      System.out.println("Introduce n2 :");    
      n2=teclado.nextInt();
     System.out.println ("la suma de "+n1+ " y de "+n2+ " es " +suma(n1,n2));
     System.out.println ("la resta de "+n1+ " y de "+n2+ " es " +resta(n1,n2));
     System.out.println ("el producto de "+n1+ " y de "+n2+ " es " +producto(n1,n2));
     System.out.println ("la división de "+n1+ " y de "+n2+ " es " +div(n1,n2));
       
    }
    }
