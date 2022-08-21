package biblioteca;

import java.util.ArrayList;

public class Libro {
    private String signatura;
    private String titulo;
    private String editorial;
    private ArrayList <String> autores; 
    private int isbn;
    private int numPax;

    public Libro() {
        this.autores = new ArrayList <>();
    }

    public Libro( String titulo, String editorial, ArrayList<String> autores, int isbn, int numPax) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.autores = autores;
        this.isbn = isbn;
        this.numPax = numPax;
        setAutoSignatura();
    }

    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
        this.signatura = signatura;
    }

    public void setAutoSignatura() {
        this.signatura = this.titulo.substring(0, 3)+this.editorial.substring(0, 3)+this.isbn;
        System.out.println("Signatura creado/moficado automáticamente!!!");
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores.add(autores);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumPax() {
        return numPax;
    }

    public void setNumPax(int numPax) {
        this.numPax = numPax;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "signatura=" + signatura + ", titulo=" + titulo + ", editorial=" + editorial + ", autores=" + autores + ", isbn=" + isbn + ", numPax=" + numPax + '}';
    }

}