
package bloque4_Matrices;

import java.util.Scanner;

public class Ej5Concesionario {

      public static void main(String[] args) {
        int matriz[][]=new int [10][15];
        int fila=10;
        int columna=15;
        
        
     // int matriz2[][]=new int [filas][3];
        
        rellena_visualiza_matriz(matriz, fila, columna);
      //  mostrar(matriz);
        venta_vendedor(matriz, fila, columna);
        venta_modelo(matriz, fila, columna);
        venta_total(matriz, fila, columna);
        eligefila_vermayor(matriz,columna);
        eligecolumna_vermayor(matriz,fila);
        mayor_num_total (matriz, fila, columna);
    }
    
    public static void rellena_visualiza_matriz(int matriz[][], int fila, int columna){
           for (int i=0;i<fila;i++){
                System.out.print("Vendedor "+(i)+":  ");//puedes poner (i), para q no se descuadra mínimamente.
                for (int j=0;j<columna;j++){
                       matriz[i][j]=(int)(Math.random()*100);
                       System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }  
    }

    public static void mostrar(int matriz[][], int fila, int columna){
        for (int i=0;i<fila;i++){ 
            System.out.print("Vendedor "+(i)+":  ");
            for (int j=0;j<columna;j++){
                       System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }  
    }  
    
    public static void venta_vendedor(int matriz[][],int fila, int columna){      //Suma cada fila por separado
        for (int i=0;i<fila;i++){
            int contador=0;
            for(int j=0;j<15;j++){
            contador=contador+matriz[i][j];
            }
         System.out.println("El vendedor "+(i)+" ha vendido un total de "+contador+" modelos.");   
        }   
    }
    
    public static void venta_modelo(int matriz[][], int fila, int columna) {       //suma todos los elementos de cada columna.
        int contador=0;
        for (int i=0;i<15;i++) {            //OJO cambiamos invertimos columnas por filas
            
            for (int j=0;j<fila;j++){
              contador=contador+matriz[j][i];   //OJO invertimos índices
            } 
            System.out.println("Se han vendido un total de "+contador+" coches, del modelo "+(i+1));
            contador=0;  //para que se reinicie en cada columna en 0.
        }
    }
    
    public static void venta_total(int matriz[][], int fila, int columna) {       //suma todos los elementos de cada columna.
        int contador=0;
        for (int i=0;i<fila;i++) {
            for (int j=0;j<15;j++){
              contador=contador+matriz[i][j];   
            }  
        }
         System.out.println("Se han vendido un total de: "+contador+" por todos los vendedores.");
    }
    
    public static void eligefila_vermayor(int matriz[][], int columna){      //elegir fila y que devuelva el mayor
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escoge el vendedor a elegir");
        int pregunta=entrada.nextInt();
        int suma=0;
        for (int i=0;i<columna-1;i++){
            if (matriz[pregunta][i]>suma){
                suma=matriz[pregunta][i];
            }
        }
        System.out.println("La mayor venta del vendedor "+pregunta+" ha sido de"+suma);     //?????????????????podría pedir que me devolviera el modelo???????????
    }
    
    public static void eligecolumna_vermayor(int matriz[][],int fila) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escoge el modelo a elegir");
        int pregunta=entrada.nextInt();
        int suma=0;
        for (int i=0;i<fila;i++) {
            if (matriz[i][pregunta]>suma){
                suma=matriz[i][pregunta];
            }
        }
        System.out.println("La mayor venta del modelo "+pregunta+" ha sido de"+suma);   //?????????????pedir que me devuelva el vendedor que la realizó.?????????????????????????????????
    }
    
    public static void mayor_num_total (int matriz[][], int fila, int columna) {
        int suma=0;
        for (int i=0;i<fila;i++){
            for (int j=0;j<columna;j++){
                if (matriz[i][j]>suma) {
                    suma=matriz[i][j];
                }
            }       
        }
       System.out.println("La mayor venta de todas, ha sido "+suma);        //????????????cómo hago pa q me devuelva vendedor y modelo(fila/columna)???????????????????  
    }
    }
    
    