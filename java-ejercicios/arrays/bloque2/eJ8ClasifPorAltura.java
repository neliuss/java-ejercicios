//Pedir a altura dunha persoa, se é menor de 140 indicar “altura baixa”, se a altura está entre 141 e 165 “altura media” e se é maior “altura alta”.
package bloque2;

import java.util.Scanner;


public class eJ8ClasifPorAltura {


    public static void main(String[] args) {
        int n=0;
        float m=0;
          
        n=dame_altura(n);
        System.out.println("Tu altura es: "+n);
        compara(n);
    }
    
    public static int dame_altura(int n) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce tu altura en cm: "); 
        n = entrada.nextInt();
        return n;
    }
    
    
    public static void compara(float altura){
        
        if ( altura < 140) {
        System.out.println("altura baixa.");
        }
        if ( altura >=141 && altura<=165){
        System.out.println("altura media");
        }
        if(altura>165){
           System.out.println("altura alta."); 
        }
    }
    
}
