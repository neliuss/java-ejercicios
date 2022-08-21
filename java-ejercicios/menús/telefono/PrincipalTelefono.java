package telefono;
import java.util.Scanner;
/**
 *
 * @author dawa51
 */
public class PrincipalTelefono {
static Scanner miteclado = new Scanner (System.in);    
    public static void main(String[] args) {
        int op;
        Telefono miTelefono ;
        miTelefono= new Telefono();
        miTelefono.setNumMovil(678505130);
        miTelefono.setCostLlam(0.05);
        miTelefono.setCostMin(0.01);
        miTelefono.setCostMB(0.02);
        do {
            System.out.println("**COMO CHE SALGA DA FANDANGA***********");
            System.out.println("1 Efectuar llamada:");
            System.out.println("2 Navegar:");
            System.out.println("3 Recargar");
            System.out.println("4 Consultar saldo");
            System.out.println("5 Saír");
            op=miteclado.nextInt();
            switch (op){
                case 1: realizarLlamada(miTelefono); break;
                
                case 2: navegar(miTelefono) ; break;
                        
                case 3: ; recargar(miTelefono); break;
                     
                case 4: ; System.out.println(miTelefono.getSaldoMovil()); break;
                     
                case 5: System.out.println("Ata logo Mari Carmen."); break;       
                default: System.out.println("Opción non válida:"); break; 
                }
            }
        while (op!=5);
    }
    public static void realizarLlamada(Telefono Telf) {
        int seg;
        if (Telf.getSaldoMovil()<=0) System.out.println("Sen Saldo!!!");
        else {
            System.out.println("Introducir Segundos:");
            seg=miteclado.nextInt();
            Telf.efectuarLlamada(seg);
        }
    }    
    public static void navegar(Telefono Telf) {
        if (Telf.getSaldoMovil()<=0) System.out.println("Sen Saldo!!!");
        else {
            System.out.println("Introducir MB:");
            Telf.navegar(miteclado.nextInt());
        }
    }    
    public static void recargar(Telefono Telf) {
        System.out.println("Introducir Coste Recarga:");
        Telf.recargar(miteclado.nextInt());
    }    
    public static void consultar(Telefono Telf) {
        System.out.println(Telf.getSaldoMovil());
    }    
}
