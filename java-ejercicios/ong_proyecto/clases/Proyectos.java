package clases;

public class Proyectos {
    
    private String ID_Proyecto;
    private String Finalizado;
    private String Título;
    private String Fecha_entrega;
    private String Descripción;
    

    public Proyectos() {
    }

    public Proyectos(String ID_Proyecto, String Finalizado, String Título, String Fecha_entrega, String Descripción) {

        this.ID_Proyecto = ID_Proyecto;
        this.Finalizado = Finalizado;
        this.Título = Título;
        this.Fecha_entrega = Fecha_entrega;
        this.Descripción = Descripción;
        
    }

    public String getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(String ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(String Finalizado) {
        this.Finalizado = Finalizado;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(String Fecha_entrega) {
        this.Fecha_entrega = Fecha_entrega;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }


    
    

    
}