
package ejemplo;

public class Ej {
//PARA LA MODULARIZACIÓN, CREAR CADA CLASE EN UN FICHERO DIFERENTE,

    public static void main(String[] args) {
        
        EjClase trabajador1=new EjClase("Paco");
        EjClase trabajador2=new EjClase("Ana");
        EjClase trabajador3=new EjClase("Arale");
        EjClase trabajador4=new EjClase("Alex");
        
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        
        System.out.println("cambio de departamento/sección:");
        trabajador1.cambiaSeccion("RRHH");
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        
//        System.out.println("cambio de nombre:");
//        trabajador1.cambiaNombre("Raúl");
//        System.out.println(trabajador1.devuelveDatos());
//        System.out.println(trabajador2.devuelveDatos());
        //con final ya no funciona lo anterior.
        
         System.out.println("prueba con static Id:");
     /*   System.out.println(trabajador1.devuelveDatos());
        EjClase.Id++; //con private wn Id, no funcionaría
        System.out.println(trabajador2.devuelveDatos());
        EjClase.Id++;   */
        //para no poner el incremento cada vez, lo optimizamos
        
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
        System.out.println(trabajador4.devuelveDatos());
        
        System.out.println("Optimizando el código anterior:");
        System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()+"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());
        
        System.out.println(EjClase.dameIdSiguiente());
        
        System.out.println("***********A PARTIR DE AQUÍ, HERENCIA************");
        EjClase trabajador8=new EjClase("MANOLO");
        Herencia miherencia1=new Herencia(2,1);
        miherencia1.dimeDatos();
        System.out.println(miherencia1.dimeDatos());
        
        
        
        
    }
    
}


