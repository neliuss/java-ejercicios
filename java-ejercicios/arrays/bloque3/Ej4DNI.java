package bloque3;
import java.util.*;

public class Ej4DNI {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce tu DNI"); 
           int dni=entrada.nextInt();

        int letra=dni % 23;

        char []letras_dni={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

              System.out.println("Tu letra es : "+letras_dni[letra]);
        }
    }


