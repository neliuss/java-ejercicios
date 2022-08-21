package Pack_Bicicleta;
/**
 *
 * @author dawa51
 */
public class BicicletaMontana extends Bicicleta{
    protected int suspension;
    
    public void cambiarSuspension(int susp){
        suspension=susp;
    }
    //Primeira parte exercicio 5.
    public BicicletaMontana(int velocidadActual, int platoActual,
            int pinhonActual, int suspension){
        super(velocidadActual, platoActual, pinhonActual);
        this.suspension=suspension;
    }//Fin exercicio 5.
    @Override
    public void acelerar() {
        super.setVelocidadActual(super.getVelocidadActual()*3);
    }
    public void acelerar2() {
        super.setVelocidadActual(super.getVelocidadActual()*2);//Non se pode invocar un metodo dun padre!!!Creamos un novo.
    }//Fin Exercicio 6
}