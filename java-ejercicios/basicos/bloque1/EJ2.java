
package bloque1;
import java.util.Scanner;

/**
 *
 * @author dawa48
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2;
        int menu;
       // int suma=0, resta=0, producto=0;     
        //variables no recogidas por teclado, hay q inicializarlas, la ponemos en 0
      //  float division=0; 
        float resul=0;
      
      
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número (diferente de 0)");
        num2 = teclado.nextInt();
        
            while (num2 == 0){
                System.out.println("Introduce el segundo número (diferente de 0)");
                num2 = teclado.nextInt();  
            }
              
                
        
        System.out.println("Tu primer número es el " +num1+ ", y tu segundo número es el " +num2);

        System.out.println("Elige una operación. 1:Suma    2:Resta     3:Producto  4:División");
        menu = teclado.nextInt();
        
        switch (menu)   {
            case 1 : resul = num1 + num2; break;     //suma = num1 + num2; break;
            case 2 : resul = num1 - num2; break;    //resta = num1 - num2; break; 
            case 3 : resul = num1 * num2; break; //producto = num1 * num2; break;
            case 4 : resul = num1 / num2; break; //division = num1 / num2; break;
        }
        
       //tb podríamos llamar suma=num1+num2; resta=... System.out.println("El resultado de tu operación es:\n  "  +suma+ " " + resta ....);
        System.out.println("El resultado de tu operación es:\n  "  +resul);
    }
    
}
