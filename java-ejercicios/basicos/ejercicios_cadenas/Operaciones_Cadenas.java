/*Crear una clase llamada OperacionesCadenas que tendrá una serie de métodos estáticos:
1. Método revés: Este método estático llamado reves, devolverá la cadena que se le pasa como parámetro 
pero dada la vuelta. Es decir, si le pasamos la cadena “Hoy” nos devolverá “yoH”.
2. Método sinEspacios: Este método devuelve la cadena que se le pasa como parámetro sin ningún espacio en blanco. 
3. Método palíndromo: Crear un método estático llamado palindromo, que indique si la cadena que se le pasa 
como parámetro es palíndroma. Un palíndromo es una palabra o frase que se lee igual de izquierda a derecha que de derecha a izquierda. 
Vamos a considerar que no se introducen acentos.Tener en cuenta también que las mayúsculas 
o minúsculas no se tienen en cuenta para saber si la frase es palíndroma,lo mismo ocurre con espacios en blanco. 
4. Método aparicionesPalabra: Nos dirá cuántas veces aparece un determinado conjunto de caracteres en un texto. Ambos datos se pasan como argumentos del método. 
Nos dará igual que los caracteres estén en minúscula que en mayúscula. 
5. Método ocurrenciasPatron: Nos mostrará todas las palabras en un texto que empiezan por un determinado conjunto
de caracteres. Se le pasa como parámetros tanto el texto como el conjunto de caracteres por el que deben empezar las palabras. 
Devolverá un String que contenga el conjunto de palabras que empieza por el patrón indicado separadas por comas.
La búsqueda se realizará independientemente de si el conjunto de caracteres está o no en mayúsculas o minúsculas. 
6. Método sustituirPalabra: En base a una palabra dada sustituir todas sus ocurrencias en una cadena por otra palabra dada. 
Debe solicitar al usuario si quiere que se distinga entre mayúsculas y minúsculas a la hora de hacer la sustitución. 
Este método tendrá 4 argumentos: 
 Cadena en la que se va a hacer la sustitución 
 Cadena que se quiere sustituir(la que se va a eliminar) 
 Cadena con la que sustituir(la nueva) 
 Un booleano para indicar si se hace o no distinción entre mayúsculas y minúsculas. 
El método devolverá una cadena con el resultado de la sustitución

 */
package ejercicios_cadenas;

import static java.lang.Character.isSpaceChar;
import java.util.StringTokenizer;


public class Operaciones_Cadenas {

    
    public static void reves(String ej){
        String vuelta = " ";
        for (int i=ej.length()-1; i>=0; i--){
            //convertimos char a string
            vuelta=Character.toString(ej.charAt(i)); 
            System.out.print(vuelta);         
        }   
    }
    
     public static void reves2(String ej){
        StringBuilder builder=new StringBuilder(ej);
         String reves=builder.reverse().toString();
        System.out.println(reves);     
    }
 //lid    
     public static String reves4(String ej){
            int i;
            String vuelta=" ";     //iniciar a valor vacío
            
            for (i = ej.length()-1; i>=0; i--){
                vuelta=vuelta+ej.charAt(i);
            }
            return vuelta;           
            
    }
     
     //em
    public static String reves3(String ej){
        if (ej == null) return ej;
        String ej2 = "";
    for (int i = ej.length() - 1; i >= 0; i--) ej2 = ej2 + ej.charAt(i);
       return ej2; 
    }
     
     public static void sinEspacios (String ej){
         
         String vuelta = " ";
         for (int i=0; i < ej.length(); i++) {
                if (ej.charAt(i) != ' '){
                    //vuelta += ej.charAt(i);   Así si quieres que te lo repita las veces que posea el índice
                    vuelta=Character.toString(ej.charAt(i)); 
                    System.out.print(vuelta);
                }
        } 
     }
     
     //em
    public static String sinEspacios2(String ej){
        if (ej == null) return ej;
        
    String s2 = "";
    for (int i = 0; i < ej.length(); i++){
        if (isSpaceChar(ej.charAt(i))==false)
            s2 = s2 + ej.charAt(i);      
    }
       return s2; 
    }
    
    //lid:
    public static String sinEspacios3 (String ej){
        String cadenaSinEspacios;
         cadenaSinEspacios=ej.replace(" ","");
         // busca todos los del primer parametro "p" y los reemplaza por los del segundo parametro "o"
       return cadenaSinEspacios;     
    }
     
     
    public static void palindromo(String ej) {  //cambiar para que no reconozca espacios ni acentos ni mayusc

        int fin = ej.length()-1;
        int ini=0;
        boolean espalind=true;
        
        while(ini < fin){
            if(ej.charAt(ini)!=ej.charAt(fin)){
                espalind=false;
            }
        ini++;
        fin--;
        }
        if(espalind)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");
    }
   // ---------------------------------------
//em:

    public static boolean palindromo2(String ej){
        if (sinEspacios2(ej).equalsIgnoreCase(reves3(sinEspacios2(ej)))) return true;
        else return false;
    }
    public static boolean palindromo3(String ej){
        if (sinEspacios2(ej).equalsIgnoreCase(reves3(sinEspacios2(ej)))) return true;
        else return false;
    }
    
    //lid:
    public static boolean palindromo4 (String ej){//se escribe igual al derecho y reves
        ej=ej.toUpperCase(); //convierto mayusculas y guardo mayusculas en cadena
        ej=Operaciones_Cadenas.sinEspacios3 (ej); //aplico metodo quitar espacios y guardo eso en cadena
        if (ej.equals(reves4(ej))){ //comparo cadena de parametro con metodo cadena al reves
            return true;
        }else{
            return false;            
        } 
     }
     //--------------------------------------------
    //método para calcular el número de veces que se repite un carácter en un String
    public static int aparicionesPalabra(String cadena, String caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        System.out.print("Se ha encontrado "+caracter+" "+contador +" veces");
        return contador;
    }

    //em:
        public static int aparicionesPalabra2(String cadena, String caracter) {
        int contador = 0;
        while (cadena.indexOf(caracter) > -1) {
          cadena = cadena.substring(cadena.indexOf(caracter)+caracter.length(),cadena.length());
          contador++; 
        }
        System.out.print("Se ha encontrado "+caracter+" "+contador +" veces");
        return contador;
    }
//ocurrenciasPatron: Nos mostrará todas las palabras en un texto que empiezan por un determinado conjunto
//de caracteres. Se le pasa como parámetros tanto el texto como el conjunto de caracteres por el que deben empezar las palabras. 
//Devolverá un String que contenga el conjunto de palabras que empieza por el patrón indicado separadas por comas.
//La búsqueda se realizará independientemente de si el conjunto de caracteres está o no en mayúsculas o minúsculas. 
    //em:
    public static String ocurrenciasPalabra(String ej, String caracteres) {
        String vuelta = "";
        String[] palabras = ej.split(" ");
        for (int i=0; i<palabras.length; i++){

            if (palabras[i].toUpperCase().startsWith(caracteres.toUpperCase()))
                vuelta=vuelta+palabras[i]+", ";
        }
        System.out.print(vuelta);
        return vuelta;
    } 
    
         public static String ocurrenciasPatron (String frasecita, String patron){
         //muestra palabras q comienzan x determinado patron
        frasecita=frasecita.toUpperCase();
        patron=patron.toUpperCase();
        String suma="";
     
        String [] cadenas = frasecita.split(" ");
        for(int i = 0; i<cadenas.length; i++){
            if (cadenas[i].startsWith(patron))
                 suma=suma + cadenas[i] + ", ";
     }
       return suma ;
     }
//sustituirPalabra: En base a una palabra dada sustituir todas sus ocurrencias en una cadena por otra palabra dada. 
//Debe solicitar al usuario si quiere que se distinga entre mayúsculas y minúsculas a la hora de hacer la sustitución. 
//Este método tendrá 4 argumentos: 
// Cadena en la que se va a hacer la sustitución 
// Cadena que se quiere sustituir(la que se va a eliminar) 
// Cadena con la que sustituir(la nueva) 
// Un booleano para indicar si se hace o no distinción entre mayúsculas y minúsculas. 
//El método devolverá una cadena con el resultado de la sustitución
   
    public static String sustituirPalabra(String sTexto, String sTextoBuscado, String sTextoNuevo, boolean maYus) {
        String vuelta = "";
        String[] partes = sTexto.split(" ");
        if (maYus){
            for (int i=0; i<partes.length; i++){
                if (partes[i].toUpperCase().equals(sTextoBuscado.toUpperCase())) vuelta=vuelta+sTextoNuevo+" ";
                else vuelta=vuelta+partes[i]+" ";
            }
        }
        else {
            for (int i=0; i<partes.length; i++){
                if (partes[i].equals(sTextoBuscado)) vuelta=vuelta+sTextoNuevo+" ";
                else vuelta=vuelta+partes[i]+" ";
            }
        } 
        System.out.print(vuelta);
        return vuelta;
    }

    //lid:
    public static String sustituirPalabra2(
            String cadenaEntrada,       //Cadena de texto en la que sustituiremos cadenas
            String palabraBusqueda,     //Palabra que buscaremos
            String cadenaSustitucion,   //Palabra por la que sustituiremos la palabra de busqueda
            boolean caseSensitive)      //Indica si es sensible a mayusculas y minusculas
    {     
        String salida=cadenaEntrada;//Creamos una variable para guardar los cambios
        if(caseSensitive){//Si es sensible a mayusculas y minúsculas simplemente hacemos un replaceAll
            salida=cadenaEntrada.replaceAll(palabraBusqueda, cadenaSustitucion);
        }else{//Si no lo es:
            //Almacenamos la cadena en minusculas
            String cadenaMinus=cadenaEntrada.toLowerCase();
            //Almacenamos la cadena que buscamos en minúsculas
            String busquedaMinus=palabraBusqueda.toLowerCase();
            
            //Buscamos la primera coincidencia
            int posicionCoincidencia= cadenaMinus.indexOf(busquedaMinus);
            
            while(posicionCoincidencia>-1){//Mientras que haya coincidencias
                //Guardamos la parte de la cadena original anterior a la palabra
                String cadenaAntesPalabra = cadenaEntrada.substring(0, posicionCoincidencia);
                //Guardamos la parte de después de la palabra
                String cadenaDespuesPalabra = cadenaEntrada.substring(posicionCoincidencia + palabraBusqueda.length());
                
                //En la salida vamos almacenando lo que habia antes de la palabra, la palabra por la que queremos sustituir y lo que había después
                salida= cadenaAntesPalabra + cadenaSustitucion + cadenaDespuesPalabra;
                //Eliminamos la cadena que ya hemos encontrado de la cadena en la que buscamos
                cadenaMinus=cadenaMinus.replaceFirst(busquedaMinus, cadenaSustitucion.toUpperCase());
                //PLUS; sustituyo por la cadena en mayúsculas para evitar que pueda encontrarlode nuevo en próximos rastreos
                
                //Almaceno la posición de la próxima coindidencia
                posicionCoincidencia= cadenaMinus.indexOf(busquedaMinus);
            }
        }
        
        return salida;
    }

     // Valida si una cadena tiene el formato de fecha dd/mm/aaaa
    public static boolean validaNumeroFecha(String texto) {
       return texto.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$");
    }

    // Valida si una cadena tiene el formato de DNI
    public static boolean validaNumeroDNI(String texto) {
       return texto.matches("[0-9]{7,8}[A-Za-z]");
    }

    // Valida si una cadena tiene el formato de email
    public static boolean validaNumeroEmail(String texto) {
       return texto.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    public static String conversionesMayusMin (String cadena){
        String cadenaMayuscula=cadena.toUpperCase(); //convierto mayusculas
        String cadenaMinuscula=cadena.toLowerCase(); //convierto minusculas         
        return cadenaMayuscula;//o cadenaMinuscula
    }
    
    public static boolean comparoIgnoroMayusMin (String cadena, String cadenaComparar){
        boolean cadenaComparada=cadena.equalsIgnoreCase(cadenaComparar); //comparo e ignoro 
        return cadenaComparada;
    }
}








