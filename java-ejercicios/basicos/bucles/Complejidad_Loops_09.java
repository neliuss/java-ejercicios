package bucles;

class Complejidad_Loops_09{
    public static void main (String args []) {
        int i, j;
        for ( i = 0, j = 0; 1 * j < 1000; i++, j+= 2){
        // Esta vez vemos que podemos usar dos variables para el mismo for.
            System.out.println(1 + " * " + j + " = " + (1 * j));
        // Lo que hemos hecho es crear dos variable cuyo valor empieza con 0
        // Despues compara si multiplicar la una por la otra es menor que 1000
        // Si es menor que 1000 le sumara 1 al valor de i y j va aumentando en 2
        // De este modo mostrara que obtenemos al multiplicar i por j hasta que llegue a 1000.
        }
    }
}