package hospital_Localdate_sort_compareTo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Paciente extends Persona {
    
    public String numeroHistorial;
    

    public Paciente(String numeroHistorial, String dni, String nombreCompleto, String NInss, LocalDate fechaNacimiento){
        super(dni, nombreCompleto, NInss, fechaNacimiento);
        this.numeroHistorial=numeroHistorial;
    }

    public String getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(String numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    @Override
    public String toString() {
        return " Datos Paciente: " + "numeroHistorial=" + numeroHistorial + "DNI: " +super.getDni()+". Nombre: "+super.getNombreCompleto()
                + ". Número de la Seg.Social: "+ super.getNInss()+". Fecha de nacimiento: "+super.getFechaNacimiento();
    }

    @Override
    public void devolver_edad(){

            java.time.LocalDate start = java.time.LocalDate.parse("1977-04-27");
            java.time.LocalDate end = LocalDate.now();
            int difday = Period.between(start, end).getYears();
            System.out.println(difday);
            
    }
        
 
            public int compareTo(Paciente o) {
            return this.fechaNacimiento.compareTo(o.fechaNacimiento);}
}

 
