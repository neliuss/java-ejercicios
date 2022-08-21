package gestionPlantilla;


public class Maquinistas extends Plantilla {
    private int num_maq;
    private int cant_anos_maq;

    public Maquinistas(){
        
    }

    public Maquinistas(String nome, float sal_base, int edad, int num_maq, int cant_anos_maq){
        super(nome, sal_base,edad);
        this.cant_anos_maq=cant_anos_maq;
    }
    
    public String VisualizarTodosDatos(){
        return super.toString()+". Datos de los maquinistas: Número de máquina: "+num_maq+". Cantidad de años de la máquina: "+cant_anos_maq;
    }

    public int getNum_maq() {
        return num_maq;
    }

    public void setNum_maq(int num_maq) {
        this.num_maq = num_maq;
    }

    public int getCant_anos_maq() {
        return cant_anos_maq;
    }

    public void setCant_anos_maq(int cant_anos_maq) {
        this.cant_anos_maq = cant_anos_maq;
    }

    @Override
    public String toString() {
        return super.toString()+". Datos de los maquinistas: Número de máquina: "+num_maq+". Cantidad de años de la máquina: "+cant_anos_maq;
    }

    
}
