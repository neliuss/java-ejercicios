package varios;
import java.util.Scanner;

public class Funciones_matrices {

    public static void main(String[] args) {
        int fila=3;
        int columna=3;
        int sf; int sc;int dp;int di;
        
        int [][] matriz=new int[fila][columna];
        int [][] matriz2=new int[fila][columna]; 
        int [][] matriz3=new int[fila][columna];
        int [][] matriz4=new int[fila][columna];
        int [][] matriz5=new int[fila][columna];
        int [][] matriz6=new int[fila][columna];
        int [][] matriz7=new int[fila][columna];
        int [][] matriz10=new int[fila][columna];
        int [][] matriz_mult=new int[fila][columna];
        
        rellena_visualiza_matriz(matriz,fila, columna);
        System.out.println("Diagonal: ");
        imprime_diagonal(matriz,fila,columna);
        dp=suma_diagonal_principal(matriz);
        System.out.println("Suma de la diagonal principal: "+dp);
        di=suma_diagonal_inversa(matriz);
        System.out.println("Suma de la diagonal inversa: "+di);       
        System.out.println("Primera columna: ");
        imprime_primera_columna(matriz,fila,columna);
     //   rellena_tu_matriz(matriz2,fila,columna);
    //    mostrar_matriz(matriz2,fila,columna);
        System.out.println("Matriz rotada: ");
        rotar_matriz(matriz, matriz2);
        mostrar_matriz(matriz2, fila, columna);
        System.out.println("Nuevo array: ");
        rellena_visualiza_matriz(matriz3,fila, columna);
        System.out.println("tercera columna suma de las anteriores: ");
        Tercera_columna_suma_anteriores(matriz3,matriz4);
        
        System.out.println("vector5: ");
        rellena_visualiza_matriz(matriz5,fila, columna);
        System.out.println("vector6: ");
        rellena_visualiza_matriz(matriz6,fila, columna);
        System.out.println("suma dos primeras matrices: ");
        suma_matrices(matriz5,matriz6,matriz7);
        System.out.println("multiplicación : ");
        matriz_mult=multiplicacionMatrices (matriz5,matriz6);
        mostrar_matriz(matriz_mult,fila,columna);
        transponer_matriz(matriz_mult);
        System.out.println("transpuesta ");
        mostrar_matriz(matriz_mult,fila,columna);
        
        sf=suma_fila_matriz(matriz_mult);
        System.out.println("suma de fila a elegir de matriz transpuesta: "+sf);
        sc=suma_columna_matriz(matriz_mult);
        System.out.println("suma de columna a elegir de matriz transpuesta: "+sc);
        listar_todas_filas_sumadas(matriz_mult, fila,columna);
        listar_todas_columnas_sumadas(matriz_mult, fila,columna);
        total(matriz5, fila,columna);
        
        eligefila_vermayor(matriz5,columna);
        eligecolumna_vermayor(matriz5,fila);
        mayor_num_total (matriz_mult,fila,columna);
       
   //ésta no     matriz_identidad2();
        
        System.out.println("Dime numero de filas para calcular matriz identidad ");
        int fila2=intro_datos();
        System.out.println("Dime numero de columnas para calcular matriz identidad  ");
        int columna2=intro_datos();
        int matriz8[][]=new int [fila2][columna2];
        matriz_identidad(matriz8);
        ordena_matriz(matriz_mult,fila,columna);
        System.out.println("--------------------------  ");
        rellena_visualiza_matriz(matriz10,fila, columna);
        imprimirMayor_yPosicion(matriz10);
        
        
    }
    
    public static void mostrar_matriz(int matriz[][], int fila, int columna){
        for (int i=0;i<fila;i++){   
            for (int j=0;j<columna;j++){
                       System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }  
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
     
    public static void rellena_tu_matriz(int matriz[][], int fila, int columna){
           Scanner entrada= new Scanner(System.in);
        
            for (int i=0;i<fila;i++){
                 for (int j=0;j<columna;j++){
                        System.out.println("Ingrese elemento para la posición fila "+i+" Columna "+j );
                        matriz[i][j]=entrada.nextInt();
                      }
                }  
    }
    
     public static void imprime_diagonal(int matriz[][], int fila, int columna){
           for (int i=0;i<fila;i++){
                for (int j=0;j<columna;j++){
                       if (i==j){
                       System.out.print(matriz[i][j]+" ");
                }else{
                        System.out.print(0);
                        }
                    }
                    System.out.println(" ");
                }  
    }
     
    public static int suma_diagonal_principal(int[][] matriz) {
        int suma = 0;
 
        for (int i = 0, j = 0; i < matriz.length; i++, j++) {
            suma += matriz[i][j];
        }
        return suma;
    } 
    
    public static int suma_diagonal_inversa(int[][] matriz) {
        int suma = 0;
 
        for (int i = 0, j = 2; i < matriz.length; i++, j--) {   //ojo al meter el límite. está en dos pq son de 3x3.
            suma += matriz[i][j];
        }
        return suma;
    }
     
     public static void imprime_primera_columna(int matriz[][], int fila, int columna){
           for (int i=0;i<fila;i++){
                for (int j=0;j<columna;j++){
                       if (j==0){
                       System.out.print(matriz[i][j]+" ");
                }else{
                        System.out.print(0);
                        }
                    }
                    System.out.println(" ");
                }  
    }
     
     public static void rotar_matriz(int matriz[][], int matriz_rotada[][]){
        int i,j;
        int i2=matriz.length-1;
        
        for (i=0;i<matriz.length;i++){
               int j2=matriz[i].length-1;
            for (j=0;j<matriz[i].length;j++){
                       
                   matriz_rotada[i2][j2]=matriz[i][j];
                       j2 -- ;
                    }
                    i2--;  
                }  
    }
     
     public static void Tercera_columna_suma_anteriores(int matriz[][], int matriz2[][]){
             for (int i=0;i<matriz.length;i++){
            for (int j=2;j<3;j++){
                matriz2[i][j]=matriz[i][0]+matriz[i][1];
                System.out.println(matriz[i][0]+" + "+matriz[i][1]+" = "+matriz2[i][j]);
            }
        }
     }
     
    public static void suma_matrices(int matriz[][], int matriz2[][], int matriz3[][]){
            for (int i=0;i<matriz.length;i++){
                   for (int j=0;j<matriz[0].length;j++){
                        matriz3[i][j]=matriz[i][j]+matriz2[i][j];
                        System.out.print(matriz3[i][j]+" ");
                   }
                   System.out.println(" ");
              }
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
    
    public static void transponer_matriz(int [][] matriz){
         int aux;
            for (int i=0;i<3;i++) {
                for (int j=0;j<i;j++){
                    aux=matriz[i][j];
                    matriz[i][j]=matriz[j][i];
                    matriz[j][i]=aux;
                }
            }
    }
    
    public static int suma_fila_matriz(int [][]matriz){
        Scanner entrada= new Scanner(System.in);     
        int suma_fila = 0;
        int fila_elegir;
        System.out.println("Elige una fila");
         fila_elegir = entrada.nextInt();
         if ((fila_elegir >= 0 && fila_elegir < matriz.length)){
                for (int j = 0; j < matriz.length; j++) {
                        suma_fila =suma_fila+ matriz[fila_elegir][j];
                }
         }
         return suma_fila; 
    }
    
    public static int suma_columna_matriz(int[][] matriz) {
        int suma_columna = 0;
        Scanner entrada= new Scanner(System.in);     
        int columna_elegir;
        System.out.println("Elige una columna ");
        columna_elegir = entrada.nextInt();
 
        for (int i = 0; i < matriz.length; i++) {
            suma_columna += matriz[i][columna_elegir];
        }
        return suma_columna;
    }
        
    public static void listar_todas_filas_sumadas(int matriz[][],int fila, int columna){      //Suma cada fila por separado
        for (int i=0;i<fila;i++){
            int contador=0;
            for(int j=0;j<columna;j++){
            contador=contador+matriz[i][j];
            }
         System.out.println("la fila "+(i)+" tiene un total de "+contador);   
        }   
    }
    
    public static void listar_todas_columnas_sumadas(int matriz[][], int fila, int columna) {       //suma todos los elementos de cada columna.
        int contador=0;
        for (int i=0;i<columna;i++) {            //OJO cambiamos invertimos columnas por filas
            
            for (int j=0;j<fila;j++){
              contador=contador+matriz[j][i];   //OJO invertimos índices
            } 
            System.out.println("La columna "+(i)+" tiene un total de "+contador);
            contador=0;  //para que se reinicie en cada columna en 0.
        }
    }
    
    public static void total(int matriz[][], int fila, int columna) {       //suma todos los elementos de cada columna.
        int contador=0;
        for (int i=0;i<fila;i++) {
            for (int j=0;j<columna;j++){
              contador=contador+matriz[i][j];   
            }  
        }
         System.out.println("Hay un total de: "+contador);
    }
    
    public static void eligefila_vermayor(int matriz[][], int columna){      //elegir fila y que devuelva el mayor
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escoge la fila a elegir");
        int pregunta=entrada.nextInt();
        int suma=0;
        for (int i=0;i<columna-1;i++){
            if (matriz[pregunta][i]>suma){
                suma=matriz[pregunta][i];
            }
        }
        System.out.println("El número mayor de la fila "+pregunta+" ha sido de"+suma);     //?????????????????podría pedir que me devolviera el modelo???????????
    }
    
    public static void eligecolumna_vermayor(int matriz[][],int fila) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escoge la columna a elegir");
        int pregunta=entrada.nextInt();
        int suma=0;
        for (int i=0;i<fila;i++) {
            if (matriz[i][pregunta]>suma){
                suma=matriz[i][pregunta];
            }
        }
        System.out.println("El mayor número de la columna "+pregunta+" ha sido de"+suma);   //?????????????pedir que me devuelva el vendedor que la realizó.?????????????????????????????????
    }
    
    public static void mayor_num_total (int matriz[][], int fila, int columna) {
        int suma=0;
        for (int i=0;i<fila;i++){
            for (int j=0;j<columna;j++){
                if (matriz[i][j]>suma) {
                    suma=matriz[i][j];
                }
            }       
        }
       System.out.println("La mayor venta de todas, ha sido "+suma);        //????????????cómo hago pa q me devuelva vendedor y modelo(fila/columna)???????????????????  
    }
                     
    public static void matriz_identidad2(){    //matriz identidad, todo ceros menos la diagonal principal.La creamos de 3x3
       int [][]matriz={{0,0,0},{0,0,0},{0,0,0}};
        
       for (int i=0;i<matriz.length;i++){
           matriz[i][i]=1; 
       }
        System.out.println("La matriz identidad 3x3: "+matriz);
    }
    
    public static void matriz_identidad(int matriz[][]) {   //debe ser cuadrada
        System.out.println("Matriz Identidad:");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                if (i==j) {
                    matriz[i][j]=1;
                }else{
                    matriz[i][i]=0;
                }
              System.out.print(matriz[i][i]+" ");
            }
          System.out.println(" ");
        }
       System.out.println(); 
    }
        
     public static int intro_datos(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime número:");
        int x=teclado.nextInt();         
         return x;
        }
     
     public static void ordena_matriz(int matriz[][], int fila, int columna){
         int t=0;
         for(int i=0; i < fila; i++){//ordena la matriz de abajo hacia arriba
		for(int j=0;j< columna; j++){
			for(int x=0; x < fila; x++){
				for(int y=0; y <columna; y++){
                                    if(matriz[i][j] > matriz[x][y]){
                                            t = matriz[i][j];
                                            matriz[i][j] = matriz[x][y];
                                            matriz[x][y] = t;
                                    }
				}
			}
		}
	    }System.out.println("******************************************************");
		for (int  i=matriz.length-1;i>=0;i--){//imprime la matriz ascendentemente
			for(int j=matriz.length-1;j>=0;j--){
				System.out.print(matriz[i][j]+"	");
			}
			System.out.println("");
		}
    }
     
     public static void imprimirMayor_yPosicion(int matriz[][]) {
    	int mayor=matriz[0][0];
    	int filamay=0;
    	int columnamay=0;
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                if (matriz[i][j]>mayor) {
                    mayor=matriz[i][j];
                    filamay=i;
                    columnamay=j;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filamay+ " y en la columna: "+columnamay);
    }
}


//VER COMPARAR MATRICES 
/*
if (Arrays.equals(matriz1,matriz2))
    System.out.println("Matrices iguales");
else
    System.out.println("Matrices no son iguales");
-------------comparación lógica--------------:
if (Arrays.deepEquals(matriz1,matriz2))
    System.out.println("Matrices iguales");
else
    System.out.println("Matrices diferentes");
*/