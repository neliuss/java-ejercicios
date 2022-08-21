
package varios;
import java.util.*;

public class tryCatch_ecuacion {

    public static void main(String[] args) {
        int n1, n2, n3;
        
        System.out.println("Introduce datos  :");
        
        do{
            n1=intro_datos("introduce un número(debe ser distinto de 0):");
        } while(n1==0);
        
        n2=intro_datos("introduce un número");
        n3=intro_datos("introduce un número");
        
        calcular_datos(n1,n2,n3);
    }
    
    public static int intro_datos(String d){
        Scanner teclado=new Scanner(System.in);
        System.out.println(d);
        int x=0;
        boolean conError;
        
        do {
            conError=false;
            try{
                x=teclado.nextInt();
            }
            catch (InputMismatchException f) {
                teclado.nextLine();
                 System.out.println("Dime número:");
                 conError=true;
                }
        }while(conError);
        return x;
        }  
    
    public static void calcular_datos(int a, int b, int c){
        double pos, neg;
        pos=(((b*-1)+Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a);
        neg=(((b*-1)-Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a);
        System.out.println("Dos valores, positivo :"+pos+" y negativo : "+neg);
    }
    
    
}
    

    //1,3,2

