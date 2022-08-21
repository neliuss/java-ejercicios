package gestionEmpleadosInterfaz;

public class Empleado {

    private String nombre;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado " + nombre);
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return "Constructor de Empleado " + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
