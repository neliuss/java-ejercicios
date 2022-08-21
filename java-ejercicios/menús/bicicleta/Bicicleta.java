package Pack_Bicicleta;
/**Ejercicio 1
Implementa la clase Bicicleta, que tiene tres atributos:
* velocidadActual, * platoActual y pinhonActual, de tipo entero
* y cuatro métodos:
* acelerar(), frenar(), cambiarPlato(int plato), y cambiarPiñon(int piñon),
* donde el primero dobla la velocidad actual,
* el segundo reduce a la mitad la velocidad actual,
* y el tercero y cuarto ajustan el plato y el piñón actual respectivamente
* según los parámetros recibidos.
* La clase debe tener además un constructor que inicialice todos los atributos.   
 • Crea dos objetos de la clase bicicleta: miBicicleta y tuBicicleta  
Ejercicio 2
Sobre la clase Bicicleta, implementa los método sobrecargados cambiarPlato(),
* y cambiarPiñon(), que no reciben argumentos y que cambian el plato actual
* y el piñón actual a un valor por defecto, en concreto, 1.
Ejercicio 3
Sobre la clase Bicicleta, implementa un constructor adicional que no recibe parámetros y que inicializa la velocidad actual a 0, y el plato actual y el piñón actual a 1.
Ejercicio 4
Sobre la clase Bicicleta, implementa los métodos get() y set()necesarios para poder acceder y modificar todos los atributos.

/**
 *
 * @author dawa51
 */
public class Bicicleta {
    private int velocidadActual;
    private int platoActual;
    private int pinhonActual;        

    public void acelerar() {
        velocidadActual=velocidadActual*2;
    }
    public void frenar(){
        velocidadActual=velocidadActual/2;
    }
    public void cambiarPlato(int plato){
        platoActual=plato;
    }
    public void cambiarPinhon(int pinhon){
        pinhonActual=pinhon;
    }
    public Bicicleta(int velocidadActual, int platoActual, int pinhonActual){
        this.velocidadActual=velocidadActual;
        this.platoActual=platoActual;
        this.pinhonActual=pinhonActual;
    }
    //Ata aqui o exercicio 1 e co Principal.java.
    public void cambiarPlato(){
        platoActual=1;
    }
    public void cambiarPinhon(){
        pinhonActual=1;
    }
//Ata aqui o exercico 2.
    public Bicicleta(){
        this.velocidadActual=0;
        this.pinhonActual=1;
        this.platoActual=1;
    }
    //Ata aqui o exercicio 3.
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }          
    public int getPlatoActual() {
        return platoActual;
    }
    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }
    public int getPinhonActual() {
        return pinhonActual;
    }
    public void setPinhonActual(int pinhonActual) {
        this.pinhonActual = pinhonActual;
    }
    //Ata aqui o exercicio 4.
}