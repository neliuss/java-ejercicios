
package tiendaRegalos;


public class DVD extends Artigo {
    private float duracion;
    private String produtor;
    
    
    public DVD (){
        
    }

    public DVD(float duracion, String produtor, int referencia, String nome, float prezo, Persoa art) {
        super(referencia, nome, prezo, art);
        this.duracion = duracion;
        this.produtor = produtor;
    }
    

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    @Override
    public String toString() {
        return "DVD: {" + "duracion=" + duracion + ", produtor=" + produtor + '}'+super.toString();
    }
    
    
}
