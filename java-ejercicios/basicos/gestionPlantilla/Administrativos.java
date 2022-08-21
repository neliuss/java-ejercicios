
package gestionPlantilla;

public class Administrativos extends Plantilla {
    private Plantilla plan;
    private String estudios_acad;
    private int num_pc;

 
    
    public Administrativos(String nome, float sal_base, int edad, String estudios_acad, int num_pc){
        super(nome, sal_base, edad);
        this.estudios_acad=estudios_acad;
        this.num_pc=num_pc;
    }
    
    public Administrativos(){
        
    }
    
    public String VisualizarTodosDatos(){
        return super.toString()+"Datos de los administrativos: Estudios académicos: "+estudios_acad+". Número del pc asignado: "+num_pc;
    }

    public Plantilla getPlan() {
        return plan;
    }

    public void setPlan(Plantilla plan) {
        this.plan = plan;
    }

    public String getEstudios_acad() {
        return estudios_acad;
    }

    public void setEstudios_acad(String estudios_acad) {
        this.estudios_acad = estudios_acad;
    }

    public int getNum_pc() {
        return num_pc;
    }

    public void setNum_pc(int num_pc) {
        this.num_pc = num_pc;
    }

    @Override
    public String toString() {
        return super.toString()+"Administrativos: estudios_académicos: "+estudios_acad+". Número de pc=" + num_pc;
    }
    

    
    
}
