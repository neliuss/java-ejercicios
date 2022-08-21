package gestionEmpleadosInterfaz;


public class MainGestionPlantilla {

    public static void main(String[] args) {
        
        
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");
        Departamento Dep1=new Departamento("Departamento 1");
        Departamento Dep2=new Departamento("Departamento 2");
    
    System.out.println(E1);
    System.out.println(D1);
    System.out.println(OP1);
    System.out.println(OF1);
    System.out.println(T1);
    
    Dep1.setEmpleados(E1);
    Dep1.setEmpleados(D1);
    Dep2.setEmpleados(OP1);
    Dep1.Recorrer();
    Dep2.Recorrer();
   
    
    
    
    
    
    
    }
    
}
