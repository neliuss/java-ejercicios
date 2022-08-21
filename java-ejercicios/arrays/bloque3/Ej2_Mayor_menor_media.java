
package bloque3;

public class Ej2_Mayor_menor_media {


    public static void main(String[] args) {
        int [] vector=new int[20];
        rellena_array(vector);
        media(vector);
        num_mayor(vector);
        num_menor(vector);
    }
        
    
    
     public static void rellena_array(int array[]){
       
       for (int i=0;i<array.length;i++){
            array[i]=(int)Math.round(Math.random()*100);//fusión a int, q random da decimal    
        }
       for (int i=0;i<array.length;i++){
           System.out.println("Valor "+(i+1)+" : "+array[i]);
       } 
}
 
     public static void media(int array[]){
        double media=0.0;   //TENGO QUE INICIALIZAR SÍ O SÍ?????????????NO HAY OTRA FORMA?????????????????
        double contador=0.0;
        for (int i=0 ; i<array.length; i++){
            contador=contador+array[i];
            media=contador/array.length;
            
          // System.out.println(media);
        }
        System.out.println("La media del vector es: "+media);    //FUSIONO A double PARA QUE ME DE DECIMALES=metiendo double tb a contador       
    }
     
     public static void num_mayor(int array[]){
         int num_may=0;
         for (int i=0;i<array.length;i++){
             if (num_may<array[i]){
                 num_may=array[i];
             }  
         }
         System.out.println("El número mayor es "+num_may);  
     }
     
     public static void num_menor(int array[]){
         int num_men=100;
         for (int i=0;i<array.length;i++){
             if (num_men>array[i]){
                 num_men=array[i];
             }  
         }
         System.out.println("El número menor es "+num_men);  
     }
     
}
