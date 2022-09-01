package strings_y_metodos;

class length{
    public static void main (String [] args){
        String respuesta = "amarillo";
        String resultado = "amarillo";
        int tam = respuesta.length();
        // Abrimos una variable int para que almacene el numero que nos va a dar el método length.
        System.out.println(respuesta + " tiene " + tam + " caracteres");
        /* El metodo leght cuenta caracteres de la variable, y nos devuelve el tamaño. 
        A M A R I L L O = 8 letras*/
    }
}