package ej2Extends;

public class Piano extends InsPercusion {

    private String marca;

    public Piano(String nombre, int cuerdas, boolean teclado, String marca) {
        super(nombre, cuerdas, teclado);
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }

    @Override
    public String toString() {
        return super.toString()+" Marca :"+marca;
    }
}
