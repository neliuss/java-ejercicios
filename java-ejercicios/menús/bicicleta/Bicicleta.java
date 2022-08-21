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
public class Bicicleta {
    protected int velocidadActual;
    protected int platoActual; 
    protected int pinonActual;
    
    public Bicicleta (int velocidad,int plato,int pinon){
        this.velocidadActual=velocidad;
        this.platoActual=plato;
        this.pinonActual=pinon;
    }
    public Bicicleta (){
        this.velocidadActual=0;
        this.platoActual=1;
        this.pinonActual=1;
    }
    public int getVelocidad(){
        return velocidadActual;
    }
    public void setVelocidad(int velocidad ){
         this.velocidadActual=velocidad;
    }
    public int getPlato(){
        return platoActual;
    }
    public void setPlato (int plato){
        this.platoActual=plato;
    }
    public int getPinon(){
        return pinonActual;
    }
    public void setPinon (int pinon){
        this.pinonActual=pinon;
    }
    
    public void acelerar(){
        this.velocidadActual=this.velocidadActual*2;
    }
    public void frenar(){
        this.velocidadActual=this.velocidadActual/2;
    } 
    public void cambiarPlato(int cambioPlato){
        this.platoActual=cambioPlato;
    }
    public void cambiarPinon(int cambioPinon){
        this.pinonActual=cambioPinon;
    }
    public void cambiarPlato(){
        this.platoActual=1;
    }
    public void cambiarPinon(){
        this.pinonActual=1;
    }
}
