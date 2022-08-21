/*
matriz "marco" tamaño 5x5, todos sus elementos son 0, menos bordes, que serán 1
 */
package varios;

public class matrizMarcos1y0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declaramos matriz
       int matriz[][] = new int[5][5];
       //no ponemos scanner pq no pediremos nada al usuario
       
       //Rellenando la matriz:
       for (int i=0;i<5;i++) {
           for (int j=0;j<5;j++){
               //cuando el iterador del las filas (i), sea 0 o 4(delimita las columnas):
               if(i==0 || i==4){
                   matriz[i][j]=1;
           }
           else if (j==0 || j==4){
                    matriz[i][j]=1;//hasta aquí estaría la matriz llena de 1
           }
           else{
                   matriz[i][j]=0;
           }
       }
    }
    
      System.out.println("La matriz es /n");
      for (int i=0;i<5;i++) {
           for (int j=0;j<5;j++){
               System.out.print (matriz[i][j]+"");//le damos un espacio y le quitamos el ln al print, para los saltos de línea
           }
           System.out.println("");//salto de línea para que aparezca en marco y no seguido
      }
      System.out.println("");//salto de línea pa que no se junte tanto
    }
}
