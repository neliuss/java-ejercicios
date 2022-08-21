package localparseLambdas;
import java.time.LocalDate;
import java.util.ArrayList;


public class Examen4 {

  
    public static void main(String[] args) {
        
        String dateString="1971-03-24"; 
   
        //creamos 3 pacientes
        
        Paciente persona=new Paciente("1","1","1","1",LocalDate.parse(dateString),"1H");
        System.out.println("años: "+persona.devolver_edad().getYears());//probamos el devolver_edad de persona
        
        Paciente persona2=new Paciente("2","2","2","2",LocalDate.parse("1980-02-02"),"2H");
        
        Paciente persona3=new Paciente("3","3","3","3",LocalDate.parse("1969-02-01"),"3H");
        
        //los añadimos a la lista de pacientes
        ArrayList<Paciente> pacientes1=new ArrayList(){{add(persona);add(persona2);add(persona3);}};
         ArrayList<Paciente> pacientes2=new ArrayList(){{add(persona);add(persona2);}};
        //creamos un médico
        Medico medico1=new Medico("5","5","5","5",LocalDate.parse("1969-02-23"),"C2");
        //le asignamos los pacientes
        medico1.setPacientes(pacientes1);
        System.out.println("años del paciente más joven: "+medico1.devolver_edad().getYears());
        //comprobación de la edad del más joven: devolver_edad de medico
        
        //creamos la lista de médicos
        //añadimos otro médico
        Medico medico2=new Medico("4","4","4","4",LocalDate.parse("1972-03-31"),"C1");
        //y sus pacientes el 2 y el 3
       medico2.setPacientes(pacientes2);
        
        ArrayList<Medico> mismedicos=new ArrayList(){{add(medico1);add(medico2);}};
        
      //  System.out.println(mismedicos); o con lambdas:
        mismedicos.forEach((s)->System.out.println(s)); 
        //ordenamos los médicos por número de colegiado 
        
        System.out.println("ahora ordenados por num de colegiado");
        mismedicos.sort((Medico a,Medico b)->a.getNum_colegiado().compareTo(b.getNum_colegiado()));
        mismedicos.forEach((s)->System.out.println(s)); 
        //y su lista de pacientes por nombre completo:esto en clase medico
        System.out.println("ahora los pacientes salen ordenados por nombre completo y no por edad");
        
        mismedicos.forEach((s)->s.ordenar_pacientes_por_nombre()); //o con un bucle for con size()o iterator
        mismedicos.forEach((s)->System.out.println(s)); 
        //ahora un buscar dentro de los pacientes de un médico un dnipacientey si está mostrar su numero de historial
        //recorremos todos los médicos...suponemos que los pacientes son distintos y que tenemos 
        //que recorrer toda la lista de los médicos para encontrar el historial del paciente
        //Suponemos el dni 3 que tiene el num_historial 3H
        for(int i=0;i<mismedicos.size();i++)
        {
            for(int j=0;j<mismedicos.get(i).pacientes.size();j++)
            if (mismedicos.get(i).pacientes.get(j).getDni().equals("3"))
                System.out.println(" se encontró al buscar:"+mismedicos.get(i).pacientes.get(j).getNum_historial());
            
        }
        System.out.println("ahora con lambdas:");
        mismedicos.forEach((m)->m.getPacientes().forEach((p)->{
                            if(p.getDni().equals("3"))
                                System.out.println(p.getNum_historial());}));
       
       System.out.println(Paciente.comprobar_inss("15/12"));
       System.out.println(Paciente.comprobar_inss("15/12345678/11"));
    }
    
}
