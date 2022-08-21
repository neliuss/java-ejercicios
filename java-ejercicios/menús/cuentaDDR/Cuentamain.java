
package cuentaDDR;


public class Cuentamain {


    public static void main(String[] args) {
        Cuenta cuen1=new Cuenta("pepe",2000);
        Cuenta cuen2=new Cuenta("Antonio");
        
        
        System.out.println(cuen1.toString());
        System.out.println(cuen2.toString());
        
        cuen1.ingresar(100);
        System.out.println(cuen1.getcantidad());
        cuen1.ingresar(-100);
        System.out.println(cuen1.getcantidad());
        cuen1.retirar(1000);
        System.out.println(cuen1.getcantidad());
        
        cuen2.retirar(1000);
        System.out.println(cuen2.getcantidad());
    }
    
}
