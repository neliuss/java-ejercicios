package ej2Extends;

public class InsCuerda {

    private String nombre;

    private int cuerdas;

    public InsCuerda(String nombre, int cuerdas) {
        this.nombre=nombre;
        this.cuerdas=cuerdas;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        this.nombre=nombre;
        return nombre;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public int setCuerdas(int cuerdas) {
        this.cuerdas=cuerdas;
        return cuerdas;
    }

    @Override
    public String toString() {
        return "Instrumento: "+nombre+", dispone de "+cuerdas+" cuerdas,";
    }
}
