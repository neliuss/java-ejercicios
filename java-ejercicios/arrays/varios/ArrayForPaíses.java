
package varios;
import javax.swing.*;

public class ArrayForPaíses {


    public static void main(String[] args) {

        //String []paises={"España", "Colombia","Perú", "Uruguay"};
        /*
        for(int i=0;i<paises.length;i++){
            System.out.println("País "+(i+1)+" : "+paises[i]);
        }
        */
        //Otra forma:
        
        String [] paises=new String[4];
        for (int i=0;i<4;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce el país: "+(i+1));
        }
        
        
        for (String i:paises){  //variable de mismo tipo q la matriz, string
            System.out.println("País: "+i);
    }
    }
    
}
