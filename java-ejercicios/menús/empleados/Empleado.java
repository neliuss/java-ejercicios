package empleados;

public class Empleado {

    private String nombre;
    

    public Empleado(String nombre) {
         this.nombre=nombre;
    }

    public Empleado() {
        
    }

    public void  setNombre(String nombre) {
        this.nombre=nombre;
        //return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado"+nombre;
    }
}
