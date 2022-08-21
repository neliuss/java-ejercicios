package Pack_Bicicleta;

/**
 *
 * @author dawa51
 */
public class BicicletaTandem extends Bicicleta {
    protected int numAsientos;
    //Segunda parte exercicio 5.
    
    public BicicletaTandem(int velocidadActual, int platoActual,
            int pinhonActual, int numAsientos){
        super(velocidadActual, platoActual, pinhonActual);
        this.numAsientos= numAsientos;
    }//Fin exercicio 5.
    @Override
    public void acelerar() {
        super.setVelocidadActual(super.getVelocidadActual()*4);
    }
    public void acelerar2() {
        super.setVelocidadActual(super.getVelocidadActual()*2);//Non se pode invocar un metodo dun padre!!!Creamos un novo.
    }//Fin Exercicio 6
}