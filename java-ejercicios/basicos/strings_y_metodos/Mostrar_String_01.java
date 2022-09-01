package strings_y_metodos;

class MostraString{
    public static void main (String [] args){
        System.out.println("La mejor cancion de Victor Jara es \"Te recuerdo amanda\"");
        // La barra dentro del println es para decirle que esa parte va entre comillas, porque al escribirlas las mete como texto normal.
        System.out.println("La mejor cancion de Victor Jara es\n \"Te recuerdo amanda\"");
        // \n para un salto de linea.
        System.out.println("La mejor cancion de Victor Jara es \\Te recuerdo amanda\\");
        // Con \\ mostramos la cadena entre \.
        System.out.println("La mejor cancion de Victor Jara es \tTe recuerdo amanda");
        // Usando \t nos añade una tabulación.
        System.out.println("La mejor cancion de Victor Jara es \bTe recuerdo amanda" + "\n");
        // \b borra un espacio o hace un retroceso, por eso nos sale pegado "Jara esTe trecuedo".
        
        String PalabrasClave = "";
        PalabrasClave = PalabrasClave + "videotutoriales ";
        PalabrasClave = PalabrasClave + "Flash ";
        PalabrasClave = PalabrasClave + "PHP";
        System.out.println(PalabrasClave + "\n");
        // Asi mostraremos un mensaje compuesto por 3 palabras usando una sola variable.

        String PalabrasClave2 = "";
        PalabrasClave2 += "videotutoriales ";
        PalabrasClave2 += "Flash ";
        PalabrasClave2 += "PHP";
        System.out.println(PalabrasClave2);
        // Asi mostraremos un mensaje compuesto por 3 palabras usando una sola variable pero con += ya le añade texto a la misma sin indicar el nombre.
    }
}