
package varios;

public class Desplaza1Posicion1Array {

    public static void main(String[] args) {
        
        int [] vector=new int[5];

        
        rellena_array2(vector);
        desplaza_posic(vector);
        System.out.println("Nuevo array: ");
        ver_array(vector);
    }
    
    public static void rellena_array2(int array[]){

     for (int i=0;i<array.length;i++){
         array[i]=(int)Math.round(Math.random()*10);//fusión a int, q random da decimal    
            }
              for (int i=0;i<5;i++){
                     System.out.println(array[i]);
                 }
    }
    
    public static void desplaza_posic(int array[]){
        int ultimo=array[4];    //Guardamos el ultimo elemento;
        
        for (int i=3;i>=0;i--){ //3 pq el último ya lo tenemos guardado, pa q el bucle no trabaje de más. Aquí avanzamos una posición abajo en el array
            array[i+1]=array[i];
        }
        array[0]=ultimo;
    }
    
      public static void ver_array(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }   
    }
      
}
