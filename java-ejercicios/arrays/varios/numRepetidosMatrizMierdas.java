
package varios;

public class numRepetidosMatrizMierdas {

    
    
    public static void main(String args[]) {
 //       int [][] matriz=new int[3][3];
        int[] matriz = {1,2,3,4,4,5,2,5}; // Array que trataremos.
//        int ocurrencias = 0;
//
//    }
//    
//    public int mas_usado (int  matriz[][]) {
            int num_mas_usado = 0;
            int veces [ ] = new int [matriz.length];
            int posicion = 0;
                    for(int i = 0; i < matriz.length; i++){
                            num_mas_usado = matriz[i];
                                 for(int j = i; j < matriz.length; j++){
                                        if(matriz[j] == num_mas_usado){
                                                veces[i]++;
                                        }
                                }
                    }
            num_mas_usado = 0;
            
            for(int k = 0; k < veces.length; k++){
                    if(num_mas_usado < veces [k]){
                         num_mas_usado = veces [k];
                         posicion = k;
                    }
            }
            System.out.println("El numero " + matriz[posicion] + " apareció " + veces[posicion] + " veces.");
//            return matriz[posicion];
    }
    
}
