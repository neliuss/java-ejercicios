
package varios;


public class MultiplicaciónMatrices {


    public static void main(String[] args) {
        
        int fila=3; int columna=3;
        int [][]matriz={{2, 0, 1}, {3, 0, 0}, {5, 1, 1}};
        int [][]matriz2={{1, 0, 1}, {1, 2, 1}, {1, 1, 0}};
        int[][] matriz3 = new int[matriz.length][matriz2[0].length];
       
        matriz3=multiplicacionMatrices(matriz,matriz2);
        mostrar(matriz3);
        
        
    }
    
    public static int[][] multiplicacionMatrices ( int[][] matriz, int[][] matriz2) {
        
      int[][] matriz3 = new int[matriz.length][matriz2[0].length];
      int i; int j;
      for (i= 0; i<matriz3.length; i++)
          for (j=0; j<matriz3[0].length; j++)
              for (int k=0; k<matriz2.length; k++)
                  matriz3[i][j] = matriz3[i][j] +( matriz[i][k] * matriz2[k][j]);
      return matriz3;
    }      
      
    public static void mostrar(int [][]matriz) {  
      for (int i= 0; i<matriz.length; i++){
          for (int j=0; j<matriz[0].length; j++){
              System.out.print(matriz[i][j]);
          }
          System.out.println(" ");
      }
    }
}

