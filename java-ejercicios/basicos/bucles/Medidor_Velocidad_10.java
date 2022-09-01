package bucles;

import java.util.*;
//Importamos todas las clases de java utils.

class Medidor_Velocidad_10 {
    public static void main (String args []) {
        Calendar start = Calendar. getInstance();
        /*Usamos la clase calendar y creamos una variable de ella llamada start y que contiene el tiempo
        del sistema (visto en el otro ejercicio)*/
        int startMinute = start.get(Calendar. MINUTE);
        // Obtener el minuto del tiempo que nos da.
        int startSecond = start.get(Calendar. SECOND);
        // Obtener el segundo del tiempo que nos da.
        start.roll(Calendar.MINUTE, true);
        // metodo de calendar llamado roll que nos permite mover el tiempo hacia delante.
        // Es decir un minuto despues de los valores.
        int nextMinute = start. get(Calendar. MINUTE);
        // Usamos get para objener el nuevo valor de minuto.
        int nextSecond = start. get(Calendar. SECOND);
        // Usamos get para objener el nuevo valor de segundo.
        int index = 0;
        while ( true) {
        // Al hacer un while true este loop sería infinito, para eso el break del final que lo rompe.
            double x = Math.sqrt(index);
            GregorianCalendar now = new GregorianCalendar();
            // Utilizando la clase Gregorian calendar creamos una variable de el llamada now. 
            if (now. get(Calendar.MINUTE) >= nextMinute) {
                if ( now.get(Calendar.SECOND) >= nextSecond) {
                    break;
                }
            }
            index ++;
            // Aqui usamos dos ifs para que el programa compare si ha pasado un minuto.
            // Si ha pasado entra al break y sale del loop e imprime el mensaje que viene abajo.
        }
        System.out.println(index + " loops in one minute");
        // El tiempo de ejecucion del programa será un minuto, y durante ese tiempo calcula los loop que hizo
    }
    /* Co neste programa podriamos comprobar que ordenador es mas rapido, es decir el que tarde menos en
    procesar los loops.*/
}