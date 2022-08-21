package libro;
/**Crear una clase llamada Libro que contenga la información de cada uno de los libros de
una biblioteca. La clase debe guardar los siguientes atributos: el título del libro, autor,
número de ejemplares del libro y número de ejemplares prestados.
La clase contendrá los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Un método llamado préstamo que incremente el atributo número de
ejemplares prestados cada vez que se realice un préstamo del libro. No se
podrán prestar libros de los que no queden ejemplares disponibles para prestar.
Devuelve true si se ha podido realizar la operación y false en caso contrario.
• Otro método llamado devolución que decremente el atributo número de
ejemplares prestados cuando se produzca la devolución de un libro. Devuelve
true si se ha podido realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros. Este método se heredada
de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
Escribe un programa para probar el funcionamiento de la clase Libro, de forma que
permita crear un par de libros, prestarlos y devolverlos. 
 *
 * @author dawa51
 */
public class Libro {
    private String tituloLibro;
    private String autorLibro;
    private int num_ejemLibro; 
    private int num_presLibro; 
//• Constructor por defecto.
    public Libro(){ 
    }
//• Constructor con parámetros.
    public Libro(String tituloLibro, String autorLibro, int num_ejemLibro, int num_presLibro) { 
    }
//• Métodos Setters/Getters   
    /**Con isto collen ou introducen os valores os atributos,
     * con get, "COLLER" "RECOLLER" utilizamos return.
     * con set, poñemos this. que referencia o class onde esta difinido, neste
     * caso Libro. 
     */
    public String getTituloLibro() {
        return tituloLibro;
    }
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }          
    public String getAutorLibro() {
        return autorLibro;
    }
    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }
    public int getNum_ejemLibro() {
        return num_ejemLibro;
    }
    public void setNum_ejemLibro(int num_ejemLibro) {
        this.num_ejemLibro = num_ejemLibro;
    }
    public int getNum_presLibro() {
        return num_presLibro;
    }
    public void setNum_presLibro(int num_presLibro) {
        this.num_presLibro = num_presLibro;
    }
//• Un método llamado préstamo.    
    public boolean prestamo(){/** AQUI ENTRAMOS EN PROGRAMACIÓN!!!
     * Con este método devolve verdade si ten exemplares para prestar,
     * o sexa, nº de libros prestados menor que nº de exemplares, ademais
     * sumalle outro libro prestado. No caso contrario, devolve falso, ou sexa
     * nº de libros prestados igual a nº de exemplares...
     */
        if (num_presLibro<num_ejemLibro){
            num_presLibro+=1;
            return true;
        }
        else return false;
    }
//• Otro método llamado devolución.
    public boolean devolucion(){/** PROGRAMACIÓN!!!
     * Con este método, restalle outro libro prestado ó atributo, sempre que
     * non teñemos un error no stock... 
     */
        if (num_presLibro>0){
            num_presLibro-=-1;
            return true;
        }
        else return false;
    }
//• Método toString para mostrar los datos de los libros.    
    /**COMO COÑO EXPLICO ISTO!!! Imos intentalo...
     * Cando definimos un obxecto, imos ver que tamén se pode crear suboxectos
     * de esta, chamados fillas que a súa vez tamen pode ter fillas que heredan
     * atributos dos seus pais, avos, etc... NON ME METO MÁIS POR AGORA...
     * Pero todo obxecto ten o pai dos pais, tipo Julio Iglesias... e ten uns
     * metodos que valen para o seus fillos...
     * Co @Override imos ver como o método toString, que é un metodo que ten o 
     * Julio Iglesias dos obxectos, podemos modificalos para que devolva a cadena
     * cos valores dos atributos do obxecto que creamos.
     */
    @Override
    public String toString(){
      return "Titulo do libro: "+tituloLibro+", autor do libro: "+autorLibro+","
            + " número de exemplares: "+num_ejemLibro+", número prestados: "+num_presLibro+".";
    }/**
     * Os invito que probeis que devolve o metodo toString() sen o Override
     */
}