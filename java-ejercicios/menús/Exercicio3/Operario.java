package Exercicio3;

public class Operario extends Empregado {

    public Operario(String nome) {
        super.setNome(nome);    
    }

    public Operario() {
    }
    @Override
    public String toString() {
        return(super.toString()+": Operario");
    }
}
