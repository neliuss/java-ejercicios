/*Nuestro sistema requiere que una determinada clase sólo pueda ser instanciada una vez. 
Esto es útil cuando varios clientes desean utilizar una funcionalidad que es proporcionada por un único objeto. 
Nuestro objetivo será garantizar que la clase en cuestión no pueda generar más de una instancia y proporcionar un punto de acceso fijo a la misma.

Patrones de Diseño (VI): Patrones de Creación - Singleton
Patrón Singleton, que trata de resolver la problemática que plantea el hecho de que un objeto sea único. 
Es la única clase que participa en este patrón (a parte de las clases cliente que la utilicen). Está compuesta de:
-instance: atributo que representa la instancia única de la clase.
-Singleton(): constructor privado de la clase.
-getInstance(): método público que crea (en caso de no existir) o devuelve una instancia a la propia clase.

Tenemos una empresa de fabricación de refrescos distribuida en varias sedes. Una sede central es la que se encarga de gestionar la distribución, 
por lo que debe llevar un control del stock de las demás sedes.La sede central será representada mediante un Singleton al que podrán acceder las demás para actualizar su stock. 

 */
package singleton;

public class main_singleton {

    public static void main(String[] args) {
//        
//        SedePrincipal sedeprinc = SedePrincipal.getInstance();
//        
//        int num_botellas_producidas = 55;
//        sedeprinc.addLimonada(num_botellas_producidas);
//        
//        System.out.println(sedeprinc.getNumLimonada());
//        // Imprimirá 55
//
//        System.out.println(sedeprinc.getNumCola());
//        // Imprimirá 0
//        


// Fabrica de cola 1
//public static void main(String[] args) {
        SedePrincipal sedeprinc = SedePrincipal.getInstance();
        
        int num_botellas_producidas = 208;
        sedeprinc.addCola(num_botellas_producidas);
        
        System.out.println(sedeprinc.getNumLimonada());
        // Imprimirá 55

        System.out.println(sedeprinc.getNumCola());
      //   Imprimirá 208
        


// Fabrica de limonada 2
//public static void main(String[] args) {
 //       SedePrincipal sedeprinc = SedePrincipal.getInstance();
        
//        int num_botellas_producidas = 800;
//        sedeprinc.addLimonada(num_botellas_producidas);
//        
//        System.out.println(sedeprinc.getNumLimonada());
//        // Imprimirá 855
//
//        System.out.println(sedeprinc.getNumCola());
        // Imprimirá 208
        


// Fabrica de cola 2
//public static void main(String[] args) {
//        SedePrincipal sedeprinc = SedePrincipal.getInstance();
        
//        int num_botellas_producidas = 400;
//        sedeprinc.addCola(num_botellas_producidas);
//        
//        System.out.println(sedeprinc.getNumLimonada());
//        // Imprimirá 855
//
//        System.out.println(sedeprinc.getNumCola());
        // Imprimirá 608
        
        
    }
 
}
