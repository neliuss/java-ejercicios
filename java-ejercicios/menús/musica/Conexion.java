package musica;

import java.sql.*;

public class Conexion {
      Connection conexion=null;
      public Conexion()
      {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion =DriverManager.getConnection("jdbc:mysql://localhost/banda","nuevo", "nuevo");
         System.out.println("bien la conexion");
        }
             catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println("error al conectar a la base de datos ");
        }
      }
  

}
