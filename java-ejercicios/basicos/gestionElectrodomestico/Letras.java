
package gestionElectrodomestico;

/**
 *
 * @author alex
 */
public enum Letras {
    A (100),
    B (80),
    C (60),
    D (50),
    E (30),
    F (10);
    protected final double extra;
    Letras(double extra){
        this.extra=extra;
    }
    double extra(){
        return extra;
    }
}
