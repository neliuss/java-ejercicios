package alumnosGUI;

import java.io.Serializable;

public class Alumno implements Serializable{
    String nome;
    String dni;
    int idade;
    String curso;
    float nota;
    boolean repite;
    
    Alumno(String n, String d, int i, String c, float cal, boolean r) {
        nome = n;
        dni = d;
        idade = i;
        curso = c;
        nota = cal;
        repite = r;
    }
    
    @Override
    public String toString() {
       return nome+"\t"+dni+"\t"+idade+"\t"+curso+"\t"+nota+"\t"+repite;
    } 
}
