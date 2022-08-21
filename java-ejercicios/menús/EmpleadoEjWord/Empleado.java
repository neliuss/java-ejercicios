package EmpleadoEjWord;

public class Empleado {

    private String nombre;

    public Empleado(String nombre) {
        this.nombre=nombre;
        System.out.println("Constructor  Empleado "+nombre);
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "El nombre del empleado es "+nombre;
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public  String setNombre() {
        this.nombre=nombre;
        return "Constructor de Empleado "+nombre;
    }
}
