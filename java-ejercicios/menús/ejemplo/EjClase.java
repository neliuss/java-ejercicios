
package ejemplo;


public class EjClase { //en vez de empleados en el ej
    private final String nombre; //el final es pa que no se modifique, lo conviertes en constante
    private String seccion;
    private  int Id;  //con static, comparten la misma variable, no tienen la copia propia Id. 
    private static int IdSiguiente=1;//en vez de saltarnos la encapsulación, y poner public y static, la anterior Id, creamos uno nuevo, y lo inicializamos en 1
    //Cada objeto tiene su propia copia de nombre, de seccion , de Id, pero sólo la clase tiene una copia de IdSiguiente
    
    public EjClase(String nom){ //constructor
        nombre=nom;
        seccion="Administración";  //todos los empleados, deben empezar en administración
   //     this.Id=Id;       //con static ya no hace falta, y se la quitamos al constructor tb
        Id=IdSiguiente; //Le damos estado inicial
        IdSiguiente++;
    }
    
    public void cambiaSeccion(String seccion){
        this.seccion=seccion; //para diferenciar el campo de clase, de lo que es un argumento, como aquí.
    }
    public String devuelveDatos(){
        return "El nombre es: "+nombre+" y la sección es "+seccion+ " y el ID, es "+Id;
    }
    
//    public void cambiaNombre(String nombre){
//        this.nombre=nombre;     //fallo por convertir con final, la variable nombre.
//    }
   
    public static String dameIdSiguiente(){
        return "El Id siguiente es: "+IdSiguiente;
    }
    
}
