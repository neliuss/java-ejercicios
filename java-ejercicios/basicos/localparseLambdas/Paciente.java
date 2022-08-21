package localparseLambdas;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paciente extends Persona{
    
    private String num_historial;

    public Paciente(String dni, String nombrecompleto, String direccion, String NInss, LocalDate fechaNacimiento,String num_historial) {
        super(dni, nombrecompleto, direccion, NInss, fechaNacimiento);
        this.num_historial = num_historial;
    }

    public String getNum_historial() {
        return num_historial;
    }

    public void setNum_historial(String num_historial) {
        this.num_historial = num_historial;
    }

    @Override
    public String toString() {
        return "Paciente{" +super.toString()+ "num_historial=" + num_historial + '}';
    }
   
    public static boolean comprobar_inss(String inss)  //comprueba si tiene 14 digitos con formato 2/8/2
    {
        if (inss.length()!=14) return false;
        else
        {
       Pattern p = Pattern.compile("[0-9]{2}/[0-9]{8}/[0-9]{2}");

        Matcher m = p.matcher(inss);
            return m.matches();
        }    
     
    }
    @Override
    public Period devolver_edad(){
        
        LocalDate finLocalDate = LocalDate.now();  
        Period periodo=Period.between(getFechaNacimiento(),finLocalDate);
        
    return periodo;
    }
   
}
