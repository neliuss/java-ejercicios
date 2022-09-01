package bucles;

import java.io.File;
import static java.lang.System.out;
import java. util. Scanner;

//Hemos hecho el mismo programa otra vez pero cambiando su estructura, leer comentarios abajo.
class Loop_do_2 {
    public static void main (String args []){
        File archivo = new File("C:\\miarchivo.txt" ) ;
        Scanner miScanner2 = new Scanner (System.in) ;
        char replica;
        do {

            out. print("¿borrar archivo? (s/ n) " ) ;
        replica = miScanner2.findWithinHorizon( ".", 0) . charAt ( 0) ; }

        while (replica != 's' && replica != 'n' && replica != 'S' && replica != 'N') ;
        // El mismo ejemplo pero como solo reconocia en minuscula la respuesta pues le metimos lo mismo pero mayusculas.
        if (replica == 's' || replica == 'S') {
        // Como abrimos un S hay que decirle al if que lo reconozca, asi que se hace asi con el simbolo "or", es decir si replica es "s" O "S".
            out. println ( "De acuerdo, borrarndo archivo . . . ") ;
            archivo. delete() ; }
        else {
        // Y si no entra por el if porque pusimos n pues evidentemente entrara por el else porque ya se reconoce la N con lo que teniamos.
            out. println( "De acuerdo, confirmando no borrar. ") ;
        }
    }
}