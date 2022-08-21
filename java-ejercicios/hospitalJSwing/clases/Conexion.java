/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Conexion {
    private static Connection conexion;
    private static final String MIC="jdbc:mysql://localhost/hospital?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static Connection getConexion(){
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
      // conexion =DriverManager.getConnection("jdbc:mysql://localhost/hospital","nuevo", "nuevo");
       //conexion normal la anterior, si no queremos tener problemas con la time_zone:
        conexion =DriverManager.getConnection(MIC,"nuevo", "nuevo");
       //System.out.println("bien la conexion"); por si nos falla al principio
        }
        catch (ClassNotFoundException | SQLException e) 
        {
         //   System.out.println("error al conectar a la base de datos "); por si nos falla al ppio
        }     
          
          return conexion; 
      }
    public static void cerrar_conexion(){
            try{
                conexion.close();
                }
            catch(SQLException e){
            }      
    }
      
      
}
