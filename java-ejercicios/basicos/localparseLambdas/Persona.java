package localparseLambdas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
public abstract class Persona {
        //implements Comparable<Persona>{

	private String dni;
	private String nombrecompleto;
	private String direccion;
        private String NInss;
	private LocalDate fechaNacimiento;
	


    public Persona(String dni, String nombrecompleto, String direccion, String NInss, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombrecompleto = nombrecompleto;
        this.direccion = direccion;
        this.NInss = NInss;
        this.fechaNacimiento = fechaNacimiento;
    }

	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

        public String getNombrecompleto() {
            return nombrecompleto;
            }


        public String getDireccion() {
            return direccion;
        }

        public String getNInss() {
            return NInss;
        }

        public void setNombrecompleto(String nombrecompleto) {
            this.nombrecompleto = nombrecompleto;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public void setNInss(String NInss) {
            this.NInss = NInss;
        }


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.dni);
        hash = 67 * hash + Objects.hashCode(this.nombrecompleto);
        hash = 67 * hash + Objects.hashCode(this.direccion);
        hash = 67 * hash + Objects.hashCode(this.NInss);
        hash = 67 * hash + Objects.hashCode(this.fechaNacimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombrecompleto, other.nombrecompleto)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.NInss, other.NInss)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombrecompleto=" + nombrecompleto + ", direccion=" + direccion + ", NInss=" + NInss + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

	
	/*
	 * Nos permite comparar dos instancias de Persona
	 * Una persona ser� menor que otra cuando su fecha de nacimiento lo sea
	 * Aprovechamos el orden definido por LocalDate: otra opción para ordenar...sin lambdas
	 */
//	@Override
//	public int compareTo(Persona p) {
//		return fechaNacimiento.compareTo(p.getFechaNacimiento());
//	}
	
	
	public abstract Period devolver_edad();
	//la hacemos abstracta : implica también la clase
	
	
}
