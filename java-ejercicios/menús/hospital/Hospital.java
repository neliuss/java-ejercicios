package hospital;

import java.util.ArrayList;

public class Hospital{

    private final String nombre;

    private final String direccion;

    public ArrayList<Empleado> Empleados = new ArrayList<>();

    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Empleado getEmpleados(int i) {
        return Empleados.get(i);
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void anadirEmpleado(Empleado e) {
        Empleados.add(e);
    }

    public void mostrarEmpleado() {
        System.out.println("Lista de empleados del "+this.nombre);
        for (int i = 0; i < Empleados.size(); i++) {
            System.out.println((i+1)+". "+Empleados.get(i));
        }
    }
}
