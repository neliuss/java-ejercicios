package Exercicio3;

public class Directivo extends Empregado {
    public Directivo(String nome) {
        super.setNome(nome);
    }
    public Directivo() {
    }
    @Override
    public String toString() {
        return super.toString()+": Directivo";
        
    }
}
