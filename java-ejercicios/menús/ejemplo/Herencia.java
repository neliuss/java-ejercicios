
package ejemplo;

public class Herencia extends Ej { //al abuelo, nos saltamos a ejClase
   private int extra;
   private int extra_herencia;
   
   public Herencia(int extra, int extra_herencia) {
       super();    //llama al constructor de la clase padre, se le pueden meter métodos dentro
       this.extra=extra;
       this.extra_herencia=extra_herencia;
   }
    
   public String dimeDatos(){
    return "La nueva herencia:"+extra+"y la segunda:"+extra_herencia;
}
}
