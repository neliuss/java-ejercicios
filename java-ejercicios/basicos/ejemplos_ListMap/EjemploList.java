package ejemplos_ListMap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploList {

	
	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		
		listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
		listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
		listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
		
		//Acceso posicional (3 posicion)
		Persona p = listaPersonas.get(2);
		System.out.println(p);
		System.out.println("\n\n");
		
		//Recorrer la lista completa
		for(Persona per : listaPersonas)
			System.out.println(per);
		
		
		//Añadir un nuevo elemento al final de la lista
		listaPersonas.add(new Persona("56789012E", "Julio", "Azcorate", LocalDate.of(1994, 5, 6)));
		
		//Añadir/modificar un elemento en medio de la lista
		listaPersonas.set(2, new Persona("67890123F", "Alfonso", "García", LocalDate.of(1995, 6, 7)));
		
		//Recorrer la lista completa
		System.out.println("\n\n\n");
		for(Persona per : listaPersonas)
			System.out.println(per);
		
		//Para ordenar, tenemos que aportar un orden
		//Será por fecha de nacimiento, a la inversa
		listaPersonas.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona p1, Persona p2) {
				return -p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
			}
			
		});
		
		//Recorremos la lista completa, ya ordenada
		System.out.println("\n\n\n");
		for(Persona per : listaPersonas)
			System.out.println(per);
		
		
		
		
	}
        
        
        
        

}
