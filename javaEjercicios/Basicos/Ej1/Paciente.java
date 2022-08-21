package Ej1;

public class Paciente {

    private String nombre;

    private String apellidos;

    private int numAfil;

    public Paciente(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Paciente(String nombre, String apellidos, int numAfil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numAfil = numAfil;
    }

    public String setNombreApel(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        return nombre+apellidos;
    }

    public String getNombreApel() {
        return "El nombre y los apellidos son " + nombre + apellidos;
    }

    public int setNumAfil(int numAfil) {
        this.numAfil = numAfil;
        return numAfil;
    }

    public String getNumAfil() {
        return "El número de afiliación es " + numAfil;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " " + apellidos + ". Número de afiliación: 15/" + numAfil;
    }
}
