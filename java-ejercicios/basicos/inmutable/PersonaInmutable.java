package inmutable;



public final class PersonaInmutable {
	
	final private String nombre;
	final private String apellidos;
	
	
	
	public PersonaInmutable(final String nombre, final String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	
	
	
	

}
