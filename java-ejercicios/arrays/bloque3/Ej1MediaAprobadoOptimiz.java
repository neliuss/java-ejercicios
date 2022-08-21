
package bloque3;
import java.util.*;

public class Ej1MediaAprobadoOptimiz {

    public static void main(String[] args) {
        int [] vector=new int[5];
        rellena_array(vector);
      //  System.out.println("Los datos son: "+Arrays.toString(vector));
        System.out.println("Los datos son: ");
        mostrar(vector);
        System.out.println("La media es: ");
        media(vector);  
    }
    
    public static void rellena_array(int array[]){//función para rellenar arrays
   
        Scanner sc=new Scanner(System.in);
     
     //  int [] array=new int [5];
       for (int i=0 ; i<array.length; i++){
            System.out.println("introduce valor"+(i+1));
            array[i]=sc.nextInt();
        }  
       }
     
    public static void media(int array[]){
        double res=0.0;   //TENGO QUE INICIALIZAR SÍ O SÍ
        double contador=0;
        for (int i=0 ; i<array.length; i++){
            contador=contador+array[i];
            res=contador/array.length;
          // System.out.println(res);
        }
        System.out.println(res);    //FUSIONO A double PARA QUE ME DE DECIMALES=cambiando contador a double  
    }
    
    public static void mostrar(int array[]) {
        System.out.println("Los datos introducidos son:");
            for (int array2:array){
                 System.out.println(array2);
            }

    }
}

