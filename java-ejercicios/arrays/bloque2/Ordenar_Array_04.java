package bloque2;

import java.util.*;
// Necesitaremos un metodo llamado Sort para ordenar asi que importamos todas las clases de java.

class Ordenar_Array_04{
    public static void main (String args[] ) {
        String nombres [ ] = {"miguel", "Maria", "Alberto", "Jose", "Fernando",
        "Alejandro", "Rosa", "David", "Sergio", "Francisco"};
        // Metemos una lista en el array, fijarse que no haya espacio en blanco que se cuenta como caracter
        System.out.println("El orden original: ");
        for (int i = 0; i < nombres. length; i++) {
            System.out.print(i + " : " + nombres[i] + " ");
        }
        // Este for nos mostrará la lista original en el print pero numerada.
        Arrays.sort(nombres);
        // Usamos el metodo sort de la clase Arrays para ordenar el array nombres.
        System.out.println("\nEl nuevo orden: ");
        for (int i = 0 ; i < nombres. length ; i++) {
            System.out.print(i + " : " + nombres[i] + " ");
        }
        // Asi nos sacara por pantalla la lista ordenada y como antes numerada.
        System.out.println();
    }
}