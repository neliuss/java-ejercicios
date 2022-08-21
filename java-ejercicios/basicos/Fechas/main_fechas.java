package Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class main_fechas {

    public static void main(String[] args) {
        
        LocalDate date2 = LocalDate.of(2018, 10, 30);
        LocalDate date3 = LocalDate.parse("2018-10-30");
        System.out.println(date2);
        System.out.println(date3);
        
        System.out.println("-----");
        LocalDate date = LocalDate.parse("2018-10-30");
        LocalDate newDate = date.plusDays(10);  //le sumamos 10 días
        System.out.println(date);
        System.out.println(newDate);
        
        System.out.println("---Valida si una fecha es antes que otra--");
        System.out.println(LocalDate.parse("2018-10-30").isBefore(LocalDate.parse("2018-10-31")));
        //Salida    true
        
        System.out.println("---Valida si un año es bisiesto:--");
        System.out.println(LocalDate.parse("2018-10-30").isLeapYear());
        //Salida   false
        
        System.out.println("---Obtener el día de la semana de mi cumpleaños:--");
        System.out.println(LocalDate.parse("2019-08-19").getDayOfWeek());
        //Salida   1        MONDAY
        
        System.out.println("---Extraer información de una fecha, conocer el día:--");
        System.out.println(LocalDate.parse("2019-08-19").getDayOfWeek());
        //Salida   1       MONDAY
        
        //LOCALTIME:        LocalTime representa una hora sin la fecha, del mismo modo que con LocalDate podemos crearlo 
        //haciendo uso de los métodos now(), parse(..) y of(..), ejemplos:
        System.out.println("--LOCALTIME Formas de crear un objeto---");
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.parse("11:00:59.759");
        LocalTime time3 = LocalTime.of(11, 00, 59);
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);
        //Salida  11:02:06.198      11:00:59.759        11:00:59 
        
        //OPERACIONES LOCALTIME
        System.out.println("--MODIFICA---");
        LocalTime time4 = LocalTime.parse("11:00:59.759");
        LocalTime time5 = time.plusHours(1);    //sumamos una hora
//en una fila:
        LocalTime time6 = LocalTime.parse("11:00:59.759").plusHours(1);
        System.out.println(time6);
        //Salida        12:00:59.759
        
        System.out.println("--VALIDAR---");
        LocalTime time7 = LocalTime.parse("11:00:59.759");
        LocalTime time8 = LocalTime.parse("12:00:59.759");
        System.out.println(time7.isBefore(time8));
        //Salida        true
        
        System.out.println("--extraer solo una parte del objeto LocalTime:---");
        LocalTime time9 = LocalTime.parse("11:00:59.759");
        System.out.println(time9.getHour()+" horas");
        //Salida
        
        //LOCALDATETIME: Combinación entre LocalDate y LocalTime:

        System.out.println("--Creación Localdatetime---");
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime1=LocalDateTime.of(2018, 10, 10, 11, 25);
        LocalDateTime dateTime2=LocalDateTime.parse("2018-10-10T11:25");
        System.out.println(dateTime);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        //Salida        2018-10-30T11:46:58.274     2018-10-10T11:25        2018-10-10T11:25
        
        System.out.println("--Manipular un LocalDateTime:---");
        LocalDateTime dateTime3=LocalDateTime.parse("2018-10-10T11:25");
        LocalDateTime newDateTime4 = dateTime3.plusDays(1).plusHours(2);    //  le agregará 1 día y después 2 horas,
        System.out.println(newDateTime4);

//en una fila:
        LocalDateTime dateTime5=LocalDateTime.parse("2018-10-10T11:25").plusDays(1).plusHours(2);
        System.out.println(dateTime5);
        //Salida
        
        System.out.println("--Realizar validaciones sobre un LocalDateTime---");
        LocalDateTime dateTime6=LocalDateTime.parse("2018-10-10T11:25");
        LocalDateTime dateTime7=LocalDateTime.parse("2019-10-10T11:25");
        System.out.println(dateTime6.isBefore(dateTime7));
        //Salida    true
        
        System.out.println("-----");
       
        //Salida
   }
    
}
 


