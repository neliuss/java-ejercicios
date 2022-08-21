/*
Crearase outra clase chamada Lavadora, que herdará de Electrodoméstico e terá as seguintes características: 
§ O seu atributo é carga, ademais dos atributos herdados.
§ Por defecto, a carga é de 5kg. Usar unha constante para elo.
§ Os construtores que se implementarán serán:
– Construtor por defecto.
– Construtor co prezo e peso. O	resto por defecto.	
– Construtor coa carga e o resto de atributos herdados.
§ Os métodos a implementar son:	
– Método get de	 carga.	
– prezoFinal():	se ten unha carga maior de 30kg, aumentar o  prezo 50€,	se non é así non se incrementará o prezo.	
 */
package gestionElectrodomestico;


public class Lavadora extends Electrodomestico {
    private final double CARGADEFECTO= 5;
    
    private double carga;
    
    //Constructor por defecto:
    public Lavadora(){
        this.carga=CARGADEFECTO;
    }
    //Construtor co prezo e peso. O resto por defecto.
    public Lavadora(double prezo,double peso){     
         super(prezo, peso);
//       this.prezo=prezo;
//       this.peso = peso;
//       this.cor = corDefecto;
//       this.cons=consDefecto;
       this.carga=CARGADEFECTO; 
    }

   //Construtor coa carga e o resto de atributos herdados.
    public Lavadora( double carga) {
        super();
        this.carga=carga;
    }
    
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora: Su precio es "+getPrezo()+". Color:"+getCor()+". Su certificado energético: "+getCons()+". Peso: "+getPeso()+ " kg. Carga: " + carga +" kg."+ '}';
    }
    
//prezoFinal():se ten unha carga maior de 30kg, aumentar o  prezo 50€,	se non é así non se incrementará o prezo.

    @Override
    public double prezoFinal() {
        double prezoFinal=super.getPrezo();
        super.prezoFinal();
        if (carga >30) {
          prezoFinal=prezoFinal+50;
        } 
        return prezoFinal;
    }
   
}
