package gestionEmpleadosInterfaz;

import java.util.ArrayList;

public class Departamento implements IDepartamento {

    private String nombre;

    private ArrayList<Empleado> Empleados =new ArrayList<Empleado>() ;

    public Departamento(String nombre) {
       this.nombre=nombre;
    }
    public void Recorrer(){
        System.out.println("Lista de empleados del "+ this.nombre);
        for(int x=0;x<Empleados.size();x++) 
        {
        System.out.println(" " +Empleados.get(x));
        }
    }
    public Empleado getEmpleados(int i) {
        return Empleados.get(i);
    }

    public void setEmpleados(Empleado Empleado1 ) {
        Empleados.add(Empleado1);
    }
}
