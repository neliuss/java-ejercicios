/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

public class MainBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta miBicicleta= new Bicicleta(25,1,4);
        Bicicleta tuBicicleta= new Bicicleta(20,2,3);
        
        miBicicleta.acelerar(); //duplico la velocidad de mi bici
        miBicicleta.cambiarPinon(-1); //bajo un piñon a mi bici
        
        tuBicicleta.frenar();   //freno a la mitad la velocidad de tu bici
        tuBicicleta.cambiarPlato(2);  //subo 2 platos a tu bici
        
        System.out.println("MiBicicleta: Velocidad y Piñon");
        System.out.println(miBicicleta.getVelocidad());
        System.out.println(miBicicleta.getPinon());
        
         System.out.println("TuBicicleta: Velocidad y Plato");
        System.out.println(tuBicicleta.getVelocidad());
        System.out.println(tuBicicleta.getPlato());
    }
    
}
