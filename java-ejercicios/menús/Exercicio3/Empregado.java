package Exercicio3;

public class Empregado {
    private String nome;

    public Empregado(String nome) {
        this.nome=nome;
    }
    public Empregado() {
    }
    public void setNome(String nome) {
        this.nome=nome;
    }
    public String getNome() {
        return this.nome;
    }
    @Override
    public String toString() {
        return "Empregado "+getNome();
    }
}
