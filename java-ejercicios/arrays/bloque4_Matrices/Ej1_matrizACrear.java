package bloque4_Matrices;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Ej1_matrizACrear {


    public static void main(String[] args) {
//        int matriz[][]=new int [100][100];
//        rellena_matriz(matriz);
//
//        
//??????????????????cómo llamo al método?????????????????????
//        
//    }
//    
//   public static void rellena_matriz(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escribe el numero de filas");
        int filas=entrada.nextInt();
        System.out.println("Escribe el numero de columnas");
        int columnas=entrada.nextInt();
        
        int matriz[][]=new int [filas][columnas];
        
        for (int i=0;i<matriz.length;i++){
           for (int j=0;j<matriz.length;j++){
               matriz[i][j]=(int)(Math.random()*10);
               System.out.print(matriz[i][j]+" ");
           }
             System.out.println(" ");
        }
    }
    
}
