
package bloque2;

import java.util.Scanner;

public class Ej7_múltiplos {

    public static void main(String[] args) {
       int n=0, n2=0 ;  
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce el número 1"); 
        n = entrada.nextInt();
        System.out.println("Tu número es:"+n);
        System.out.println("Introduce el número 2"); 
        n2 = entrada.nextInt();
        System.out.println("Tu número es:"+n2); 
        
        multiplo(n,n2);
        
    }
        
        
    public static void multiplo(int n, int n2) { 
  
        try{
            
        if (n % n2 == 0 || n2 % n ==0){
            System.out.println("Números múltiplos");
            if (n % n2 ==0){
               System.out.println(n+" es múltiplo de "+n2); 
            }else{
                System.out.println(n2+" es múltiplo de "+n);
            }
        }else{
            System.out.println("Los números no son múltiplos");
        }
        }
        catch (ArithmeticException x){
            System.out.println("Error, división entre 0");
        }
         finally {
        
            System.out.println("Fin");
        }
    }
}
    
/* ----Sin trycatch:------------
    public static void main(String[] args) {
       int n=0, n2=0 ;  
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce el número 1"); 
        n = entrada.nextInt();
        System.out.println("Tu número es:"+n);
        System.out.println("Introduce el número 2"); 
        n2 = entrada.nextInt();
        System.out.println("Tu número es:"+n2); 
  
        if (n % n2 == 0 || n2 % n ==0){
            System.out.println("Números múltiplos");
            if (n % n2 ==0){
               System.out.println(n+" es múltiplo de "+n2); 
            }else{
                System.out.println(n2+" es múltiplo de "+n);
            }
        }else{
            System.out.println("Los números no son múltiplos");
        }
    }
}


*/