package Exercicio3;

public class Tecnico extends Operario {
    public Tecnico(String nome) {
        super.setNome(nome);
    }
    public Tecnico() {
    }
    @Override
    public String toString() {
        return(super.toString()+": Técnico");
    }
}
