
package tiendaRegalos;

public class Libros extends Artigo {
    private int isbn;
    private int pax;
    private String autor;
    
    
    public Libros(){
        
    }

    public Libros(int isbn, int pax, String autor, int referencia, String nome, float prezo, Persoa art) {
        super(referencia, nome, prezo, art);
        this.isbn = isbn;
        this.pax = pax;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  "Libro: {" + "isbn=" + isbn + ", pax=" + pax + ", autor=" + autor + '}' +super.toString();
    }

 
    
    
    
    
}
