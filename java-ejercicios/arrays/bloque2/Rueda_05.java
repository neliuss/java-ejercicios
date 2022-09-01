package bloque2;

class Rueda_05 {
    public static void main (String [] args) {
        // Este programa nos muestra las letras que mas se repiden en determinadas frases.
        String frase [] = {
            "TODA CUESTION TIENE DOS PUNTOS DE VISTA",
            "EL EQUIVOCADO Y EL NEUTRO",
            "TODAS LAS MUJERES TIENEN ALGO HERMOSO",
            "AUNQUE SEA UNA PRIMA LEJANA",
            "SE ESTA MURIENDO GENTE QUE ANTES NO SE MORIA",
            "HE OIDO HABLAR TAN BIEN DE TI",
            "QUE CREIA QUE ESTABAS MUERTO",
            "RECUERDA SIEMPRE QUE ERES CHICO",
            "EXACTAMENTE IGUAL QUE TODOS LOS DEMAS",
            "TODO TIEMPO PASADO FUE ANTERIOR",
            "LOS HONESTOS SON INADAPTADOS SOCIALES",
            "LA VERDAD ABSOLUTA NO EXISTE",
            "Y ESTO ES ABSOLUTAMENTE CIERTO",
            "LO TRISTE NO ES IR AL CEMENTERIO, SINO QUEDARSE",
            "EL AMOR ETERNO DURA APROXIMADAMENTE TRES MESES"
        };
        
        int [] contadorLetras = new int [26];
        for (int contador = 0; contador < frase.length; contador++){
            String actual = frase [contador];
            char [] letras = actual.toCharArray();
            // Cada vez que recorra esto cada frase se convierte en un caracter.
            for (int contador2 = 0; contador2 < letras.length; contador2++) {
                char let = letras[contador2];
                // Abrimos una variable para guardar cada caracter.
                if ( (let >= 'A') & (let <= 'Z')){
                // Usamos este if para eliminar todos los caracteres que no esten entra la A y la Z
                    contadorLetras[let - 'A'] ++;
                    // Aqui sumamos 1 al valor que da porque los arrays empiezan en 0.
                }
            }    
        }
    
        for (char contador = 'A' ; contador <= 'Z' ; contador++) {
            System.out.print( contador + ":" + 
                    contadorLetras [contador - 'A'] +
                    " ") ;
        }
        // Lo que nos devuelve como vemos es el numero de veces que se repite cada letra.
    }
}