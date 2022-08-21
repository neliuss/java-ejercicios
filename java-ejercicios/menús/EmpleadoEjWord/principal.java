
package EmpleadoEjWord;


public class principal {

    public static void main(String[] args) {
        Empleado emple=new Empleado("Antonio");
        Oficial ofi=new Oficial("Pepe");
        Tecnico tecni=new Tecnico("Mercedes");
        Directivo dire=new Directivo("Jose");
        Operario ope=new Operario ("Luis");
        Departamento dep1=new Departamento("Administración");
        Departamento dep2=new Departamento("Ventas");
        
//        System.out.println(emple.toString());
//        System.out.println(ope.toString());
        
        
        System.out.println(emple);
        System.out.println(ofi);
        System.out.println(tecni);
        System.out.println(dire);
        System.out.println(ope);
        
        dep1.setEmpleados(emple);
        dep1.setEmpleados(dire);
        dep2.setEmpleados(ope);
        dep1.recorrer();
        dep2.recorrer();
        
    }
    
}
