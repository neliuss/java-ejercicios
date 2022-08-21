
package bloque2;
import java.util.Scanner;

public class EJ1_ParImpar {

    public static void main(String[] args) {
    
        int n=0;

       n=dame_altura(n);
       compara(n);  
    }    
        
    public static int dame_altura(int n) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce n: "); 
        n = entrada.nextInt();
        return n;
    } 
    
    public static void compara(int n){
        
       if (n %2==0) 
             System.out.println("El número " +n+ " es par.");
       else 
             System.out.println("El número " +n+ " es impar.");   
    }     
}
