
package clases;

public class Centros {
    
    private String nif;
    private String dirección;
    private String país;
    private String id_proyecto;
    
    public Centros() {
    }

    public Centros(String nif, String dirección, String país, String id_proyecto) {
        this.nif = nif;
        this.dirección = dirección;
        this.país = país;
        this.id_proyecto = id_proyecto;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

   
    
}


