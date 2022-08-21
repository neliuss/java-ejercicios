package bloque1;
import java.util.Scanner;

public class EJ8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int dia, año, menu;
        String mes="";

        System.out.println("Introduce el día en numeral (1-7) ");
        dia = teclado.nextInt();
        
        System.out.println("Introduce el mes en numeral (1-12)");
        menu = teclado.nextInt(); 

        System.out.println("Introduce el año");
        año = teclado.nextInt(); 
        
        switch (menu)   {
            case 1 : mes = "Enero"; break;     
            case 2 : mes = "Febrero"; break;   
            case 3 : mes = "Marzo"; break; 
            case 4 : mes = "Abril"; break; 
            case 5 : mes = "Mayo"; break;     
            case 6 : mes = "Junio"; break;   
            case 7 : mes = "Julio"; break; 
            case 8 : mes = "Agosto"; break;
            case 9 : mes = "Septiembre"; break;     
            case 10 : mes = "Octubre"; break;   
            case 11 : mes = "Noviembre"; break; 
            case 12 : mes = "Diciembre"; break;
        }
        

        System.out.println("La fecha es:\n  " + dia + " de " + mes + " del " + año);
    }
}


