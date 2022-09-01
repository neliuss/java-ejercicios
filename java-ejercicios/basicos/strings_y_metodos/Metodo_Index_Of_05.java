package strings_y_metodos;

class indexof{
    public static void main (String [] args){
        String texto = "Seguiale Sancho a todo trote de su jumento: pero caminaba tanto Rocinante, que viendose asi";
        int busca = texto.indexOf("Sancho");
        System.out.println(busca);
        /* El metodo indexOf nos busca una palabra, en este caso le pedimos que busque "sancho" y 
        el programa nos dice que está en el caracter 9 (empieza contando por 0.*/

        String texto2 = "Seguiale Sancho a todo trote de su jumento: pero caminaba tanto Rocinante, que viendose asi";
        int busca2 = texto2.indexOf("Sencho");
        System.out.println(busca2);
        // Si no encuentra la palabra vemos que nos ha puesto -1 porque no hay ninguno.
    }
}