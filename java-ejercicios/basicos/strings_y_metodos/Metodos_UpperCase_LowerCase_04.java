package strings_y_metodos;

class Case{
    public static void main (String [] args){
        String hola = "Pedro Gonzalez";
        String mayus = hola.toUpperCase();
        String minus = hola.toLowerCase();
        System.out.println("Podemos escribir en mayusculas " + mayus + " o en minusculas " + minus);
        // Con el método ToUpperCase mostramos el contenido en mayusculas y con toLowerCase en minusculas.
    }
}