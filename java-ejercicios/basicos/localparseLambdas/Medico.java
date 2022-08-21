package localparseLambdas;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Medico extends Persona {
    
    private String num_colegiado;
    ArrayList<Paciente> pacientes;
    
    public Medico( String dni, String nombrecompleto, String direccion, String NInss, LocalDate fechaNacimiento,String num_colegiado) {
        super(dni, nombrecompleto, direccion, NInss, fechaNacimiento);
        this.num_colegiado = num_colegiado;
        pacientes=new ArrayList<>();
    }

    public String getNum_colegiado() {
        return num_colegiado;
    }

    public void setNum_colegiado(String num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    @Override
    public String toString() {
        return "Medico{" +super.toString()+ "num_colegiado=" + num_colegiado + '}'+"pacientes:"+pacientes.toString();
    }
    
    @Override
    public Period devolver_edad(){
        
        LocalDate finLocalDate = LocalDate.now();  
     
        pacientes.sort((Paciente a,Paciente b)->b.getFechaNacimiento().compareTo(a.getFechaNacimiento()));
        //las pongo al revés para que me dé primero la más reciente
        //pacientes.forEach((s)->System.out.println(s)); 
        Period periodo=Period.between(pacientes.get(0).getFechaNacimiento(),finLocalDate);
        //ahora calculo la diferencia con la fecha actual
    return periodo;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void ordenar_pacientes_por_nombre()
    {
         pacientes.sort((Paciente a,Paciente b)->a.getNombrecompleto().compareTo(b.getNombrecompleto()));
    }
  
}
