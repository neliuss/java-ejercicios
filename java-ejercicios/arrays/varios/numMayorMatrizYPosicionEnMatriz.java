/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class numMayorMatrizYPosicionEnMatriz {

     private Scanner teclado;
    private int[][] mat;
     public void cargar() {         //NO LA UTILIZO
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
     
     public static int intro_datos(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime número:");
        int x=teclado.nextInt();         
         return x;
        }
     
     
     public static void rellena_visualiza_matriz(int matriz[][], int fila, int columna){
           for (int i=0;i<fila;i++){
                for (int j=0;j<columna;j++){
                       matriz[i][j]=(int)(Math.random()*10);
                       System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }  
    }
        
    public static void imprimirMayor_yPosicion(int matriz[][]) {
    	int mayor=matriz[0][0];
    	int filamay=0;
    	int columnamay=0;
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                if (matriz[f][c]>mayor) {
                    mayor=matriz[f][c];
                    filamay=f;
                    columnamay=c;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filamay+ " y en la columna: "+columnamay);
    }
    
    public static void main(String[] ar) {
        
        System.out.print("Filas ");
        int fila=intro_datos();
        System.out.print("Columnas ");
        int columna=intro_datos();
        int [][] matriz=new int[fila][columna];

        rellena_visualiza_matriz(matriz, fila, columna);
        
        imprimirMayor_yPosicion(matriz);
    }   
}

 