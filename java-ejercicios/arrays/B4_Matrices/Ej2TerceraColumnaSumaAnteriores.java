package B4_Matrices;

import java.util.Scanner;


public class Ej2TerceraColumnaSumaAnteriores {


    public static void main(String[] args) {
   Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escribe el numero de filas");
        int filas=entrada.nextInt();
        
        int matriz[][]=new int [filas][3];
        int matriz2[][]=new int [filas][3];
        
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<2;j++){
                 matriz[i][j]=(int)(Math.random()*10);
               System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        for (int i=0;i<matriz.length;i++){
            for (int j=2;j<3;j++){
                matriz2[i][j]=matriz[i][0]+matriz[i][1];
                System.out.println(matriz[i][0]+" + "+matriz[i][1]+" = "+matriz2[i][j]);
            }
        }
    }
    
}
