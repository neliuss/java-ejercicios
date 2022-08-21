package clases;


public class Quirofano {
    
    private String cod_quirofano;
    private String descripcion;
    private String planta;

    public Quirofano() {
    }

    public Quirofano(String cod_quirofano, String descripcion, String planta) {
        this.cod_quirofano = cod_quirofano;
        this.descripcion = descripcion;
        this.planta = planta;
    }

    public String getCod_quirofano() {
        return cod_quirofano;
    }

    public void setCod_quirofano(String cod_quirofano) {
        this.cod_quirofano = cod_quirofano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }
    
    
}
