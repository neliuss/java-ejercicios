/*

 */
package Collection_Iterator_nodo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class main_nodo {

    public static void main(String[] args) {
        

        int pos;
        Alumno alumno;
        //Declaramos unha nova lista de tipo Alumno
        ArrayList <Alumno> listaxe = new ArrayList<>();
        ArrayList <Alumno> listaxe2 = new ArrayList<>();
        //Engadimos nodos á lista
        listaxe.add(new Alumno("12345678A", "Manuel", "Primeiro", 18));
        listaxe.add(new Alumno("23232323B", "Margarita", "Primeiro", 19));
        listaxe.add(new Alumno("34343434C", "Daniel", "Segundo", 20));
        listaxe.add(new Alumno("45454545D", "Paz", "Segundo", 19));
        //Mostramos o tamaño da lista
        System.out.println("Hai un total de "+listaxe.size()+" alumnos.");
        //Comprobamos se un alumno determinado está na lista
        if (listaxe.contains(new Alumno("45454545D", "Paz", "Segundo", 19))) {
            System.out.println("O alumno atópase matriculado no centro.");
        } else {
            System.out.println("O alumno non se atopa matriculado no centro.");
        }
        
        //Mostramos todos os alumnos da listaxe co iterador
        System.out.println("LISTAXE ALUMNADO");
        System.out.print("Alumnos matriculados: ");        
        Iterator it = listaxe.iterator();
        
        for ( ; it.hasNext(); ){
            Alumno al = (Alumno) it.next();
            System.out.print(al.nome+", ");
        }
        
        System.out.print("\n");
        
        //Engadimos un novo elemento na posición 2
        listaxe.add(2,new Alumno("56565656E", "Diego", "Primeiro", 21));
        //Mostramos de novo todos os alumnos para ver a inserción
        System.out.println("NOVA LISTAXE - Inserción");
        System.out.print("Alumnos matriculados: ");        
        it = listaxe.iterator();
        
        for ( ; it.hasNext(); ){
            Alumno al = (Alumno) it.next();
            System.out.print(al.nome+", ");
        }
        System.out.print("\n");
        //Eliminamos o último elemento da lista
        pos = listaxe.indexOf(new Alumno("45454545D", "Paz", "Segundo", 19));
        listaxe.remove(pos);
        //Mostramos de novo todos os alumnos para ver o borrado
        System.out.println("NOVA LISTAXE - Borrado");
        System.out.print("Alumnos matriculados: ");        
        it = listaxe.iterator();
        
        for ( ; it.hasNext(); ){
            Alumno al = (Alumno) it.next();
            System.out.print(al.nome+", ");
            }
        
        System.out.print("\n");
        
        //Substituimos ao alumno que está na posición 0 por outro
        alumno = listaxe.set(0, new Alumno("76767676F", "Paula", "Primeiro", 19));
       
        System.out.println("Substituise ao alumno con nome "+alumno.nome+", con DNI: "+alumno.dni);
        System.out.println("NOVA LISTAXE - Substituído");
        System.out.print("Alumnos matriculados: ");        
        it = listaxe.iterator();
        
        for ( ; it.hasNext(); ){
            Alumno al = (Alumno) it.next();
            System.out.print(al.nome+", ");
        }
        System.out.print("\n");
        
        //Creamos unha segunda lista
        listaxe2.add(new Alumno("11111111A", "Sabela", "Terceiro", 21));
        listaxe2.add(new Alumno("22222222B", "Eduardo", "Terceiro", 22));
        
        //Engadimos listaxe2 a listaxe, os nodos de listaxe2 van ao final de listaxe
        listaxe.addAll(listaxe2);
        
        System.out.println("NOVA LISTAXE - Unión listas ao final");
        System.out.print("Alumnos matriculados: ");
        it = listaxe.iterator();
        
        for ( ; it.hasNext(); ){
            Alumno al = (Alumno) it.next();
            System.out.print(al.nome+", ");
        }
        System.out.print("\n");
        //Eliminamos todos os elementos de listaxe2
        listaxe2.clear();
        //Engadimos dous nodos a listaxe2
        listaxe2.add(new Alumno("33333333C", "Marcelo", "Primeiro", 19));
        listaxe2.add(new Alumno("44444444D", "Ana", "Primeiro", 18));
        //Engadimos o contido de listaxe2 en listaxe a partir da posición 1
        listaxe.addAll(1, listaxe2);
        System.out.println("NOVA LISTAXE - Unión listas desde posición");
        System.out.print("Alumnos matriculados: ");
        it = listaxe.iterator();
        for ( ; it.hasNext(); ){
            Alumno al = (Alumno) it.next();
            System.out.print(al.nome+", ");
        }
        System.out.print("\n");
        System.out.println("-----HASSET-----");
        
        boolean inserido;
        HashSet<String> conxunto = new HashSet<>(); //HashSet non ten en conta a orde de inserción.
        
        conxunto.add("Manuel");
        conxunto.add("Ana");
        conxunto.add("Diego");
        
        for(String valor: conxunto) {
            System.out.println(valor);
        }
        System.out.println("----------");
        inserido = conxunto.add("Manuel");//intenta inserirse un elemento co mesmo valor que un que xa está dentro do conxunto, 
//neste caso non dá erro pero devolve un false indicando que non se fixo ningunha modificación sobre o conxunto.
        if (!inserido) {
             System.out.println("Non se inseriu o nome.");
        }
        System.out.println("----------");
        System.out.println(conxunto);
        
        System.out.println("------------MAPS---------------");        
        Map<String, Double> salarios = new HashMap<>();
        
        salarios.put("12345678A",2000.57);
        salarios.put("12121212B", 1950.45);
        salarios.put("23232323C",1750.30);
        salarios.put("12334343D", 2012.90);
        System.out.println(salarios);
        
        System.out.println("------------MAPS otra pag---------------");
        
        HashMap<String, Integer> map = new HashMap<>(); 
 
         print(map); 
          map.put( "luis" , 10 ); 
          map.put( "pedro" , 30 ); 
          map.put( "alex" , 20 ); 
 
          System.out.println( "El tamaño del mapa es:  " 
                            + map.size()); 
 
         print(map); 
          if (map.containsKey( "luis" )) { 
              Integer a = map.get( "luis" ); 
              System.out.println( "valor de la clave de"+ " \"luis\" es:- "+ a); 
         } 
 
         map.clear(); 
         print(map); 
     } 
    public static void  print(Map<String, Integer> map) { 
          if (map.isEmpty()) { 
              System.out.println( "map is empty" ); 
         } 
 
          else { 
             System.out.println(map); 
         } 
      
     } 
        }
  