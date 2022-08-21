package empleados;

public class Oficial extends Operario {

    public Oficial(String nombre) {
        super(nombre);
    }

    public Oficial() {
    }

    @Override
    public String toString() {
        return super.toString()+" :Oficial";
    }
}
