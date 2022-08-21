package Alumnos;

import java.io.Serializable;

public class Alumno implements Serializable{
    String nombre;
    String dni;
    int edad;
    String curso;
    float nota;
    boolean repite;
    
    Alumno(String n, String d, int i, String c, float cal, boolean r) {
        nombre = n;
        dni = d;
        edad = i;
        curso = c;
        nota = cal;
        repite = r;
    }
    
    @Override
    public String toString() {
       return nombre+"\t"+dni+"\t"+edad+"\t"+curso+"\t"+nota+"\t"+repite;
    } 
}
