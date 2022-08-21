
package varios;

import javax.swing.JOptionPane;


public class salida_datos {


    public static void main(String[] args) {
        String nombre_usuario=JOptionPane.showInputDialog("Introduce tunombre, por favor");//creas ventana con aceptar/cancelar, y almacena datos en nombre_usuario;
        String edad=JOptionPane.showInputDialog("Introduce la edad");
        System.out.println("Hola "+nombre_usuario+" ,tienes "+edad+" años");
        System.out.println("Hola "+nombre_usuario+" ,tienes "+edad+" años, y el año que viene tendrás "+(edad+1)+" años.");
        //al devolver un string, con la edad+1, deberemos pasarlo a entero, con la función parse
        int edad_usuario=Integer.parseInt(edad);
        System.out.println("Hola "+nombre_usuario+" ,tienes "+edad+" años, y el año que viene tendrás "+(edad_usuario+1)+" años.");
        //otra forma sería poner edad_usuario++; y no habría que sumarle el 1 a la concatenación
        
        
    }
    
}
