
package ej2Extends;  

public class MainEj2 {

    public static void main(String[] args) {
        
        InsCuerda cuer=new InsCuerda("Guitarra1",6);
        InsPercusion percu=new InsPercusion ("Salterio1",90,false);
        Piano pian=new Piano ("Piano1",230,true, "Yamaha");
        
        System.out.println(cuer.toString());
        System.out.println(percu.toString());
        System.out.println(pian.toString());
        
        System.out.println("******Comprobando métodos*******");
        //cambiamos nombre de cuer por mandolina y 4 cuerdas
        System.out.println(cuer.setNombre("Mandolina"));
        System.out.println(cuer.getNombre());
        System.out.println(cuer.setCuerdas(4));
        System.out.println(cuer.getCuerdas());
        System.out.println(cuer.toString());
        //comprobamos métodos de Instrumentos de percusión:
        percu.setNombre("Batería");
        percu.setTeclado(true);
        System.out.println(percu.toString());
        //Piano: queremos pianola, y de marca musicon
        pian.setNombre("Pianola");
        pian.setTeclado(false);
        pian.setMarca("Musicón");
        System.out.println(pian.toString());
        
        
    }
    
}
