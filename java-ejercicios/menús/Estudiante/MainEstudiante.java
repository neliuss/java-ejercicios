
package Estudiante;


public class MainEstudiante {

    public static void main(String[] args) {
        Estudiante estNum1= new Estudiante();
        
        estNum1.setNombre("Javier");
        estNum1.setApellido("Pedreira");
        estNum1.setCorreo("javi@correo.es");
        
        System.out.println("El nombre del estudiante número 1 es: " + estNum1.getNombre());
        System.out.println("El apellido del estudiante número 1 es: " + estNum1.getApellidos());
        System.out.println("El mail del estudiante número 1 es: " + estNum1.getCorreo());
    }
    
}
