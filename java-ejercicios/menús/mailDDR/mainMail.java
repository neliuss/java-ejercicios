package mailDDR;
import javax.swing.JOptionPane;

public class mainMail {
    
    public static void main(String[] args) {
        //Introducimos el tamaño del array y la longitud del password
        String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Introduce la longitud del password");
        int longitud=Integer.parseInt(texto);
  
        //Creamos los arrays
        Mail listaPassword[]=new Mail[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
  
        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Mail(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
    }
    
}
}
