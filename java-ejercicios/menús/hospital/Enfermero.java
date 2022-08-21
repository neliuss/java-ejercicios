package hospital;

public class Enfermero extends Empleado {

    private float plus;

    public Enfermero(String nombre, String dni, float sueldo) {
        super(nombre, dni, sueldo);
    }
    
    public void plusEnfermero(float plus) {
        this.plus = 0;
    }

    @Override
    public String toString() {
        return super.toString()+": Enfermero y su plus: "+plus;
    }
    
}
