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
public class BicicletaTandem extends Bicicleta{
    protected int numAsientos;
    
    public BicicletaTandem (int velocidad,int plato,int pinon){
        super(velocidad,plato,pinon);
    }
    public int getNumAsientos(){
        return numAsientos;
    }
    public void setNumAsientos(int numAsientos ){
         this.numAsientos=numAsientos;
    }
    @Override
    public void acelerar(){
        this.velocidadActual=this.velocidadActual*4;
    }
    
}
