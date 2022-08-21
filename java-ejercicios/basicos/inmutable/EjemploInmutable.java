package inmutable;


public class EjemploInmutable {

	
	public static void main(String[] args) {
		
		PersonaInmutable yo = new PersonaInmutable("Maria", "Fernández López");
		
		//No tenemos forma de modificar las propiedades
		//Solo de acceder a ellas en modo lectura
		System.out.printf("%s %s ", yo.getNombre(), yo.getApellidos());

	}

}
