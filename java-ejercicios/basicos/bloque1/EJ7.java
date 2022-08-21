
package bloque1;
import java.util.Scanner;

public class EJ7 {

    public static void main(String[] args) {
      
        float rad, alt;
        double pi, a;
        //int a, b;
       // double cuadrado, h;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el radio del cilindro ");
        rad = teclado.nextInt();
        
        System.out.println("Introduce la altura del cilindro");
        alt = teclado.nextInt();

        System.out.println("El radio es:\n " + rad + "\n y la altura \n" + alt);

        a = 2 * Math.PI * rad * alt;
         System.out.println("El área es: " + a );
    }
}
