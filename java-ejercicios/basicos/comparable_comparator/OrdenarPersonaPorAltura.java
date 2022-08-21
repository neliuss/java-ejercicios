
package comparable_comparator;
    import java.util.Comparator;

public class OrdenarPersonaPorAltura implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
    return o1.getAltura() - o2.getAltura(); // Devuelve un entero positivo si la altura de o1 es mayor que la de o2
    }
}

