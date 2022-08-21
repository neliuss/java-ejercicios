package Exercicio3;

public class Oficial extends Operario {

    public Oficial(String nome) {
        //super.setNome(nome);
        this.setNome(nome);
    }

    public Oficial() {
    }
    @Override
    public String toString() {
        return super.toString()+": Oficial";
    }
}
