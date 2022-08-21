
package bloque2;

import java.util.Scanner;

public class EJ6Media {


    public static void main(String[] args) {
        float n=0, n2=0, n3=0;
        float m=0;
          
        n=dame_numero(n);
        n2=dame_numero(n2);
        n3=dame_numero(n3);
        System.out.println("Tus notas son: "+n+" "+n2+" "+n3);
        m=media(n,n2,n3);
        compara(m);
    }
    
    public static float dame_numero(float n) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce tu nota: "); 
        n = entrada.nextFloat();
        return n;
    }
    
    
    public static float media(float n,float n2, float n3) {
        float media=(n+n2+n3)/3;
        System.out.println(media);
        return media;
    }
    
    public static void compara(float media){
        
        if ( media >= 5) {
        System.out.println("has aprobado.");
        }
        else {
        System.out.println("has suspendido");
                }
    }
    
}
