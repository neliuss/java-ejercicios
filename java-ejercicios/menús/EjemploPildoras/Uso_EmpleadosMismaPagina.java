package EjemploPildoras;
import java.util.*;

public class Uso_EmpleadosMismaPagina {


    public static void main(String[] args) {
   /*   Empleado empleado1=new Empleado("Paco Pil", 86000, 1990, 12, 17);
        Empleado empleado2=new Empleado("Ana López", 222000, 1980, 8, 17);
        Empleado empleado3=new Empleado("María", 105800, 2002, 03, 15);
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Nombre :"+empleado1.dameNombre()+"Sueldo "+empleado1.dameSueldo()+"Fecha de alta: "+empleado1.dameFechaContrato());
        System.out.println("Nombre :"+empleado2.dameNombre()+"Sueldo "+empleado2.dameSueldo()+"Fecha de alta: "+empleado2.dameFechaContrato());
        System.out.println("Nombre :"+empleado3.dameNombre()+"Sueldo "+empleado3.dameSueldo()+"Fecha de alta: "+empleado3.dameFechaContrato());
       */
        //Se puede optimizar con arrays:
        Empleado[] misEmpleados=new Empleado[3];
        misEmpleados[0]=new Empleado("Paco Pil", 86000, 1990, 12, 17);
        misEmpleados[1]=new Empleado("Ana López", 222000, 1980, 8, 17);
        misEmpleados[2]=new Empleado("María", 105800, 2002, 03, 15);
        misEmpleados[2]=new Empleado("Antonio Fernández");// para comprobar sobrecarga constructores
        //q suba el sueldo a los 3, un 5%
//        for (int i=0;i<3;i++){
//            misEmpleados[i].subeSueldo(5);
//        }
        //sustituimos el anterior for, por uno mejorado(foreach):
        for (Empleado e: misEmpleados){
            e.subeSueldo(5);
        }
        
        //ahora que nos imprima 
//        for (int i=0;i<3;i++){
//            System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo()+"Fecha de alta"+misEmpleados[i].dameFechaContrato());
//    }
        //el segundo for mejorado:
        for (Empleado e: misEmpleados){
           System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+e.dameSueldo()+"Fecha de alta"+e.dameFechaContrato()); 
        }
    }   
}

class  Empleado{
    public Empleado (String nom, double sue, int agno, int mes, int dia){
        
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);//mes-1 por q enero=0
        altaContrato=calendario.getTime();
        }
    //sobrecarga constructores, 
    //para crear todos igual, y poner sólo el nombre
    public Empleado (String nom){
        this(nom,30000,2000,01,01);//OJO SIN PUNTO
        }
    
    public String dameNombre(){//getter
            return nombre;
    }
    public double dameSueldo(){//getter
        return sueldo;
    }
    public Date dameFechaContrato(){//getter
        return altaContrato;
    }
    public  void subeSueldo(double porcentaje){
        double aumento =sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
       private String nombre;
       private double sueldo;
       private Date altaContrato;
    }
