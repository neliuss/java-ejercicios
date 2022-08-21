//Cómo llamo a las funciones, media, por ej en el ej1
package varios;
import java.util.*;
public class Funciones_Métodos {


    public static void main(String[] args) {
        int [] vector=new int[5];
        int [] vector2=new int[5];
        int [] vector3=new int[5];
        int [] vector4=new int[5];
        int [] vector5=new int[5];

        double m=0;
//        rellena_array(vector);
        rellena_array_automatico(vector);
        ver_array(vector);
        System.out.println("------Segundo array automático:------------");
        rellena_array_automatico(vector2);
        System.out.println("------ver array:------------");
        ver_array(vector);
        System.out.println("------ver 2 array:------------");
        mostrar(vector2);
        System.out.println("Los números repetidos son:");
        compara(vector,vector2,vector3);
        mostrar2(vector3);
        m=media(vector);
        System.out.println("La media es: "+m);
        System.out.println("El número mayor es: ");
        num_mayor(vector);
        System.out.println("El menor es: ");
        num_menor(vector);
        System.out.println("-------La suma de los vectores es:-----------");
       suma_array(vector,vector2,vector4);
       ver_array(vector4);
       vector5=num_mayor_media(vector,m );
       System.out.println("Los mayores o iguales q la media :");
       mostrar2(vector5);
       System.out.println("Desplaza un número el segundo array :");
       desplaza_posic(vector2);
       ver_array(vector2);
       burbuja(vector);
       System.out.println("Busco el número 8 dentro del primer vector :");
       busca_numero_enarray(vector,8);
       
    }
    

    public static void rellena_array(int array[]){//función para rellenar arrays
       Scanner sc=new Scanner(System.in);
   //  int [] array=new int [5];
       for (int i=0 ; i<array.length; i++){
            System.out.println("introduce valor"+(i+1));
            array[i]=sc.nextInt();
       }
}
    
        public static void rellena_array_automatico(int array[]){
             for (int i=0;i<array.length;i++){
                 array[i]=(int)Math.round(Math.random()*10);//fusión a int, q random da decimal    
             }  
//       for (int i=0;i<5;i++){
//           System.out.println(array[i]);
//       }
        //con foreach:
        for (int array2:array){
          System.out.println(array2);
        }
    }  
    
    public static void ver_array(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        } 
    }
    
    public static void mostrar(int vector[]){
        for (int i=0;i<vector.length;i++){ 
            System.out.print(vector[i]+" ");
         }
         System.out.println(" ");
     }
        
    public static int[] compara (int vector[], int vector2[],int vector3[]){ //compara dos arrays y saca num repetidos.
         int k=0;
         for (int i=0;i<vector.length;i++){
             for(int j=0;j<vector2.length;j++){
                  if (vector[i]==vector2[j]){
                 vector3[k++]=vector[i];
                 }
             }
         }
        return vector3;
     }
        //MOSTRAR2, VA CON COMPARA, Y CON EL ARRAY DE NUM_MAYOR_MEDIA, q recoge los mayores o iguales q la media
    public static void mostrar2(int array[]) {
     
           for (int i=0;i<array.length;i++){
               if (array[i]!=0){
                System.out.println(array[i]);   
               }
    }
}
        
    public static double media(int array[]){
        double media=0.0;   
        double contador=0.0; 
        for (int i=0 ; i<array.length; i++){
            contador=contador+array[i];      
        }
        media=contador/array.length;  
      
        return media;
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
        
     public static void suma_array(int array[],int array2[],int array3[]){
          for (int i=0;i<array.length;i++){
                 array3[i]=array[i]+array2[i]; 
             } 
    }
     
     public static int [] num_mayor_media(int array[],double media ){
      int j=0;
      int []media_mayor=new int [5];//tengo q indicar dimensión siempre
      for (int i=0 ; i<array.length; i++) {
            
            if (array[i]>=media){      //declaro media en la variable, no en local      
               media_mayor[j++]=array[i];  
              // j=j+1;
                  }
       
      }
       return media_mayor ;
     }
     
     
     public static void desplaza_posic(int array[]){        //desplaza una posición
        int ultimo=array[4];    //Guardamos el ultimo elemento;
        
        for (int i=3;i>=0;i--){ //3 pq el último ya lo tenemos guardado, pa q el bucle no trabaje de más. Aquí avanzamos una posición abajo en el array
            array[i+1]=array[i];
        }
        array[0]=ultimo;
    }
     
      //Método burbuja: Para ordenar arrays
     public static void burbuja(int array[]){
         int aux;
         
        for(int i=0;i<(array.length-1);i++){  //menos uno para q el programa no trabaje de más, con una vuelta menos, se ordena
            for (int j=0;j<(array.length-1);j++){
                if(array[j] > array[j+1]) {          //si numActual > numSiguiene
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        //hata aquí el método burbuja, no es eficiente, pero sí eficaz
        //Ahora mostramos el arreglo de forma creciente:
        System.out.println("\nArreglo ordenado de foma creciente: ");  
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        
        System.out.println("\nArreglo ordenado de foma creciente: "); 
        for (int i=(array.length-1);i>=0;i--) {
                System.out.print(array[i]+" ");
        }
        System.out.println(" ");         
        }
     
    public static void busca_numero_enarray(int []array, int numero){
       int i=0;
       
       while( i<array.length && array[i]!=numero){   //mientras el índice sea menor al máximo del array, y el número del array en el q vamos, sea diferente al número a buscar
           i++;           
       }
           if(i == array.length) {   //Hemos recorrido todo el array y no encontramos nada.
               System.out.println("Número no encontrado.");
           }
           else{      
                    if(array[i] == numero); {
                     System.out.println("Número encontrado en la posición "+(i+1));
                     }
//                    else{
//                            System.out.println("\nNúmero no encontrado.");
//                            }
       }   
    }
    
    
}

