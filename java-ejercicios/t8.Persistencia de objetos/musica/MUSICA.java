package musica;

import java.sql.Connection;

public class MUSICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        Conexion c=new Conexion();
        Connection miconexion=c.conexion;
                
        Accesos.seleccionar(miconexion, "musicos");
        Accesos.borrarmusicos_con_parametros(miconexion, "1");
    }
    
}
