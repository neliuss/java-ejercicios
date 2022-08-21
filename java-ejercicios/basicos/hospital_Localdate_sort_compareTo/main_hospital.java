package hospital_Localdate_sort_compareTo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class main_hospital {

    public static void main(String[] args) {
//String numeroHistorial, String dni, String nombreCompleto, String NInss, LocalDate fechaNacimiento){
    //    java.time.LocalDate fec1 = java.time.LocalDate.parse("1977-04-27");
        Paciente paciente1= new Paciente("001", "567598741", "Jorge López", "15034956", LocalDate.of(1990, 1, 2));
        java.time.LocalDate fec2 = java.time.LocalDate.parse("1988-04-18");
        Paciente paciente2= new Paciente("003", "367898741", "Jorge Luces", "15034956", fec2);
        java.time.LocalDate fec3 = java.time.LocalDate.parse("1897-08-27");//para probar ordenamiento, ya sé que es improbable esta edad
        Paciente paciente3= new Paciente("008", "32598998", "Juan López", "15034956", fec3);
        java.time.LocalDate fec4 = java.time.LocalDate.parse("2000-06-07");
        Paciente paciente4= new Paciente("005", "32798214", "Ana Luaces", "15034956", fec4);
  
        ArrayList<Paciente> listaPacientes= new ArrayList<Paciente>();
        listaPacientes.add(paciente1);
        listaPacientes.add(paciente2);
        listaPacientes.add(paciente3);
        listaPacientes.add(paciente4);
       
//String numeroHistorial, String dni, String nombreCompleto, String NInss, LocalDate fechaNacimiento, ArrayList<String> listaPacientes){
        Medico med1= new Medico("0030", "123432123", "Alba Torres", "15678945", LocalDate.of(1980, 10, 12), listaPacientes);
        Medico med2= new Medico("0066", "896432123", "Eduardo Pérez", "78978945", LocalDate.of(1999, 11, 2), listaPacientes);
        Medico med3= new Medico("0015", "432432123", "Rocío Garrido", "67278945", LocalDate.of(1980, 9, 1), listaPacientes);
        
        
        System.out.println("Lista de pacientes completa:");
        Medico.mostrar_pacientes(listaPacientes);
        
        ArrayList<Medico> listaMedicos= new ArrayList<Medico>();
        listaMedicos.add(med1);
        listaMedicos.add(med2);
        listaMedicos.add(med3);

        System.out.println("Lista de médicos con sus pacientes completa:");
        recorrer(listaMedicos);

       System.out.println("Pacientes ordenados por edad:"); 
       listaPacientes.sort((Paciente s1, Paciente s2)->s1.getFechaNacimiento().compareTo(s2.getFechaNacimiento()));
       listaPacientes.forEach((s)->System.out.println(s));
  
       System.out.println("Pacientes ordenados por nombre:");  
       listaPacientes.sort((Paciente s1, Paciente s2)->s1.getNombreCompleto().compareTo(s2.getNombreCompleto())); 
       listaPacientes.forEach((s)->System.out.println(s)); 
       
       System.out.println("Médicos ordenados por edad:"); 
       listaPacientes.sort((Paciente s1, Paciente s2)->s1.getFechaNacimiento().compareTo(s2.getFechaNacimiento()));
       listaPacientes.forEach((s)->System.out.println(s));
  
       System.out.println("Médicos ordenados por nombre:");  
       listaMedicos.sort((Medico s1, Medico s2)->s1.getNombreCompleto().compareTo(s2.getNombreCompleto())); 
       listaMedicos.forEach((s)->System.out.println(s)); 
       
       System.out.println("Búsqueda por DNI:");  
       //Buscamos el dni: 23456778
       
                                                        
                                 for (int i=0; i<listaPacientes.size(); i++){  
                                    if( listaPacientes.get(i).getDni().startsWith("23456778" ))
                                     System.out.println(listaPacientes.get(i));  
                                 }
                                 
                                 
    }
    
    public static void recorrer( ArrayList <Medico> array){        

        for (Medico e: array){
            System.out.println(e.toString());
        }
    }
    
    public static int aparicionesPalabra(String cadena, String caracter) {
        int contador = 0;
        while (cadena.indexOf(caracter) > -1) {
          cadena = cadena.substring(cadena.indexOf(caracter)+caracter.length(),cadena.length());
          contador++; 
        }
        System.out.print("Se ha encontrado "+caracter+" "+contador +" veces");
        return contador;
        }
}
