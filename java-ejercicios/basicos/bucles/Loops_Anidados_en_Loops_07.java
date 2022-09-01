package bucles;

class AnidarLoops {
    public static void main (String args []) {

        int points = 0;
        int target2 = 100;
        while (target2 <= 100) { 
            // Mientras no llegue a 100 seguirá ejecutandose la secuencia.
            for (int i = 0; i < target2; i++) {
                // Metimos dentro un for que suma 1 a cada ciclo que haga.
                if (points > 50) {
                    // Y este if pone un limite de 50.
                    System.out.println  ("Saliendo del loop for");
                    // Mostrará este mensaje cuando salga del loop for, o sea que llegue a 50.
                    break;}
                points = points + i;
            }
            /* Con esto vemos el ejemplo de un bucle infinito, nunca llega al while por culpa del 50 que 
            limita el if, es decir sale del for pero no para de ejecutarse sin cesar porque no llega
            a la condición del while.*/
        }
    }
}