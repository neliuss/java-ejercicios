
package cuentaDDR;


public class Cuenta {
    private String titular;
    private double cantidad;
    
    
    public Cuenta(String titu){
        this.titular=titu;
    }
    public Cuenta(String titu, double cantidad){
        this.titular=titu;
        this.cantidad=cantidad;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titu){
        this.titular=titu;
    }
    
    public double getcantidad(){
        return cantidad;
    }
    
    public void setcantidad(int cant){
        this.cantidad=cant;
    }
    
    @Override
    public String toString(){
        return "El titular es "+titular+" y su cantidad "+cantidad;
    }
    
    
    public void ingresar (double cantidad){
        if (cantidad>0){
             this.cantidad=this.cantidad+cantidad;
        }
    }
    
    public void retirar (double cant){
        cantidad=cantidad-cant;
        if (cantidad<0){
            cantidad=0;
        }
    }
}
