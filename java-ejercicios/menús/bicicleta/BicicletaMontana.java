/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author dawa19
 */
public class BicicletaMontana extends Bicicleta {
    protected int suspension;
    
    public BicicletaMontana (int velocidad,int plato,int pinon){
        super(velocidad,plato,pinon);
    }

    public int getSuspension(){
        return suspension;
    }
    public void setSuspension(int suspension ){
         this.suspension=suspension;
    }
    
    public void cambiarSuspension(int suspension){
        this.suspension=suspension;
    }
    @Override
    public void acelerar(){
        this.velocidadActual=this.velocidadActual*3;
    }
}
