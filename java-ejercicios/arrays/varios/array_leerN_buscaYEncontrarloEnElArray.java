                                        
package varios;
import java.util.Scanner;

public class array_leerN_buscaYEncontrarloEnElArray {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int []array=new int [5];  
       
        rellena_array(array);
        

       System.out.println("Dime número:");
       numero= entrada.nextInt();   
       System.out.println("Tu número es: "+numero);
       
        
      //  pedir_numero(numero);
        busca_numero_enarray(array,numero);
        
    }
    
     public static void rellena_array(int array[]){

     for (int i=0;i<array.length;i++){
         array[i]=(int)Math.round(Math.random()*10);//fusión a int, q random da decimal    
            }
              for (int i=0;i<5;i++){
                     System.out.println(array[i]);
                 }
    }
     
     public static void ver_array(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }   
    }
    
    public static void pedir_numero(int numero){
        Scanner entrada = new Scanner(System.in);
       
       System.out.println("Dime número:");
       numero= entrada.nextInt();   
       System.out.println("Tu número es: "+numero);
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
