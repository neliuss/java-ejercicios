/*Os seus atributos son: prezo base, cor, consumo enerxético (letras entre A e F) e peso. Estes atributos poderanse herdar.
– Por defecto, a cor será branca, o consumo enerxético será F, o peso de 5 kg. Usar constantes para elo.
– As cores dispoñibles con: branco, negro, vermello, azul e gris. Non importa se o nome está en maiúsculas ou en minúsculas.
– Os construtores que se implementarán serán:
• Construtor por defecto.
• Construtor co prezo e peso. O resto por defecto.
• Construtor con todos os atributos.
– Os métodos a implementar son:
Métodos accesores de todos os atributos.
• comprobarConsumoEnerxetico(char letra): comproba que a letra é correcta, se non é correcta usará a letra por defecto. Invocarase ao crear o obxecto e non será visible.
• comprobarCor(String cor): comproba que a cor é correcta, se non o é usa a cor por defecto. Invocarase ao crear o obxecto e non será visible.
• prezoFinal(): segundo o consumo enerxético, aumentará o seu prezo, e segundo o seu tamaño, tamén. A lista de prezos é a seguinte:
LETRA   PREZO       TAMAÑO                  PREZO
A        100€       Entre 0 e 19 kg         10€ 
B        80€        Entre 20 e 49 kg        50€ 
C        60€        Entre 50 e 79 kg        80€ 
D        50€        Maior que 80 kg         100€ 
E        30€    
F        10€ 

*/
package gestionElectrodomestico;
import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomestico {
    //CONSTANTES:
    final static double PESODEFECTO=5;   //pq static??, para utilizar static,  no necesitas instanciar un objeto
    final static String CORDEFECTO="Branco";
   // final static char CONSDEFECTO='F';
    
    protected final static Letras CONSDEFECTO=Letras.F;

    //ATRIBUTOS:
    private  double prezo;
    private String cor;
 //   private char cons;
    private double peso;
    
    //última modif:eliminamos cons y CONSDEFECTO arriba
    protected Letras cons;
//    private ArrayList <String> consumo=new ArrayList <String>();//  "A","B","C","D","E","F" para string. //comilla ' para char. 
//    private ArrayList <String> cores=new ArrayList <String>();// "branco", "negro", "vermello", "azul" e "gris".

    
    //Constructor por defecto:
    public Electrodomestico(){
       // this("",corDefecto, consDefecto, pesoDefecto);  PQ NO ME FUNCIONA ASÍ??¿¿?¿?¿?

       this.prezo=prezo;
       this.cor=CORDEFECTO;
       this.cons=CONSDEFECTO;
       this.peso=PESODEFECTO;
    }
    //Constructor con prezo e peso
    public Electrodomestico(double prezo,double peso){     //ArrayList consumo, ArrayList cores) {
       this.prezo=prezo;
       this.cor = CORDEFECTO;
       this.cons=CONSDEFECTO;
       this.peso = peso;
  //      this(prezo, corDefecto, consDefecto, peso);

    }
    //Constructor con todos los atributos
    public Electrodomestico(float prezo,String cor, char cons, double peso) {
        this.prezo = prezo;
        comprobarCor(cor);
        comprobarConsumoEnerxetico(cons);
        this.peso = peso;
    }
    //MÉTODOS:
//    public void comprobarConsumoEnerxetico(char letra) {
//         
//        boolean consumo=false;
//        String consumoarray[]={"A","B","C","D","E","F"};    //comilla ' para char. NO ""
//        for (int i=0; i<consumoarray.length; i++){
//            String letra2=String.valueOf(letra);
//            if ((consumoarray[i]).equalsIgnoreCase(letra2)){
//                  this.cons=letra;
//                  consumo=true;
//            }
//        }
//        if (consumo==false){
//            this.cons=CONSDEFECTO;
//        }
//    }
    
    public void comprobarConsumoEnerxetico(char letra) {
         
        boolean consumo=false;
        String consumoarray[]={"A","B","C","D","E","F"};    //comilla ' para char. NO ""
        for (int i=0; i<consumoarray.length; i++){
            String letra2=String.valueOf(letra);
            if ((consumoarray[i]).equalsIgnoreCase(letra2)){
                  
                  switch(consumoarray[i]){
                    case "A":
                        this.cons=Letras.A;
                        consumo=true;
                        break;
                    case "B":
                        this.cons=Letras.B;
                        consumo=true;
                        break;
                    case "C":
                        this.cons=Letras.C;
                        consumo=true;
                        break;
                    case "D":
                        this.cons=Letras.D;
                        consumo=true;
                        break;
                    case "E":
                        this.cons=Letras.E;
                        consumo=true;
                        break;
                    case "F":
                        this.cons=Letras.F;
                        consumo=true;
                }           
            }
        }
        if (consumo==false){
            this.cons=CONSDEFECTO;
        }
    }
                    
     
  public void comprobarCor(String cor){
       String cores[]={"branco", "negro", "vermello", "Azul", "gris"};
        boolean esta=false;
       for (int i=0; i<cores.length; i++){
          if (cor.equalsIgnoreCase(cores[i])){
              this.cor=cores[i];
              esta=true;
          }
       }    //cerramos el if pq no sigue la comparación.
          if (esta==false){
      this.cor=CORDEFECTO;
        } 
    }

//      public double prezoFinal(){
//        double suma=0;
//        switch (cons){
//            case 'A':
//                suma=100;
//                this.prezo=prezo+suma;
//                break;
//            case 'B':
//                suma=80;
//                this.prezo=prezo+suma;
//                break;
//            case 'C':
//                suma=60;
//                this.prezo=prezo+suma;
//                break;
//            case 'D':
//                suma=50;
//                this.prezo=prezo+suma;
//                break;
//            case 'E':
//                suma=30;
//                this.prezo=prezo+suma;
//                break;
//            case 'F':
//                suma=10;
//                this.prezo=prezo+suma;
//                break;    
//        }
//        if (peso>=0 && peso<=19){
//            this.prezo=prezo+10; 
//        }
//        if (peso>=20 && peso<=49){
//            this.prezo=prezo+50; 
//        }
//        if (peso>=50 && peso<=79){
//            this.prezo=prezo+80; 
//        }
//        if (peso>=80){
//            this.prezo=prezo+100; 
//        }
//        return prezo;
//    }
  //  
//  LETRA   PREZO       TAMAÑO                  PREZO
//A        100€       Entre 0 e 19 kg         10€ 
//B        80€        Entre 20 e 49 kg        50€ 
//C        60€        Entre 50 e 79 kg        80€ 
//D        50€        Maior que 80 kg         100€ 
//E        30€    
//F        10€ 

  
  
    public double prezoFinal(){

        switch (cons){
            case A:
                this.prezo=prezo+cons.extra;
                break;
            case B:
                this.prezo=prezo+cons.extra;
                break;
            case C:
                this.prezo=prezo+cons.extra;
                break;
            case D:
                this.prezo=prezo+cons.extra;
                break;
            case E:
                this.prezo=prezo+cons.extra;
                break;
            case F:
                this.prezo=prezo+cons.extra;
                break;    
        }
        if (peso>=0 && peso<=19){
            this.prezo=prezo+10; 
        }
        if (peso>=20 && peso<=49){
            this.prezo=prezo+50; 
        }
        if (peso>=50 && peso<=79){
            this.prezo=prezo+80; 
        }
        if (peso>=80){
            this.prezo=prezo+100; 
        }
        return prezo;
    }
  
    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //para clase enum
    public Letras getCons() {
        return cons;
    }
    
    //para clase enum
    public void setCons(Letras cons){
        this.cons=cons;
    }
//tras clase enum:
//    public void setCons(char cons) {
//        this.cons = cons;
//    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    @Override
    public String toString() {
        return "Electrodomestico: El precio es " + prezo + ", cor: " + cor + ", consumo: " + cons + ", peso=" + peso;

    }
    


  
    
}
