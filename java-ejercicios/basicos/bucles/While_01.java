package bucles;

import static java. lang. System. out;
import java. util. Scanner;
import java. util. Random;
// Importamos 3 clases para poder trabajar con:
// Scanner que es lectura por teclado.
// Random que genera un numero aleatorio.
// System out para usar solo out printl.

/* Este juego consiste en que el programa genera un numero aleatorio y nosotros tenemos que acertarlo.
Nos contara las veces que intentamos acertar.*/
class Juego{
    public static void main (String [] args){
        Scanner miScanner = new Scanner ( System. in) ;
        // La clase Scanner es entrada por teclado, o sea lee el valor que metemos por teclado.
        int numIntentos = 0;
        // Abrimos una variable para los intentos empezando en 0 obviamante.
        int numAleatorio = new Random() . nextInt ( 10) + 1;
        
        out. println("      *********  *************     ");
        out. println(" Bienvenido al juego \":Acierta el numero!:\"");
        out. println("      *********  *************     ");
        out. println();
        out. print ( "Escribe un numero del 1 al 10: " );
        int numeroEscrito = miScanner. nextInt();
        numIntentos++;
        while (numeroEscrito != numAleatorio) {
            // Esto dice que si la variable numero que introducimos es igual al numero aleatorio que genera entonces salga del bucle.
            out. println();
            out. println( " Intentalo de nuevo . . .");
            out. println(" Escribe un número del 1 al 10: ");
            numeroEscrito = miScanner. nextInt();
            numIntentos++;
        }
        //Funciona igual que el if, entre () la condicion y luego entre {} lo que hara.
        // En este caso cada vez que demos un numero y fallemos volvera a repetir el while y le sumará uno a los intentos.
        
        out. println( " Has Ganado despues de ");
        // Si acertamos saldrá del while y ya nos dice que hemos ganado.
        out. println (numIntentos + " Intentos. ");
        // Y nos guarda el numero de intentos que ha sumado 1 cada vez que erramos.
    }
}