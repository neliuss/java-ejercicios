package movil;
import java.util.Scanner;

public class MainMovil {

 
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        Movil Mimovil=new Movil();
     //   Movil Tumovil=new Movil(639898989,0.15,0.04,0.002,20); //para comprobar si funcionaba el menú.
        int num;
   
         //alta telef: mete datos
        System.out.println("Dime el número de móvil");
        String numtelef=teclado.nextLine();
   //   String comprobacion=Integer.toString(numtelef);
        
        do{
               if (numtelef.length()!=13){
                    System.out.println("Introduce tu número de móvil correctamente. Debe tener 13 dígitos");
                     System.out.println("Dime el número de móvil");
                        numtelef=teclado.nextLine();
                }
       
                if (numtelef.length()==13){
                         Mimovil.setNumero(numtelef);
                }
        }while (numtelef.length()!=13);   
                do {
                    System.out.println("Menú:");
                    System.out.println("1.Saldo:");
                    System.out.println("2.Recarga:");
                    System.out.println("3. Hacer llamada:");
                    System.out.println("4.Navegar:");
                    System.out.println("5.Recargar como ejercicio:");
                    System.out.println("6.Consultar saldo como ejercicio:");
                    System.out.println("7.Salir:");

                    num=teclado.nextInt();

                    switch(num){
                        case 1: 
                             System.out.println(Mimovil.toString());
                            break;
                        case 2:
                            meter_saldo(Mimovil);
                            break;
                        case 3:
                            llamar(Mimovil);
                            break;
                        case 4:
                            navegaMovil(Mimovil);
                            break;
                        case 5:
                            rec_ej(Mimovil);
                            break;
                        case 6:
                            verSaldoEj(Mimovil);
                            break;
                        default: System.out.println("Número no válido");

                    }
                }while (num!=7);
    }
   //FIN MENÚ y de main:
        
        public static void meter_saldo(Movil Unmovil){
            Scanner teclado=new Scanner(System.in);
            System.out.println("¿Cuánto dinero desea ingresar?");
            int ingreso=teclado.nextInt();
            Unmovil.setSaldo(ingreso);
            Unmovil.getSaldo();
        }
        
        public static void llamar(Movil Unmovil){
            Scanner teclado=new Scanner(System.in);
            System.out.println("¿Duración en segundos de la llamada?");
            int seg=teclado.nextInt();
            Unmovil.efectuarLlamada(seg);
        }
        
        public static void navegaMovil(Movil Unmovil){
            Scanner teclado=new Scanner(System.in);
            System.out.println("¿Consumo en MB?");
            int mb=teclado.nextInt();
            Unmovil.navegar(mb);
        }
        
        public static void rec_ej(Movil Unmovil){
           Scanner teclado=new Scanner(System.in);
           System.out.println("¿Cuánto dinero desea ingresar?");
           int importe=teclado.nextInt();
           System.out.println(Unmovil.recargar(importe)); 
        }
        
        public static void verSaldoEj(Movil Unmovil){
            System.out.print("Su saldo asciende a ");
            System.out.println(Unmovil.consultarSaldo());
        }

}
