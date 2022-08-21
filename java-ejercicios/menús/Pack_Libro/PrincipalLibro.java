package Pack_Libro;
import java.util.Scanner;
/**
 *
 * @author dawa51
 */
public class PrincipalLibro {
    /**Con este exemplo quero explicar os pasos para entender o exercicio,
     * non busquedes 3 pes o gato, fago un menu para que se vexa paso a paso o
     * que fai, os exercicios non levan menus, e para que vexades como é.
     * Si entro na opción 1 varias veces, non crea varios libros,
     * copia por enriba do anterior. A opción un e para ver o uso dos setters e
     * getters. 
     * Unha vez creado, podese entrar varias veces nos opcións 2 e 3.
     * Opción 4 sae do programa, si se volve a executar, machaca o anterior.
     */
     public static void main(String[] args) {
        Scanner miteclado = new Scanner (System.in);
        int op;//(*)
        Libro miLibro;/** Aqui creo o obxecto "Mi Libro"
         * Si nos fixamos como definimos op(*); estamos decindo op tipo integer,
         * pois aqui definimos miLibro como una class Libro, definido anteriormente
         * no java.class Libro.java*/
        
        miLibro=new Libro();/**Aqui inicializo miLibro co constructor Libro().
         * O constructor Libro(), tamén esta difinido en Libro.java, é un 
         * constructor por defecto, por non ter parámetros, crea un obxecto miLibro,
         * sen valores nos seus atributos. Xa se explicará máis adiante os
         * constructores con parámetros...
         * O normal para crear un obxecto e facelo nun paso: Libro miLibro = new Libro().
         */
        do {
            System.out.println("**************************");
            System.out.println("1 Alta Libro:");
            System.out.println("2 Prestar:");
            System.out.println("3 Devolver");
            System.out.println("4 Saír");
            op=miteclado.nextInt();
            switch (op){
                case 1: alta_Libro(miLibro); System.out.println(miLibro.toString()); break;
                                            //System.out.println(miLibro.toString()) pode obviar .toString()...
                case 2: prest_Libro(miLibro);  System.out.println(miLibro); break;
                case 3: ; devolv_Libro(miLibro); System.out.println(miLibro); break;
                case 4: System.out.println("Ata logo Mari Carmen."); break;       
                default: System.out.println("Opción non válida:"); break; 
                }
            }
        while (op!=4);
    }
    public static void alta_Libro(Libro unLibro) {
        /**Neste método, que NON ten nada que ver cos métodos definidos no
         * Libro.java OLLO, vedes no menu, no opción case 1: alta_Libro(miLibro);
         * o método vai actuar sobre miLibro, na hora de crear o método:
         * public static void alta_Libro(Libro unLibro), teño que definir o tipo
         * argumento vou traballar, como sempre..., neste caso cun class Libro, e 
         * utilizo unLibro, así un pouco indifinido, para que nos demos conta que
         * utilizamos o libro indifinido para traballar dentro do método,
         * recordando que HAI QUE PROCURAR QUE NOS METODOS LEVAR UN NOME DISTINTO
         * DO VARIABLE OU OBXECTO, neste caso.
         * Esto CHOCA co que vemos no class, constructor e a súa puta madre que
         * utiliza o mesmo nome para DEFINIR O OBXECTO. Non é doado, xa sei.
         * 
         * Con alta_Libro vemos o uso dos setters e getters.
         * Get significa coller, con get collemos o valor do atributo que
         * ten o obxecto, neste caso miLibro. Pero antes, con Set, introducimos
         * o valor do atributo. Quedámonos con que Get significa COLLER e set
         * meter, introducir... Get coller vale...
         * Recordando que os setters e os getters estan difinidos no Libro.java.
         * por iso, si esta todo ben definido, ou poñer unLibro. debería mostrar
         * os métodos que se poden usar incluidos os nosos...
         */
        Scanner miteclado = new Scanner (System.in);
        System.out.println("Introducimos os datos do libro:");
        System.out.println("Título do libro:");
        unLibro.setTituloLibro(miteclado.nextLine());
        //co unLibro.set... introducimos por teclado o que sexa.
        System.out.println("O título do libro é: "+unLibro.getTituloLibro()+".");
        // Aqui vemos que mostra o System.out.println unLibro.get... COLLE o valor...
        System.out.println("Autor do libro:");
        unLibro.setAutorLibro(miteclado.nextLine());
        System.out.println("O autor/a do libro é: "+unLibro.getAutorLibro()+".");
        System.out.println("Nº de exemplares:");
        unLibro.setNum_ejemLibro(miteclado.nextInt());
        System.out.println("Nº de exemplares son: "+unLibro.getNum_ejemLibro()+".");
        unLibro.setNum_presLibro(0);//Aqui, neste set... metemoslle o valor 0 directamente!!!
    }
    public static void prest_Libro(Libro unLibro) {
        if (unLibro.prestamo()) System.out.println("Foi prestado correctamente");
        else System.out.println("Todos os libro prestados!!!");
    }
    public static void devolv_Libro(Libro unLibro) {
        if (unLibro.devolucion()) System.out.println("Foi devolto correctamente");
        else System.out.println("Incongruencia no stock!!!");
    }
}