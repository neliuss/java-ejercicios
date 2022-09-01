package bucles;

import static java. lang. System. out;

class multiplos{
    public static void main (String args []){
        for ( int x = 1; x <= 200; x++) {
        // Creamos una variable de tipo integer llamada x con valor 1.
        // Luego comprueba que la condicion de que x sea igual o menos que 200 se cumpla
        // Mientras sea menor que 200 ejecutará las lineas que vienen despues y por cada loop le suma 1.
        int multiplo = 7 * x;
        out. print (multiplo + " ");
        // Vemos que nos va a devolver todos los multiplos de 200 hasta que llega a 200, es decir acaba con 7 * 200.
        }
    }
}