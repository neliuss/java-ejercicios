
package varios;

import javax.swing.JOptionPane;

public class EjerciciosProgramación {

    public static void main(String[] args) {
       
        final double apulgadas=2.54; //declaramos como constante con final
        double cm=6;
        double resultado=cm/apulgadas;
        System.out.println("En " + cm + " cm, hay " +resultado+ " pulgadas");
   /*
Math.sqrt(n):raíz cuadrada
Math.pow(base,exponente):potencia de un número.base y expon son doubles
math.sin(ángulo). math.cos(ángulo). math.tan(ángulo). math.atan(ángulo)
Math.round(decimal):redondeo de número.
Math.PI:constante de pi
*/
        
        double raiz=Math.sqrt(9); //raíz siempre es double, sino da fallo
        System.out.println(raiz);
        
       
        //float num=5.85F; //F para indicar que es float
        // int resul= Math.round(num);
      //  System.out.println(resul);
        
        double num=5.85;
        int resul=(int)Math.round(num); //refundición para q devuelva int
        System.out.println(resul);
  
        System.out.println ("----------------visualizar decimales---------------------------------------");
        double x=1000.0;
        System.out.println(x/3);
        System.out.printf("%1.2f",x/3);//siempre entre comillas en los (); y poner print f(imprime con forma(formato al valor numérico,valor numérico)
       System.out.println ("");
        System.out.println ("----------------visualizar decimales---------------------------------------");
        
        String num1=JOptionPane.showInputDialog("Introduce un número");
        //cambio el número que es un string a double
        Double num2=Double.parseDouble(num1);
        System.out.print("La raíz de "+num2+" es ");
        System.out.printf("%1.2f",Math.sqrt(num2));
    }
    
}

 
