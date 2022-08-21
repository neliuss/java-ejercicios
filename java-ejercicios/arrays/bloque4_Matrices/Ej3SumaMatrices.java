package bloque4_Matrices;
import java.util.Scanner;

public class Ej3SumaMatrices {

    public static void main(String[] args) {
            Scanner entrada=new Scanner(System.in);

            System.out.println("Escribe el numero de filas");
            int filas=entrada.nextInt();
            System.out.println("Escribe el numero de columnas");
            int columnas=entrada.nextInt();

            int matriz[][]=new int [filas][columnas];
            int matriz2[][]=new int [filas][columnas];
            int matriz3[][]=new int [filas][columnas];
            
             System.out.println("Primera matriz: ");

             for (int i=0;i<matriz.length;i++){
                    for (int j=0;j<matriz[0].length;j++){
                         matriz[i][j]=(int)(Math.random()*10);
                       System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }
             
              System.out.println("Segunda matriz: ");
             
            for (int i=0;i<matriz.length;i++){
                    for (int j=0;j<matriz[0].length;j++){
                         matriz2[i][j]=(int)(Math.random()*10);
                       System.out.print(matriz2[i][j]+" ");
                    }
                    System.out.println(" ");
                }
            
             System.out.println("Matriz resultante de la suma de las matrices: ");
             
              for (int i=0;i<matriz.length;i++){
                   for (int j=0;j<matriz[0].length;j++){
                        matriz3[i][j]=matriz[i][j]+matriz2[i][j];
                        System.out.print(matriz3[i][j]+" ");
                   }
                   System.out.println(" ");
              }
             
             
            
    }
    
//    public static void crea_rellena_visualiza(){ 
//      
//
//               
//    }
    
}
