package empleados;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    public Directivo() {
    }

    
    
    @Override
    public String toString() {
         return super.toString()+" :Directivo";
    }
}
