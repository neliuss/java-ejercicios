package condicionales;

class ternario{
    
   /* El operador ternario consiste en transformar un codigo con mucho contenido en uno
    más simplificado pero que haga exactamente lo mismo.*/
    
    public static void main (String [] args){
        /*
        int puntuacion = 3;
        char grupo ='C';
        if (puntuacion >= 5) {
            System.out.println("Enhorabuena has aprobado");
            System.out.println("Tu nota final es: " + puntuacion);
            grupo = 'A';
        }
        else{
            System.out.println("Lo siento has suspendido");
            System.out.println("Tu nota final es: " + puntuacion);
            grupo = 'B';
        }
        */
        
        /* TENEMOS EL PROGRAMA QUE HICIMOS ANTES (Ver Elses_ifs_05.java", vamos a transformarlo: */
        
        int puntuacion = 7;
        char grupo ='C';
        String mensaje;
        mensaje = (puntuacion >= 5) ? "Enhorabuena has aprobado " + "Tu nota final es: "
                  +puntuacion : "Lo siento has suspendido" + " Tu nota final es: " + puntuacion;
        // Puntuacion >= es la condicion a cumplir entre (). 
        // El ? que va despues es una interrogación de cierre.
        // Despues lo que esta entre "" hasta la primera puntuacion es que haga eso si es true
        // Los dos puntos es para limitar que hasta ahi es el true, separar del false basicamente
        // El resto es que se haga si es false.
        
        System.out.println(mensaje);
        
        
        
        //Para entender mejor el operador ternario veamos un ejemplo mas simple:
        
        String genero = "";
        System.out.println( ( genero. equals ( " hombre " )) ? "Sr. " : "Sra. ");
        // Aqui estamos dando un ejemplo de lo que tiene que devolver si es Sr o Sra.
        // La primera "genero" es una condiciona a comprobar, es decir una variable "genero" sea "hombre". Si la condicion es true devuelve Sr.
        // El ? para separar condicion de resultado que devuelve.
        // El : para separar el true del false. Lo entendemos mejor como True : False.
        // En resumen si genero es hombre se va al primer contenido o sea Sr. y sino va al contenido despues de los :
        // Condicion.metodo (Comparar con esta variable) ? True : False        
    }
}