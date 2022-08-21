package hospital;

public class Medico extends Empleado {

    private final String especialidad;

    public Medico(String nombre, String dni, float sueldo, String especialidad) {
        super(nombre, dni, sueldo);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString()+": Medico con especialidad: "+especialidad;
    }
}
