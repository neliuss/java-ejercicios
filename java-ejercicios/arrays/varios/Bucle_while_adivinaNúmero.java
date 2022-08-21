
package varios;
import java.util.*;

public class Bucle_while_adivinaNúmero {


    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*100);//refundición a entero, ya que devuelve decimal
        //System.out.println(aleatorio);    //comprobar azar
        Scanner entrada=new Scanner (System.in);
        int num=0;
        int intento=0;
      //2 Formas: Primera:
     
//        while (num!=aleatorio){
//            System.out.println("Introduce un número"); 
//            num=entrada.nextInt();
//            if (num<aleatorio){
//                System.out.println("tira parriba");
//            }
//            /*
//            if (num>aleatorio){
//                System.out.println("tira pabajo");
//            }
//            if (num==aleatorio){
//                System.out.println("Parabéns");
//            }
//*/
//            //Otra forma(dentro de la primera opcion:
//            else if (num>aleatorio){
//                System.out.println("tira pabajo");
//            }
//        }
        
        //Segunda forma: mejor ésta para asegurarse que si en número aleatorio, sale 0,en la primera ni se ejecutaría el programa:
        do{ 
            System.out.println("Introduce un número"); 
            num=entrada.nextInt();
            if (num<aleatorio){
                System.out.println("tira parriba");
            }
             else if (num>aleatorio){
                System.out.println("tira pabajo");
            }
        }while (num!=aleatorio);
        
        System.out.println("Parabéns");
    }
    
}
