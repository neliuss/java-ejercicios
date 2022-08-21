package varios;
import java.util.Scanner;

public class ordena_matrices {

    public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
        
                System.out.println("introduce las filas");
		int filas=teclado.nextInt(); //pide las filas
		System.out.println("introduce las columnas");
		int columnas=teclado.nextInt(); //pide las columnas
		int j,i,t=0;
		int mat[][]=new int [filas][columnas];
		for ( i=0;i<filas;i++){
			for( j=0;j<columnas;j++){
				System.out.println("introduce el numero en la pocision  "+i+"  "+j);
				mat[i][j]=teclado.nextInt(); //pide el nnumero				
			}
		}
		for ( i=0;i<filas;i++){//imprime la matriz como ingresaste los datos
			for( j=0;j<columnas;j++){
				System.out.print(mat[i][j]+"	");
			}
			System.out.println("");
		}
		for( i=0; i < filas; i++){//ordena la matriz de abajo hacia arriba
			for( j=0;j< columnas; j++){
			for(int x=0; x < filas; x++){
				for(int y=0; y <columnas; y++){
			if(mat[i][j] > mat[x][y]){
			t = mat[i][j];
			mat[i][j] = mat[x][y];
			mat[x][y] = t;
			}
				}
			}
			}
	    }System.out.println("******************************************************");
		for ( i=mat.length-1;i>=0;i--){//imprime la matriz ascendentemente
			for( j=mat.length-1;j>=0;j--){
				System.out.print(mat[i][j]+"	");
			}
			System.out.println("");
		}
 
        }
}        
    

