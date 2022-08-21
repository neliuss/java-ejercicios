
package bloque1;
import java.util.Scanner;

public class EJ12 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num, contpos=0, contneg=0, contcero=0;
     
        char respuesta;

        do{
            System.out.println("Introduce el número: ");
       
            num = teclado.nextInt();
            teclado.nextLine();//para quitar el enter
             if (num>0) {
           contpos++;// contpos = contpos + 1 ;
        }
        if (num==0) {
            contcero++;
        }
        if (num<0) {
            contneg ++;
        }
       
         System.out.println("Quiere introducir otro número?(s/CualquierTecla)");
         respuesta = teclado.next().charAt(0);//cojo la primera de la cadna
          
       }while (respuesta == 's') ;
      
        System.out.println("Has escrito cero  " + contcero + " veces");
        System.out.println( "Has escrito números positivos  " + contpos + " veces");
        System.out.println ("Has escrito números negativos  " + contneg + " veces");
  }
      
    }
    




