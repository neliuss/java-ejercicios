package bloque2;

class Eliminar_Espacio_02{
    public static void main (String [] args) {
        /* Esta aplicacion almacena un texto es varios sitios, uno en un String y otro en un char como
        cadena de caracteres, lo que hacemos es convertir cada caracter del string en un char.*/
                
        String CitaDiaria = "La educacion consiste en enseñar a los hombre no lo deben pensar";
        char [] convertir = CitaDiaria.toCharArray();
        // Con el método toCharArray es como convertidos cada elemento del string en un caracter de array.
        for (int dex = 0; dex < convertir. length; dex++) {
        /* Luego con un for hacemos tres cosas:
        primero le damos el valor inicial 0
        a continuacion comprobará si el valor de dex (variable con for) es menor que los caracteres de convertir
        Y si se cumple la condicion anterior le añadirá 1 al valor. Seguirá recorriendolo hasta que coincida
        con los caracteres que tiene convertir*/
            char current = convertir[dex];
            if (current != ' ') {
                System.out.print(current);
                // Entonces lo que hara es imprimir cada caracter hasta que encuentre un espacio blanco.
        }
            else {
                System.out.print('.');
                // Si encuentra un espacio en blanco le colocará un punto.
            }
        }
    }
}