package varios;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Prueba_arrays_matrices {

    public static void main(String[] args) {
      
       int lista[],x,y;    //definimos la lista
       
       Scanner miteclado = new Scanner(System.in); 
       
       System.out.println ("Dame el tamaño de la lista");
       int tam=miteclado.nextInt();
       
       lista=new int[tam];  //le asignamos memoria
        
    
       // int lista[] =new int[tam];  Otra forma 
       
   
       //ahora rellenar
        for (x=0; x < lista.length; x++) {   //el length me da el número de elementos 
            lista[x]=(int)(Math.random()*5);
        }
     //rellenar_lista(lista); 
        
       System.out.println("La lista: "); 
      for (x=0; x < lista.length; x++) {      //mostrar:
            System.out.println(lista[x]);
        }
      
      
      //incializar:  
        System.out.println("La primera matriz: "); 
       int array[][] = { {1,2,3,4}, {5,6,7,8}}; //de esta forma no hace falta indicar tamaño
       for (x=0; x < array.length; x++) {
             for (y=0; y < array[x].length; y++) {
                    System.out.print(array[x][y]+ " ");
                }
             System.out.println();
            }   
      
              
     
      //Ahora una matriz: 
      
        int matriz[][];
        matriz = new int[4][4];
        
         for (x=0; x < matriz.length; x++) {   //el length me da el número de elementos 
             for (y=0; y < matriz[x].length; y++){
                    matriz[x][y]=(int)(Math.random()*5);
             }
        }
      
       System.out.println("Ahora la segunda matriz");
       mostrar_matriz(matriz);
 
    }
    //ahora con funciones
    public static void mostrar_matriz(int matriz[][])
    {
        int x,y;
         for (x=0; x < matriz.length; x++) {
             for (y=0; y < matriz[x].length; y++) {
                    System.out.print(matriz[x][y]+ " ");
                }
             System.out.println();
            }
        
    }
    
    public static void rellenar_lista(int list[])
    {
      int x;
    for (x=0; x < list.length; x++) {   //el length me da el número de elementos 
            list[x]=(int)(Math.random()*5);
        }
    }
    
}
