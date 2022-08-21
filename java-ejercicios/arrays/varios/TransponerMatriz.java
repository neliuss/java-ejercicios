
package varios;
import java.util.Scanner;

public class TransponerMatriz {


    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int matriz[][]=new int[3][3];
        
        //rellena
        System.out.println("Dime la matriz");
        
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++) {
                    System.out.println("Matriz["+i+"]["+j+"]: ");
                    matriz[i][j]=entrada.nextInt();
                }
            }
            
            //mostrar
            System.out.println("Matriz original:");
            for (int i=0;i<3;i++){ 
           
                 for (int j=0;j<3;j++){
                       System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }  
            
    
            //transponiendo matriz
            
            int aux;
            for (int i=0;i<3;i++) {
                for (int j=0;j<i;j++){
                    aux=matriz[i][j];
                    matriz[i][j]=matriz[j][i];
                    matriz[j][i]=aux;
                }
            }
            
            System.out.println("La matriz transpuesta es : ");
             for (int i=0;i<3;i++){
                for (int j=0;j<3;j++) {
                   System.out.print(matriz[i][j]+" "); 
                }
                System.out.println(" ");
            }
    
    
}
}
