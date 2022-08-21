package B4_Matrices;

public class Ej4TablaMultiplicar {

    public static void main(String[] args) {
        
        int [][]matriz=new int [10][10];
        int cont=0;
        
        for (int i=0;i<10;i++){
                matriz[0][i]=cont;
                matriz[i][0]=cont;
                cont=cont+1;    //poniéndolo arriba, no sale el 0 de la posición [0][0].
            }
        
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print(matriz[i][j]);
            }
           System.out.println(" ");
        }
        
         System.out.println("--------------");
         
         for (int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                matriz[i][j]=matriz[i][0]*matriz[0][j];
     //            System.out.print(matriz[i][j]+"  "); //si lo muestro ahora, no me sale el 0, ya que empezamos desde el índice 1
            }
   //        System.out.println(" ");
         }
          for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print(matriz[i][j]+"  ");
            }
           System.out.println(" ");
        }
    }  
}





           