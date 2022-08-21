package bloque3;
import java.util.Arrays;

public class Ej3SumaVectores_GuardaEnTercerVector {

    public static void main(String[] args) {
        int [] vector=new int[5];
        int [] vector2=new int[5];
        int [] vector3=new int[5];
        rellena_array(vector);
        mostrar(vector);
      //  System.out.println("Los datos son: "+(vector));//NO HAY OTRA FORMA DE VISULAIZARLO?????
        System.out.println("------Segundo array automático:------------");
        rellena_array(vector2);
        mostrar(vector2);
      //  System.out.println("Los datos son: "+Arrays.toString(vector2));
        System.out.println("-------La suma de los vectores es:-----------");
       suma_array(vector,vector2,vector3);
       ver_array(vector3);
    }
    
     public static void rellena_array(int array[]){
             for (int i=0;i<array.length;i++){
                 array[i]=(int)Math.round(Math.random()*10);//fusión a int, q random da decimal    
             }
             //Para visualizarlo con for each:
 //       for (int array2:array){
   //       System.out.println(array2);
     //   }
    }  
     
     public static void ver_array(int array[]){
         for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
         } 
     }
      
         
    public static void mostrar(int array[]) {
        System.out.println("Los datos introducidos son:");
           for (int array2:array){
              System.out.println(array2);
    }

}

     
      public static void suma_array(int array[],int array2[],int array3[]){
          for (int i=0;i<array.length;i++){
                 array3[i]=array[i]+array2[i]; 
             }
          
}
      
      
}
