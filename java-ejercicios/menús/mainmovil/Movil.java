package mainmovil;
import java.util.Scanner;

public class Movil {
    
    private String numero;
    private double coste_llam=0.017;
    private double coste_min=0.034;
    private double coste_mb=0.008;
    private float saldo;
    
    
    public Movil () { 
}
    public Movil(String numero, double coste_llam, double coste_min, double coste_mb, float saldo){  
         this.numero=numero;
         this.coste_llam=coste_llam;
         this.coste_min=coste_min;
         this.coste_mb=coste_mb;
         this.saldo=saldo;
}
     
     public String getNumero(){   //si fuera sólo una cifra, sería int.   SIEMPRE return
       return "El número del móvil, es " +numero;
      }
     public void setNumero(String numero){
      this.numero=numero;
      }
  
      public double getCosteLlam(){
          return this.coste_llam;
      }

      public void setCosteLlam(double coste_llam){
          this.coste_llam=coste_llam;
      }

      public double getCostemin(){
          return this.coste_min;
      }

      public void setCostemin(double coste_min){
          this.coste_min=coste_min;
      }

      public double getCostemb(){
          return this.coste_mb;
      }

      public void setCostemb(double coste_mb){
          this.coste_mb=coste_mb;
      }
      
      public double getSaldo(){
          return this.saldo;
      }

      public void setSaldo(float saldo){
          this.saldo=saldo;
      }
      
      
    @Override
      public String toString (){
          return "El número es: "+numero+". Su saldo es: "+saldo;
      }
      
      
      public void efectuarLlamada(int segundos){
          if (saldo>0){
             double saldo_final= saldo - (segundos*coste_llam);
             this.saldo=(float) saldo_final;
             System.out.println("Su saldo tras la llamada, es de: "+saldo);
          }else {
              System.out.println("Recargue para efectuar llamadas.");
          } 
      }
    
       public void navegar(int MB){
          if (saldo>0){
             double saldo_final= saldo - (MB*coste_mb);
             this.saldo=(float) saldo_final;
             System.out.println("Su saldo tras la llamada, es de: "+saldo);
          }else {
              System.out.println("Recargue para poder navergar.");
          } 
      }
       
       public boolean recargar(int importe){
           if (importe % 5==0){
               double saldoF=this.saldo+importe;
                this.saldo=(float) saldoF;
               System.out.println("Su saldo tras la llamada, es de: "+this.saldo);  
               return true;
           }else{
               return false;
           }
       }
       
       public float consultarSaldo(){
           return saldo;
       }
    
}
