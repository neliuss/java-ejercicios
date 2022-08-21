package bloque3;

import java.util.Arrays;

public class Ej5_20pares {

    public static void main(String[] args) {
        
         int [] pares=new int[20];
         int cont=2;
         for (int i=0;i<pares.length;i++){
             cont=cont+2;
             pares[i]=cont;
         }
         System.out.println(Arrays.toString(pares));               
    } 
}
