package ej2Extends;

public class InsPercusion extends InsCuerda {

    private boolean teclado;

    public InsPercusion(String nombre, int cuerdas, boolean teclado) {
        super(nombre, cuerdas);
        this.teclado=teclado;
    }

    public boolean getTeclado() {
        return teclado;
    }

    public boolean setTeclado(boolean teclado) {
        this.teclado=teclado;
        return teclado;
    }


    @Override
    public String toString() {
        return super.toString()+" Teclado :"+teclado +", ";
    }
}
