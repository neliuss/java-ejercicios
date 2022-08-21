/*
Crearase outra clase chamada Televisión, que herdará de Electrodoméstico e terá as seguintes características:
§ Os seus atributos son resolución (en pulgadas) e smartTV(booleano), ademais dos atributos herdados.
§ Por defecto, a resolución será de 20 pulgadas e o smartTV será false.	
§ Os construtores que se implementarán serán: 
– Construtor por	 defecto.
– Construtor co prezo e peso. O resto por defecto.
– Construtor coa resolución, smartTV e o	 resto de atributos herdados.
§ Os métodos a implementar son:	
– Método get de resolución e smartTV.	
– prezoFinal():se ten unha resolución maior de 40 pulgadas, incrementarase o prezo un 30% e se ten smartTV incorporado, aumentará 50€.	
 */
package gestionElectrodomestico;

   public class Television extends Electrodomestico {
    //atributos son resolución (en pulgadas) e smartTV(booleano), ademais dos atributos herdados.
    private final int RESOLDEFECTO= 20;
    private final boolean SMARTDEFECTO=false;
    
    private int resol;
    private boolean smart;
    
    //Constructor por defecto:
    public Television(){
        super();   
        this.resol=RESOLDEFECTO;
        this.smart=SMARTDEFECTO;
    }
    //Construtor co prezo e peso. O resto por defecto.
    public Television(double prezo,double peso){     
       super(prezo, peso);
       this.resol=RESOLDEFECTO;
       this.smart=SMARTDEFECTO;       
    }
    
    // Construtor coa resolución, smartTV e o resto de atributos herdados.
    public Television ( int resol, boolean smart) {
        super();
        this.resol=resol;
        this.smart=smart;
    }

    public int getResol() {
        return resol;
    }

    public boolean isSmart() {
        return smart;
    }
    
    
//prezoFinal():se ten unha resolución maior de 40 pulgadas, incrementarase o prezo un 30%
//e se ten smartTV incorporado, aumentará 50€.	
 

    @Override
    public double prezoFinal() {
        double plusResol=0;
        double plusSmart=0;
        super.prezoFinal();
        if (resol>40){
            plusResol=super.getPrezo()*0.3;
        } 
        if (smart==true){
            plusSmart=super.getPrezo()+50;
        }
        double plusTotal=plusResol+plusSmart;
        return plusTotal;
    }

    @Override
    public String toString() {
        return "Television: El precio es " +getPrezo()+". Color:"+getCor()+". Su consumo: "+getCons()+". Peso:"+getPeso()+ ", resol=" + resol + ", smart=" + smart ;
        //")+
    }
    
    
    
}
