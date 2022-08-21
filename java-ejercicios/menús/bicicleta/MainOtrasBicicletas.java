/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

public class MainOtrasBicicletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BicicletaMontana montBicicleta= new BicicletaMontana(25,1,4);
        BicicletaTandem tandBicicleta= new BicicletaTandem(20,2,3);
        
        montBicicleta.acelerar(); //triplico la velocidad de la bici
        
        tandBicicleta.acelerar();   //cuatriplico la velocidad de la bici

        
        System.out.println("Bicicleta Montaña: Velocidad");
        System.out.println(montBicicleta.getVelocidad());

        
        System.out.println("Bicicleta tándem: Velocidad");
        System.out.println(tandBicicleta.getVelocidad());

    }
    
}
