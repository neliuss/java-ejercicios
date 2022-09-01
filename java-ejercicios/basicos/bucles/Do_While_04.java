package bucles;

import java.io.File;
import static java.lang.System.out;
import java. util. Scanner;

class Loop_do {
    // Vamos a ver el do, es un tipo de loop que hace que la condicion se ejecute por lo menos 1 vez cada tiempo.
    public static void main (String args []){
        File archivo = new File("C:\\miarchivo.txt" ) ;
        // El File apunta a un archivo real, en esa ruta en este caso.
        Scanner miScanner = new Scanner (System.in) ;
        char replica;
        do {
        // Este es el inicio de loop do. Es decir entrar en el bucle, nos saldra el mensaje para borrar.
            out. print("¿borrar archivo? (s/ n) " ) ;
        replica = miScanner.findWithinHorizon( ".", 0) . charAt ( 0) ; }
        // Aqui nos esta pidiendo que metamos una entrada por teclado.
        while (replica != 's' && replica != 'n') ;
        // && esto sigficia and, es decir si se cumple la primera y se cumple la segunda no entrara al if ni else.
        // Entonces entrará al while, si la condicion se cumple pues entrará al if y else y si no pues seguira preguntando.
        if (replica == 's') {
        // Al pones s entra por el if asi que saldria que borre.
            out. println ( "De acuerdo, borrarndo archivo . . . ") ;
            archivo. delete() ; }
        else {
        // Y si no entra por el if porque pusimos n pues evidentemente entrara por el else.
            out. println( "De acuerdo, confirmando no borrar. ") ;
        }
        // Como vemos aqui le decimos que haga una cosa, despues compruebe una condicion hasta que sea lo q queremos, 
        // si es una de las peticiones entrara al if y else.
        
    
        File archivo2 = new File("C:\\miarchivo.txt" ) ;
        Scanner miScanner2 = new Scanner (System.in) ;
        char replica2;
        do {

            out. print("¿borrar archivo? (s/ n) " ) ;
        replica2 = miScanner2.findWithinHorizon( ".", 0) . charAt ( 0) ; }

        while (replica2 != 's' && replica2 != 'n' && replica2 != 'S' && replica2 != 'N') ;
        // El mismo ejemplo pero como solo reconocia en minuscula la respuesta pues le metimos lo mismo pero mayusculas.
        if (replica2 == 's' || replica2 == 'S') {
        // Como abrimos un S hay que decirle al if que lo reconozca, asi que se hace asi con el simbolo "or", es decir si replica es "s" O "S".
            out. println ( "De acuerdo, borrarndo archivo . . . ") ;
            archivo2. delete() ; }
        else {
        // Y si no entra por el if porque pusimos n pues evidentemente entrara por el else porque ya se reconoce la N con lo que teniamos.
            out. println( "De acuerdo, confirmando no borrar. ") ;
        }
    }
}