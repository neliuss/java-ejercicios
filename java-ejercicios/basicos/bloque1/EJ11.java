package bloque1;
import java.util.Scanner;

public class EJ11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int cm, m;

     do{   
         System.out.println("Introduce la medidad en metros(negativo para salir) ");
     
        m = teclado.nextInt();
        cm=m*100;
        if (m>0) 
             System.out.println(+ m +" metros son " + cm + " centímetros ");

    } while (m>0);
              
    }
    
}


