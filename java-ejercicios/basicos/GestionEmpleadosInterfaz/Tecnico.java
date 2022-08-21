package GestionEmpleadosInterfaz;

public class Tecnico extends Operario {

    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de Tecnico");
    }

    @Override
    public String toString() {
        return super.toString() + " : Tecnico";
    }
}
