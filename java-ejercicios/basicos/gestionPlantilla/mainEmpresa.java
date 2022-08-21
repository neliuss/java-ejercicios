/*Exercicio 2: Escribe un programa que controle os datos de todas as persoas que
traballan nunha empresa. De todas elas, interésanos: nome, salario base (o mesmo
para todos) e idade. Entre os empregados que traballan na empresa, hai dous grupos
de persoas das que nos interesa algún dato máis:
– Administrativos: dos cales, nos interesa os estudios académicos e o número de
ordenador asignado.
– Maquinistas: dos cales, nos interesa o número de máquina asignada e a cantidade
de anos que leva coa devandita máquina.
É obrigatorio empregar construtores en cada unha das clases que se encarguen de
pedir os datos dos empregados. O método visualizarTodosDatos() estará en todas as
clases e se encargará de visualizar todos os datos da clase onde está.
O programa pedirá que o usuario indique o número de empregados que pertencen
ao grupo dos administrativos, ao grupo de maquinistas e número de empregados que
non están en ningún destes dous grupos. Posteriormente, pediranse os datos de cada
un deles. Todos os empregados gardaranse nun array.
Visualiza os datos de cada un deles (por grupos).   */
package gestionPlantilla;
import java.util.ArrayList;
import java.util.Scanner;

public class mainEmpresa {
public static Scanner teclado=new Scanner(System.in); //Si lo ponemos aquí, n ohace falta repetir los otros

    public static void main(String[] args) {
               
        ArrayList<Plantilla> plant= new ArrayList<Plantilla>(); 
               
        Scanner teclado=new Scanner(System.in);
        int elige;
        //menú:
        do {
                System.out.println("Menú:");
                System.out.println("1.Crear nuevo administrativo:");
                System.out.println("2.Crear nuevo maquinista:");
                System.out.println("3.Crear otra clase:");
                System.out.println("4.Ver datos de la plantilla completa:");
                System.out.println("5.Salir:");

                 elige=teclado.nextInt();

                switch (elige){
                    case 1:
                            creaAdmi(plant);
                            break;
                    case 2:
                            creaMaqui(plant); 
                            break;
                    case 3:
                            creaPlant(plant);
                            break;
                    case 4:
                        recorrer(plant);
                        break;                       
                    default:System.out.println("Número no válido");
                                                
                }   
        }while (elige!=5);
        }

    public static void recorrer(ArrayList<Plantilla> plant){   
      
        for (int i=0; i<plant.size(); i++){
            System.out.println(" "+plant.get(i));
        } 
        //????????????????Bien o no??
//        for (Plantilla e: plant){
//            System.out.println(e.toString());
//        }
        
    }
    
    
    public Plantilla getNomePlantilla(int i, ArrayList<Plantilla> plant) {
        return plant.get(i);
    }

    public void setNome(Plantilla empl, ArrayList<Plantilla> plant) {
        plant.add(empl);
    }
    
        public static void creaAdmi(ArrayList<Plantilla> plant){   //pq meto static?????, ArrayList<Plantilla> plant no lo meto??
        Scanner teclado=new Scanner(System.in);
        Administrativos admi=new Administrativos();
        
        System.out.println("Dime el nombre del trabajador");
        String nom=teclado.nextLine();
        admi.setNome(nom);
        
        System.out.println("¿Qué estudios posee?");
        String est=teclado.nextLine();
        admi.setEstudios_acad(est);
        
        System.out.println("¿Qué edad tiene?");
        int eda=teclado.nextInt();
        admi.setEdad(eda);
        
        System.out.println("¿Cal é o seu salario?");
        int sal=teclado.nextInt();
        admi.setSal_base(sal);
        
        System.out.println("¿Qué número de pc posee?");
        int pc=teclado.nextInt();
        admi.setNum_pc(pc);
        
        plant.add(admi);
    }
        
        public static void creaMaqui(ArrayList<Plantilla> plant){
        Scanner teclado=new Scanner(System.in);
        Maquinistas maqui=new Maquinistas();
        
        System.out.println("Dime el nombre del trabajador");
        String nom=teclado.nextLine();
        maqui.setNome(nom);
        
        System.out.println("¿Qué edad tiene?");
        int eda=teclado.nextInt();
        maqui.setEdad(eda);
        
        System.out.println("¿Cal é o seu salario?");
        int sal=teclado.nextInt();
        maqui.setSal_base(sal);
        
        System.out.println("¿Qué número de máquina posee?");
        int maq=teclado.nextInt();
        maqui.setNum_maq(maq);
        
        System.out.println("¿Cantos anos leva coa máquina?");
        int ant_maq=teclado.nextInt();
        maqui.setCant_anos_maq(ant_maq);
        
        plant.add(maqui);
    }
        
        public static void creaPlant(ArrayList<Plantilla> plant){
        Scanner teclado=new Scanner(System.in);
        Plantilla planti=new Plantilla();
        
        System.out.println("Dime el nombre del trabajador");
        String nom=teclado.nextLine();
        planti.setNome(nom);
        
        System.out.println("¿Qué edad tiene?");
        int eda=teclado.nextInt();
        planti.setEdad(eda);
        
        System.out.println("¿Cal é o seu salario?");
        int sal=teclado.nextInt();
        planti.setSal_base(sal);
       
        plant.add(planti);
    }
        
}
