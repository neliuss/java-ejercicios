package Pack_Telefono;
/**
 *
 * @author dawa51
 */
public class Telefono {
    private long numMovil;
    private double costLlam;
    private double costMin; 
    private double costMB;
    private double saldoMovil;

    public long getNumMovil(){
        return numMovil;
    }
    public void setNumMovil(long numMovil){
        this.numMovil=numMovil;
    }
    public double getCostLlam(){
        return costLlam;
    }
    public void setCostLlam (double costLlam){
        this.costLlam=costLlam;
    }
    public double getCostMin(){
        return costMin;
    }
    public void setCostMin(double costMin){
        this.costMin=costMin;
    }
    public double getCostMB (){
        return costMB;
    }
    public void setCostMB (double costMB){
        this.costMB=costMB;
    }
    public double getSaldoMovil (){
        return saldoMovil;
    }
    public void setSaldoMovil (double saldoMovil){
        this.saldoMovil=saldoMovil;
    }
    
    public void efectuarLlamada(int segundos) {
        saldoMovil-=((costMin*segundos)+costLlam);
    }    
    public void navegar(int MB) {
        saldoMovil-=((costMB*MB)+costLlam);
    }    
    public void recargar(int importe) {
        saldoMovil+=importe;
    }
    public double cSaldo() {
        return saldoMovil;
    }    
}