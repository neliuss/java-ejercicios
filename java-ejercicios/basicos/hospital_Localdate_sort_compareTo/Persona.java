package hospital_Localdate_sort_compareTo;

import java.time.LocalDate;



public abstract class Persona {
   
    private String dni;
    private String nombreCompleto;
    private String NInss;
    LocalDate fechaNacimiento;
    
    public Persona(String dni, String nombreCompleto, String NInss, LocalDate fechaNacimiento){
        this.dni=dni;
        this.nombreCompleto=nombreCompleto;
        this.NInss=NInss;
        this.fechaNacimiento=fechaNacimiento;
    }
    
    public Persona(){
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNInss() {
        return NInss;
    }

    public void setNInss(String NInss) {
        this.NInss = NInss;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", NInss=" + NInss + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public abstract void devolver_edad();
    
    
}
