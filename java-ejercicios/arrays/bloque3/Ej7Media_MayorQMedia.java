package bloque3;

import java.util.Arrays;

public class Ej7Media_MayorQMedia {



    public static void main(String[] args) {
         int [] vector=new int[5];
        double m;
         int [] vector2=new int[5];
         rellena_array(vector);
         m=media(vector);
           System.out.println("la media es:"+m);
        // compara(vector);
        vector2 = num_mayor(vector,m);
        //mostrar (vector2);
        mostrar2(vector2);
        }
    
     public static void rellena_array(int array[]){
       for (int i=0;i<array.length;i++){
            array[i]=(int)Math.round(Math.random()*10);//fusión a int, q random da decimal    
        }
       for (int i=0;i<array.length;i++){
           System.out.println("Valor "+(i+1)+" : "+array[i]);
       } 
}
   
              
    public static void mostrar(int array[]) {
        System.out.println("Los datos introducidos son:");
           for (int array2:array){
               
              System.out.println(array2);
    }
}
                   
    public static void mostrar2(int array[]) {
        System.out.println("Las notas mayores que la media son:");
           for (int i=0;i<array.length;i++){
               if (array[i]!=0){
                System.out.println(array[i]);   
               }
    }
}
     
     public static double media(int array[]){
        double media=0.0;   //TENGO QUE INICIALIZAR SÍ O SÍ
        double contador=0.0; 
        for (int i=0 ; i<array.length; i++){
            contador=contador+array[i];      
        }
        media=contador/array.length;  
      
        return media;
     }
     
     public static int [] num_mayor(int array[],double media ){
      int j=0;
      int []media_mayor=new int [5];//cómo indico la dimensión que yo quiera, no 5: teng oque poner 5
      for (int i=0 ; i<array.length; i++) {
            
            if (array[i]>=media){      //declaro media en la variable, no en local      
               media_mayor[j++]=array[i];  
              // j=j+1;
                  }
       
      }
       return media_mayor ;
     }
}
