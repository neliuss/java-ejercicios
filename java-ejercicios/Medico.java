package Ej1;
import java.util.ArrayList;

public class Medico {

    private String nombre;

    private String colegiado;
    
    private ArrayList<Paciente> Pacientes= new ArrayList<Paciente>();

    public Medico(String nombre, String colegiado) {
        this.nombre=nombre;
        this.colegiado=colegiado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getColegiado() {
        return this.colegiado;
    }

    public void setColegiado(String colegiado) {
        this.colegiado=colegiado;
    }

    public Paciente getPacientes(Paciente paciente1) {
        return paciente1;
    }

    @Override
    public String toString() {
        return "Médico:"+nombre+". Colegiado:"+colegiado;
    }
}
