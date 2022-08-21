
package gestionPlantilla;

import java.util.ArrayList;


public class Plantilla {
    private String nome;
    private float sal_base;
    private int edad;  

    @Override
    public String toString() {
        return "Plantilla:" + "nombre:" + nome + ", sal_base=" + sal_base + ", edad=" + edad + '}';
    }

    public Plantilla(String nome, float sal_base, int edad){
        this.nome=nome;
        this.sal_base=sal_base;
        this.edad=edad;
    }

    public Plantilla(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSal_base() {
        return sal_base;
    }

    public void setSal_base(float sal_base) {
        this.sal_base = sal_base;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  
}
