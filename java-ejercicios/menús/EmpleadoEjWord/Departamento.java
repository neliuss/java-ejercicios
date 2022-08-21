package EmpleadoEjWord;
import java.util.ArrayList;

public class Departamento implements IDepartamento {

    private String nombre;
    //ArrayList<Tipo_Dato>Variable_array=new ArrayList<tipo_dato>();        en nuestro caso, Tipo_dato es un objeto de la clase Empleado
    private ArrayList<Empleado> Empleados= new ArrayList<Empleado>();

    public Departamento(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void recorrer() {
        System.out.println("Lista de empleados de "+ this.nombre);
        for (int x=0;x<Empleados.size(); x++) {     //método propio de array para conocer su tamaño.
            System.out.println(" "+Empleados.get(x));    //método propio de array para devolver un elemento.
        }
    }

    @Override
    public Empleado getEmpleados(int i) {
        return Empleados.get(i);
    }

    @Override
    public void setEmpleados(Empleado Empleado1) {  //método propio de array para añadir un elemento.
        Empleados.add(Empleado1);
    }
}
