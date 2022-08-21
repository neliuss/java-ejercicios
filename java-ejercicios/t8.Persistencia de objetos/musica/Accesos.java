package musica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Accesos {
    public static void seleccionar(Connection conexion,String mitabla)
    {
       try{
         
        String cadena="SELECT * FROM "+mitabla;
        Statement sentenza=conexion.createStatement();
        ResultSet rs=sentenza.executeQuery(cadena);
  
        while (rs.next())
        {
          String id = rs.getString("idmusico");
            String n = rs.getString("nombre");
            String a = rs.getString("apellidos");
            String d = rs.getString("direccion");
            System.out.println(id + "\t" + n +"\t" + a+ "\t" + d );   
            

            
        }
       }
    catch (SQLException e)
        {
            System.out.println("error al conectar a la tabla");
        }  
    }
    
    public static void borrarmusicos_con_parametros(Connection conexion,String clave)
    {
         try{
         
        PreparedStatement ps=conexion.prepareStatement("delete from musicos where idmusico=?"); 
        ps.setString(1,clave);
        if (ps.executeUpdate()!=0)
            System.out.println("musico borrado");
         }
    catch (SQLException e)
        {
            System.out.println("error al conectar a la tabla");
        } 
        
    }
}
