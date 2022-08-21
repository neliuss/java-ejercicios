
package varios;

import java.util.*;//carga todas las funciones
import javax.swing.*;

public class condicional_figuras_matemat {


    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige una opción: \n 1:Cuadrado. \n 2:Rectángulo. \n 3:Triángulo. \n 4:Círculo");
        int figura=entrada.nextInt();
        switch (figura){
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));//método show inputDialog es método estático, no se necesita crear un método, 
                //no así en entrada, que construimos un objeto de la clase scanner, ya que scanner no es estático
                System.out.println("El área del cuadrado es "+Math.pow(lado, 2));
                break;
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Dime la base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Dime la altura"));
                System.out.println("El área del rectángulo es "+base*altura);
                break;
            case 3:
                int base1=Integer.parseInt(JOptionPane.showInputDialog("Dime la base"));
                int altura1=Integer.parseInt(JOptionPane.showInputDialog("Dime la altura"));
                System.out.println("El área del triángulo es "+(base1*altura1)/2);
                break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Dime el radio"));
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                break;
            default:
                System.out.println("La opción no es correcta");
        }
        
        
    }
    
}
