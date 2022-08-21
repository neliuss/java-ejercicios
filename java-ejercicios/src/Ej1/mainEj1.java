
package Ej1;

public class mainEj1 {

    public static void main(String[] args) {
        
        Paciente pac1=new Paciente("María", "Fernández",99999999);
        Paciente pac2=new Paciente("Ana", "Ordóñez");
        
        System.out.println(pac1.toString());
        pac1.setNumAfil(123456);
        pac1.setNombreApel("Arale", "Guerra");
        System.out.println(pac1.toString());
        pac2.setNumAfil(78910);
        System.out.println(pac2.toString());
        
        System.out.println("*********Ej2*********");
        Medico med1=new Medico("Luis","20290");
        Medico med2=new Medico("Genaro","6984");
        
        System.out.println(med2.toString());
        System.out.println(med1.toString());
        
        System.out.println("Comprobando métodos");
        med1.setNombre("Mari Carmen");
        System.out.println(med1.getNombre());
        med1.setColegiado("111111");
         System.out.println(med1.getColegiado());
        System.out.println(med1.toString());
        
        
        
    }
    
}
