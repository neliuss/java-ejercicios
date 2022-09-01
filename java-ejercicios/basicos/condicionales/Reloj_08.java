package condicionales;

import java.util.Calendar;
// Importar una libreria para poder usar la clase Calendar.

class Reloj{
    public static void main (String [] Args){
        // Ahora vamos a poner todo lo que vimos junto en un programa mas trabajado.
        
        // obtener fecha y hora actual.
        Calendar ahora = Calendar.getInstance();
        // Creamos un objeto ahora de la clase calendar y es donde se va a contener la fecha y la hora actual de nuestro sistema.
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        // Aqui vemos que llama al metodo HOUR_OF_DAY de la clase calentar o sea dame la hora de la clase calendar.
        int minuto = ahora.get(Calendar.MINUTE);
        int mes = ahora.get(Calendar.MONTH) + 1;
        int dia = ahora.get(Calendar.DAY_OF_MONTH);
        // El 1 se lo sumamos porque empieza a contar de 0 desde Enero, o sea Enero no es 1 sino 0 por eso le sumamos 1.
        int an = ahora.get(Calendar.YEAR);
        // Se abren variables para contener la hora, minuto, mes, dia y año que este marcando nuestro sistema, lo hace a traves del objeto calendar.
        
        // Mostrar saludo
        if (hora < 12) {
            System.out.println("Buenos dias.\n");
        } else if (hora < 17) {
            System.out.println("Buenas tardes.\n");
        } else {
            System.out.println("Buenas noches.\n");
        }
        // Condicionales para mostrar distintos mensajes leyendo la variable hora. En este caso if hora es menor que 12 Buenos dias, si no es asi entra abajo 
        // Si 12 es menos que 17 dice Buenas tardes y sino Buenas noches.
        
        // Iniciar el mensaje horario mostrando las horas.
        System.out.print("Son las");
        System.out.print(" ");
        System.out.print( (hora > 12) ? (hora - 12) : hora );
        // Como vimos antes operador ternario, primero condicion, si hora es mayor que 12, si es true le resta 12 y si es false muestra la hora.
        // Esto se hace asi para que no muestre las 13, 14, 15... por eso le resta 12 si es true. Ejemplo si son las 17:00 al resta 12 nos dice las 5.
        System.out.print(" horas ");
        
        // Mostrando los minutos
        
        if (minuto != 0) {
            // Primero le decimos que los minutos aparezcan si no son 0.
            System.out.print(minuto + " ");
            System.out.print((minuto != 1) ? "minutos " : "minuto ");
            // Pusimos que reconozca un condicional, si es distinto de 1 nos saldrá minutos porque son 2 minutos o 3, y si es 1 entra por el true o sea minuto.
        }
        
        // mostrar el dia
        System.out.print( "del dia " + dia + " de ");
        
        // mostrar el nombre del mes
        switch (mes) {
            case 1:
                System.out.print("Enero");
                break;
            case 2:
                System.out.print("Febrero");
                break;
            case 3:
                System.out.print("Marzo");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Mayo");
                break;
            case 6:
                System.out.print("Junio");
                break;
            case 7:
                System.out.print("Julio");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Septiembre");
                break;
            case 10:
                System.out.print("Octubre");
                break;
            case 11:
                System.out.print("Noviembre");
                break;
            case 12:
                System.out.print("Diciembre");
                break;
        }
        
        //mostrar año
        System.out.print( " de " + an + ".\n");
    }
}