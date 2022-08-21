 //----------STRING  CARACTERES-----
        //métodos comunes
        /*length():devuelve la longitud de una cadena de caracteres
        charAt(n):devuelve la posición de un caracter dentro de una cadena (posiciones a contar desde cero)
        ej: minombre=juan   minombre.charAt(2):devuelve la a
        substring(x,y):devuelve una subcadena dentro de la cadena, siendo x el caracter a partir del cual se 
                extrae, e Y el número de caracteres q se quiere extraer.
        equals(cadena):devuelve true si dos cadenas que se comparan son iguales,y false si no lo son. Distingue Mayusc de minusc.
        equalsignoreCase(cadena):igual que el anterior, pero sin tener en cuenta mayusc y minúsculas. 
       */
package varios;

public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="alex";
        System.out.println("Mi nombre es "+nombre);
        System.out.println("Mi nombre tiene "+nombre.length()+" letras.");
        System.out.println("La segunda letra de "+nombre+" es "+nombre.charAt(1));
        //para saber lal última letra, sea el nombre que sea:
        int ultima_letra;
        ultima_letra=nombre.length();
        System.out.println("La última letra de mi nombre es "+nombre.charAt(ultima_letra-1));//ojo al -1
        System.out.println ("----------------------------------------------------------------");
        
        String frase="Hoy es un estupendo día para aprender a programar en java";
       // String frase_resumen=frase.substring(1, 3);índice de la primera letra a mostrar, índice de la letra donde no quieres seguir mostrando
      // String frase_resumen=frase.substring(29, 58);
       String frase_resumen=frase.substring(0, 29)+" irnos a la playa y "+frase.substring(29,57);
        System.out.println(frase_resumen);
        System.out.println ("----------------equals compara cadenas---------------------------------------");
        
        String alumno1,alumno2;
        alumno1="David";
        alumno2="david";
        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }  
}
