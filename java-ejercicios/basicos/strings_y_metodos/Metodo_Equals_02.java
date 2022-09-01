package strings_y_metodos;

class Metodo_Equals_02{
    public static void main (String [] args){
        String respuesta = "amarillo";
        String resultado = "verde";
        System.out.println( "¿ Has respondido que el color es " + resultado + "?");
        System.out.println( "Respuesta: " + respuesta.equals(resultado));
        /* El metodo equals funciona poniendo el string respuesta para que lo compare con lo que 
        tiene entre parentesis, es decir respuesta no se llama igual que resultado por eso nos 
        devuelve false. Si ambas variables fuesen "verde" entonces nos diria true.*/
        
        String respuesta2 = "azul";
        String resultado2 = "azul";
        System.out.println( "¿ Has respondido que el color es " + resultado2 + "?");
        System.out.println( "Respuesta: " + respuesta2.equals(resultado2));
        // Ahora nos devuelve un true ya que ambos se llaman azul y al aplicar el metodo equals lo detecta.
    }
}