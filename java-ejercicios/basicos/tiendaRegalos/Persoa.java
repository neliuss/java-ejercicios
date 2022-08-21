//Tanto o autor como o produtor, son persoas das que se almacena o seu apelido, 
//o seu nome e a súa data de nacemento.
package tiendaRegalos;

public class Persoa {
    
    private String nome; //da igual repetir nombres(tenemos otro en artigo).
    private String apel;
    private String data;
    
    
    public Persoa(){
        
    }
    
    public Persoa(String nome, String apel, String data){
        this.nome=nome;
        this.apel=apel;
        this.data=data;
    }

    @Override
    public String toString() {
        return ". Datos do autor/produtor{" + "nome=" + nome + ", apelido=" + apel + ", data de nacemento=" + data + '}';
    }
    
    
    
}
