package clases;

import java.time.LocalDate;

public class Socios {
    
    private String ID_Socio;
    private String Nombre;
    private String Apellidos;
    private String Profesión;
    private String Fecha_alta;
    private String nif_centros;

    public Socios() {
    }

    public Socios(String ID_Socio, String Nombre,String Apellidos, String Profesión, String Fecha_alta,  String nif_centros) {
        this.ID_Socio = ID_Socio;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Profesión = Profesión;
        this.Fecha_alta = Fecha_alta;
        this.nif_centros= nif_centros;
    }

    public String getID_Socio() {
        return ID_Socio;
    }

    public void setID_Socio(String ID_Socio) {
        this.ID_Socio = ID_Socio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getProfesión() {
        return Profesión;
    }

    public void setProfesión(String Profesión) {
        this.Profesión = Profesión;
    }

    public String getFecha_alta() {
        return Fecha_alta;
    }

    public void setFecha_alta(String Fecha_alta) {
        this.Fecha_alta = Fecha_alta;
    }

    public String getNif_centros() {
        return nif_centros;
    }

    public void setNif_centros(String nif_centros) {
        this.nif_centros = nif_centros;
    }

   
    
}

