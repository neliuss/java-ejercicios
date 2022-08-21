
package tiendaRegalos;


public class Artigo {
     
     private int referencia;
     private String nome;
     private float prezo;
     private Persoa art;
     
     public Artigo(){

    }
     public Artigo(int referencia, String nome, float prezo, Persoa art){
        this.referencia=referencia;
        this.nome=nome;
        this.prezo=prezo;
        this.art=art;
    }

    @Override
    public String toString() {
        return "Datos de interese: {" + "referencia=" + referencia + ", nome=" + nome + ", prezo=" + prezo + art + '}';
    }

    
     
    
     
}
