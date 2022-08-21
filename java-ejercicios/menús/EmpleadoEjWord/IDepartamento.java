/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpleadoEjWord;

/**
 *
 * @author alex
 */
public interface IDepartamento {
     public Empleado getEmpleados(int i);
     
     public void setEmpleados (Empleado Empleado1);
    
     public void recorrer();
}
