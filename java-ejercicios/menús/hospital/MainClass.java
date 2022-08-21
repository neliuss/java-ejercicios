package hospital;

/**
 *
 * @author dawa14
 */
public class MainClass {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Luis Pérez Rey","12345678A",1400);
        Enfermero enfermero1 = new Enfermero("Juan Pérez Hernández","66778823",1200);
        Enfermero enfermero2 = new Enfermero("María Fernández Vázquez","33224455B",1100);
        Medico medico1 = new Medico("Luis Hernández Rodríguez","11554477C",2000,"cirujano");
        Hospital hosp1 = new Hospital("Hospital 1","Dirección 1");
        Hospital hosp2 = new Hospital("Hospital 2","Dirección 2");
        
        System.out.println(empleado1);
        System.out.println(enfermero1);
        System.out.println(enfermero2);
        System.out.println(medico1);
        System.out.print("\n");
        hosp1.anadirEmpleado(empleado1);
        hosp1.anadirEmpleado(enfermero2);
        hosp2.anadirEmpleado(enfermero1);
        hosp2.anadirEmpleado(medico1);
        hosp1.mostrarEmpleado();
        hosp2.mostrarEmpleado();
    }
}
