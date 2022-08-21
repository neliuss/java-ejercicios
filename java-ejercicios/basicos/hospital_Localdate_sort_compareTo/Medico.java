package hospital_Localdate_sort_compareTo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Paciente {
    private String numColeg;
    private ArrayList<Paciente> listaPacientes= new ArrayList<Paciente>();
    
    public Medico(String numeroHistorial, String dni, String nombreCompleto, String NInss, LocalDate fechaNacimiento, ArrayList<Paciente> listaPacientes){
        super( numeroHistorial, dni, nombreCompleto, NInss, fechaNacimiento);
        this.numColeg=numColeg;
        this.listaPacientes=listaPacientes;
    }

    public String getNumColeg() {
        return numColeg;
    }

    public void setNumColeg(String numColeg) {
        this.numColeg = numColeg;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    @Override
    public String toString() {
        return "Datos del médico: " + " Número del historial: " + numeroHistorial + ". DNI: " +super.getDni()+". Nombre: "+super.getNombreCompleto()
                + ". Número de la Seg.Social: "+ super.getNInss()+". Fecha de nacimiento: "+super.getFechaNacimiento()
                +"numColeg=" + numColeg + ", listaPacientes=" + listaPacientes + '.';
    }


    @Override
    public void devolver_edad(){
       listaPacientes.sort((Paciente s1, Paciente s2)->s1.getFechaNacimiento().compareTo(s2.getFechaNacimiento()));
       listaPacientes.forEach((s)->System.out.println(s));

    }
    
    public void ordenar_pac_nombre(){
        listaPacientes.sort((Paciente s1, Paciente s2)->s1.getNombreCompleto().compareTo(s2.getNombreCompleto())); 
        listaPacientes.forEach((s)->System.out.println(s)); 
        
    }
    
    public static void mostrar_pacientes( ArrayList<Paciente> listaPacientes){
        for (int i=0; i<listaPacientes.size(); i++){
            System.out.println("posicion: " + i + ". Paciente : " + listaPacientes.get(i));  
    }
    }
}
