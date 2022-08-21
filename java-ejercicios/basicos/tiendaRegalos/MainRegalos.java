/*Exercicio 1: 
Crear unha clase que represente a un artigo dunha tenda de venta de regalos. 
Un artigo caracterízase pola súa referencia, o seu nome e prezo.
Agregar dúas clases máis que representen a libros e DVD que a súa vez son artigos da tenda, coas seguintes características:
– Libros: posúen un número ISBN, un certo número de páxinas e un autor.
– DVDs: teñen unha duración e un produtor.
Tanto o autor como o produtor, son persoas das que se almacena o seu apelido, 
o seu nome e a súa data de nacemento.
*/
package tiendaRegalos;


public class MainRegalos {


    public static void main(String[] args) {
       
        Persoa pers=new Persoa("Ken", "Follet", "5-Junio-1949");
        Persoa pers2=new Persoa("Ridley", "Scott", "30-Noviembre-1937");
    
        Libros libr1=new Libros(567657,56, "Ken Follet", 4, "Los pilares de la tierra", 50,pers);
        DVD dvd1=new DVD(3.5f, "Ridley Scott", 15,"Blade Runner", 12.5f,pers2);
        
        
        System.out.println(libr1.toString());
        System.out.println(dvd1.toString());
    }
    
}
