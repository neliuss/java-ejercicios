package comparable_comparator;
import java.util.ArrayList;
import java.util.Collections;
public class operaciones {
       /* Ejemplo Interface Comparator aprenderaprogramar.com */

    public static void main(String arg[]) {

        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        listaPersonas.add(new Persona(1,"Maria",185));

        listaPersonas.add(new Persona(2,"Carla",190));

        listaPersonas.add(new Persona(3,"Yovana",170));

        Collections.sort(listaPersonas);  // Ejemplo uso ordenación natural

        System.out.println("Personas Ordenadas por orden natural: "+listaPersonas);
        
        Collections.sort(listaPersonas, new OrdenarPersonaPorAltura());

        System.out.println("Personas Ordenadas por altura total: "+listaPersonas);
        
        System.out.println("Pruebas con lambda:");
        ArrayList<Persona> listaPersonas2 = new ArrayList<Persona>();
        listaPersonas2.add(new Persona(1,"Maria",185));
        listaPersonas2.add(new Persona(2,"Carla",190));
        listaPersonas2.add(new Persona(3,"Yovana",170));
        
        listaPersonas2.sort((pa,pb)->pa.getNombre().compareTo(pb.getNombre()));
        listaPersonas2.forEach(System.out::println);

     //   listaPersonas2.sort((pa,pb)->pa.getIdPersona().compareTo(pb.getIdPersona()));
     //   listaPersonas2.forEach(System.out::println);
        

      } 

}
     

    
