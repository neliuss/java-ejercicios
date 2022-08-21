
package varios;
import javax.swing.JOptionPane;

public class Bucle_boolean_comprobarMail {


    public static void main(String[] args) {
        
//      boolean arroba=false;  //así si tiene más de una arroba, tb validaría, cambiamos ésto y arroba true
       int arroba=0;//esto es añadido
       boolean punto=false;//en la tercera revisión le metemos el punto, más comprobaciones
       
       String mail=JOptionPane.showInputDialog("Introduce tu mail:");
        for (int i=0; i<mail.length(); i++){
            if (mail.charAt(i)=='@'){   //ojo a las comillas, datos char en comillas simples
//              arroba=true;//ésto tb se cambia a arroba++ por la validación de las arrobas
                arroba++;//ésto es añadido
            }
            if (mail.charAt(i)=='.'){
                punto=true;
            }
        }
//      if(arroba==true){//ésto tb se cambia
        if(arroba==1 && punto==true){
            System.out.println("Correcto");
        }
        else{
          System.out.println("Incorrecto");  
        }
    }
    
}
