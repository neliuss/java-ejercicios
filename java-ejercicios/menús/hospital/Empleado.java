package hospital;

public class Empleado implements IEmpleado {

    private final String nombreCompleto;

    private final String dni;

    private float sueldo;

    public Empleado(String nombreCompleto, String dni, float sueldo) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public float setSueldo(float sueldo) {
        return this.sueldo = sueldo;
    }

    @Override
    public float getSueldo() {
        return sueldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + nombreCompleto + " Sueldo: " + sueldo;
    }
    
}
