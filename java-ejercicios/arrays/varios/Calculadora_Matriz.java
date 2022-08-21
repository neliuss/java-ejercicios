package varios;
import java.util.Scanner;

public class Calculadora_Matriz {

    static Scanner entrada=new Scanner (System.in);

    public static void main(String[] args) {
        int fila=3, columna=3;
        int [][]matriz=new int [fila][columna];
        int [][]matriz2=new int [fila][columna];
        int [][]matriz3=new int [fila][columna];
        int menu;
        String respuesta;
        
        rellena_visualiza_matriz(matriz,fila,columna);
        System.out.println("Segunda matriz: ");
        rellena_visualiza_matriz(matriz2,fila,columna);
        
        do{
            System.out.print("MENU:\n1.Suma\t2.Resta\t3.Producto\t4.División\t");
            menu=entrada.nextInt();
            
            switch(menu) {
                
                case 1:
                    for (int i=0;i<fila;i++){
                            for (int j=0;j<columna;j++){
                                   matriz3[i][j]=matriz[i][j]+matriz2[i][j];
                                   System.out.print(matriz3[i][j]+" ");
                                }
                                System.out.println(" ");
                            } 
                    break;
                case 2:
                    for (int i=0;i<fila;i++){
                            for (int j=0;j<columna;j++){
                                   matriz3[i][j]=matriz[i][j]-matriz2[i][j];
                            }
                    }
                    break;
                case 3: 
                    for (int i=0;i<fila;i++){
                            for (int j=0;j<columna;j++){
                                   matriz3[i][j]=matriz[i][j]*matriz2[i][j];//No sería: matriz3[0][0]=(matriz[0][0]*matriz2[0][0])+(matriz[0][1]*matriz2[1][0])+(matriz[0][2]*matriz2[2][0]);
                            }
                    }
                case 4:
                    for (int i=0;i<fila;i++){
                            for (int j=0;j<columna;j++){
                                   matriz3[i][j]=matriz[i][j]/matriz2[i][j];
                            }
                    }
                    break;
            }
            
            System.out.println("\nLa matriz resultante es: \n");
            
            for (int i=0;i<fila;i++){
                            for (int j=0;j<columna;j++){
                                   System.out.print(matriz3[i][j]+" ");
                            }
                            System.out.println(" ");             
            }
          System.out.println("Desea realizar otra operación?(s/n)");
          respuesta=entrada.next();
          
        }while(respuesta=="s");
        
    }
        
    
    
     public static void rellena_visualiza_matriz(int matriz[][], int fila, int columna){
           for (int i=0;i<fila;i++){
                for (int j=0;j<columna;j++){
                       matriz[i][j]=(int)((Math.random()*10)+1);
                       System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }  
    }
    
}  
    

