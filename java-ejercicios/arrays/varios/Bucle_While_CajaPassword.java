
package varios;
import javax.swing.*;

public class Bucle_While_CajaPassword {


    public static void main(String[] args) {
        String clave="Alex";
        String pass="";
        while (clave.equals(pass)==false){  //
            pass=JOptionPane.showInputDialog("Introduce la contraseña:");
            if (clave.equals(pass)){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña incorrecta");
           
    }
    
}
