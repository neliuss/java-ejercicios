package varios;
import java.util.Scanner;
import javax.swing.JOptionPane;;

public class OrdenarArrays {

public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int array[],nElementos,aux;
        
        nElementos= Integer.parseInt(JOptionPane.showInputDialog("Dime la cantidad de elementos del array: "));
        array = new int[nElementos];    //Le asignamos el número de elementos al arreglo
        
        for (int i=0;i<nElementos;i++) {
            System.out.println((i+1)+"Introduzca un número:");
            array[i]=entrada.nextInt();
        }
 
        //Método burbuja
        for(int i=0;i<(nElementos-1);i++){  //menos uno pa q el progrma no trabaje de más, con una vuelta menos, se ordena
            for (int j=0;j<(nElementos-1);j++){
                if(array[j] > array[j+1]) {          //si numActual > numSiguiene
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        //hata aquí el método burbuja, no es eficiente, pero sí eficaz
        //Ahora mostramos el arreglo de forma creciente:
        System.out.println("\nArreglo ordenado de foma creciente: ");  
        for (int i=0;i<nElementos;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        
        System.out.println("\nArreglo ordenado de foma creciente: "); 
        for (int i=(nElementos-1);i>=0;i--) {
                System.out.print(array[i]+" ");
        }
        System.out.println(" ");         
        }
}
    
    

