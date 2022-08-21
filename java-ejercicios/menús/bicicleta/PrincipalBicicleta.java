package Pack_Bicicleta;
/**
 *
 * @author dawa51
 */
public class PrincipalBicicleta {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta();    
        miBicicleta.cambiarPinhon(1);
        miBicicleta.acelerar();
        miBicicleta.cambiarPlato(1);
        miBicicleta.frenar();
        Bicicleta tuBicicleta = new Bicicleta();    
        tuBicicleta.cambiarPinhon(1);
        tuBicicleta.acelerar();
        tuBicicleta.cambiarPlato(1);
        tuBicicleta.frenar();
        
        BicicletaMontana miBicicletaMontana = new BicicletaMontana(5, 2, 1, 2);
        miBicicletaMontana.acelerar();
        //miBicicletaMontana.acelerar2();
        System.out.println(miBicicletaMontana.getVelocidadActual());
        BicicletaTandem miBicicletaTandem = new BicicletaTandem(5, 2, 1, 2);
        miBicicletaTandem.acelerar();
        System.out.println(miBicicletaTandem.getVelocidadActual());
       
        
        
        
        
        
    }
}