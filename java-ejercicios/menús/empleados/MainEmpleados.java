
package empleados;


public class MainEmpleados {


    public static void main(String[] args) {
        
        Empleado emple=new Empleado();
        Operario opera=new Operario("Luis");
//        Tecnico tecni= new Tecnico();
        Directivo direc=new Directivo("Juan");
        Oficial ofic=new Oficial("María");
           
        emple.setNombre(" Pepe");
        System.out.println(emple); 
        direc.setNombre(" Juan");
        System.out.println(direc);
        opera.setNombre(" Luis");
        System.out.println(opera);
        ofic.setNombre(" María");
        System.out.println(ofic);
        
        //OTRA FORMA
        Empleado empleadito = new Empleado();
        Operario operarito = new Operario();
        Directivo directivito = new Directivo();
        Oficial oficialito = new Oficial();
        Tecnico tecniquito = new Tecnico();
        
        empleadito.setNombre("Pepe");
        operarito.setNombre("Luis");
        directivito.setNombre("Juan");
        oficialito.setNombre("María");
        tecniquito.setNombre("Otro");
          
        
        System.out.println(empleadito);
        System.out.println(operarito);
        System.out.println(directivito);
        System.out.println(oficialito);
        System.out.println(tecniquito);
        
    }
    
}
