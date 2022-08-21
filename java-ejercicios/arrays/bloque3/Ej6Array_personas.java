
package bloque3;
import javax.swing.JOptionPane;

public class Ej6Array_personas {

    public static void main(String[] args) {
        
        String [] personas=new String[4];
        for (int i=0;i<4;i++){
            personas[i]=JOptionPane.showInputDialog("Introduce el nombre de la persona: "+(i+1));
        }
        
        
        for (String i:personas){  //variable de mismo tipo q la matriz, string
            System.out.println("País: "+i);
    }
    }
    
}
