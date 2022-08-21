package bloque3;
import java.util.*;

public class Ej1Media_AprobSusp {

    public static void main(String[] args) {
        /*
        int[]array=new int[5];  // tb sería válido: int array[]=new int[5];
        array[0]=0;
        array[1]=9;
        array[2]=3;
        array[3]=5;
        array[4]=7;
        */
       // int []array={0, 8, 7, 6, 3};
         
       int [] vector=new int[5];
        rellena_array(vector);
        //System.out.println("Los datos son: "+Arrays.toString(vector));
       // System.out.println("Los datos son: "+(vector));-----------------------------Cömo hago para que se vea bien?????????????????y para que al final del archivo, me de decimales?????????????????????????????????????
                    
    }
      public static void rellena_array(int array[]){
       int i;
       for (i=0;i<array.length;i++){
            array[i]=(int)Math.round(Math.random()*10);//fusión a int, q random da decimal    
        }
       
//       for (int i=0;i<5;i++){
//           System.out.println(array[i]);
//       }
        //con foreach:
        for (int array2:array){
          System.out.println(array2);
        }

          int suma=0;
          for (i=0;i<array.length;i++){
            suma=suma+array[i];
          }
          float res=suma/array.length;       
            System.out.println("El resultado de la media es : "+res);
            if (res>=5){
                System.out.println("Aprobado.");
            }else{
                System.out.println("Suspenso.");
            }

      }
      
} 


