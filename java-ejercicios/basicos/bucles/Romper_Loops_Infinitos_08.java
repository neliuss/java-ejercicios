package bucles;

class RomperLoops {
    public static void main (String args []) {

        int points = 0;
        int target2 = 100;
        targetLoop:
        // Hemos nombrado el loop.
        while (target2 <= 100) { 
            for (int i = 0; i < target2; i++) {
                if (points > 50) {
                    System.out.println("points = " + points);
                    System.out.println  ("Saliendo del loop for");
                    break targetLoop;}
                    // Le dijimos al break que rompa el bucle con el nombre que le dimos.
                    // Asi cuando llegue a 50 sale del loop for pero tambien saldrá del 100 del while
                points = points + i;
            }
            // Con esto vemos el ejemplo de un bucle infinito, nunca llega al while.
        }
    }
}