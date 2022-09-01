package bucles;

import static java. lang. System. out;

class contador{
    public static void main (String args []){
        for ( int contador = 1; contador <= 10; contador++) {
        // Primero creamos una variable llamada contador que tendrá valor 1.
        // El loop for esta compuesto por tres partes que se ponen entre ():
        // La primera se llamada "inicializacion" y es donde le damos el vamor inicial 
        // La segunda es llamada "expresion" donde se evalua si se cumple o no con cada condicion.
        // La Tercera es llamada "actualizacion" donde se actualiza el valor con cada recorrido que se haga.
        // Es decir que cuando llegue a 10 entonces saldrá el bucle (loop).
        out. print("El valor del contador es:   ");
        out. print(contador);
        out. println (" . ");
        }
    out. println (" ¡Hecho! ");
    }
}