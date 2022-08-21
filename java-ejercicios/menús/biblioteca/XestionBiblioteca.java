package biblioteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class XestionBiblioteca {
    static Scanner miTeclado = new Scanner(System.in);
    
    public static void main(String[] args) {
    ArrayList <Libro> librosBiblio = new ArrayList<>(); 
    int op ;
    do {
        System.out.println("**************************");
        System.out.println("1 Alta Libro:");
        System.out.println("2 Baixa Libro:");
        System.out.println("3 Modificar Libro:");
        System.out.println("4 Buscar Libro:");
        System.out.println("5 Saír");
        op=introDatos("Escolle unha opción:");
        switch (op){
            case 1: {
                System.out.println("Alta Libro");
                //librosBiblio.add(introLibro());
                CrearLibros(librosBiblio);
                break;    
            }
            case 2: {
                System.out.println("Baixa Libro");
                baixaArrays(librosBiblio);
                break;
            }
            case 3: {
                System.out.println("Modificar Libro");
                modifLibro(librosBiblio);
                break;
            }
            case 4: {
                System.out.println("Buscar por título do Libro");
                buscarTit(librosBiblio);
                break;
            }
            case 5: System.out.println("Ata logo xestión biblioteca.");
            break;       
            default: System.out.println("Opción non válida:");
            break; 
            }
    }
    while(op!=5);   
    
}
    public static Libro introLibro(){
        Libro l = new Libro();
        System.out.println("Titulo do libro:");
        l.setTitulo(miTeclado.next());
        System.out.println("Editorial do libro:");
        l.setEditorial(miTeclado.next());
        introAutores(l.getAutores());
        l.setIsbn(introDatos("ISBN do libro:"));
        l.setNumPax(introDatos("Número de páxinas:"));
        l.setAutoSignatura();
        System.out.println(l.toString());
        return l;
    }   

    public static void introAutores (ArrayList a){
        boolean salAutor=false;
        do {
            System.out.println("Autor/Autores do libro:");
            a.add(miTeclado.next());
            boolean sn=false;
            do {
                System.out.print("Desexa introducir outro autor???(s/n)");
                char SN=miTeclado.next().charAt(0);
                if (SN=='S' || SN=='s') sn=true;
                else if (SN=='N' || SN=='n'){
                    salAutor=true;
                    sn=true;
                }
                else System.out.print("Elección erronea!!!");
            } while (sn==false);
        } while (salAutor==false);
    }    
    
    public static void CrearLibros(ArrayList l){
        l.add(new Libro("aaaaaa","bbbbbb",new ArrayList(){{add("Cervantes");}},123456123,120));
        l.add(new Libro("bbbbbb","bbbbbb",new ArrayList(){{add("Cervantes");add("Rosalía");}},456456123,120));
        l.add(new Libro("cccccc","bbbbbb",new ArrayList(){{add("Cervantes");}},789456123,120));
        l.add(new Libro("dddddd","bbbbbb",new ArrayList(){{add("Cervantes");}},147456123,120));
        Iterator<Libro> it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
    
    public static void baixaArrays (ArrayList a){
        if (a.isEmpty()) System.out.println("Arquivo baleiro!!!");
        else {
            for (int i=0;i<a.size();i++){
                System.out.println("Nº rexistro "+ (i+1) +": "+ a.get(i));
            }
            boolean conError;
            do {
                conError=false;
                try {
                    System.out.println("Qué rexistro desexa cargarse???");
                    int alP=miTeclado.nextInt()-1;
                    System.out.println(a.get(alP));
                    boolean salir=false;
                    do {
                        System.out.print("Desexa borrar este rexistro???(s/n)");
                        char SN=miTeclado.next().charAt(0);
                        if (SN=='S' || SN=='s') {
                            a.remove(alP);
                            System.out.println("Arquivo borrado!!!");
                            salir=true;
                        }
                        else
                            if (SN=='N' || SN=='n') salir=true;
                            else System.out.print("Elección erronea!!!");
                    } while (salir!=true);                                        
                }
                catch (IndexOutOfBoundsException e) {
                    miTeclado.nextLine();
                    System.out.println("Pasou algo meu!!!");
                    conError=true;
                }
                catch (InputMismatchException e) {
                    miTeclado.nextLine();
                    System.out.println("Escribe un número, animal!!!");
                    conError=true;
                }
            } while (conError);
        }
    }

    public static void modifLibro (ArrayList l){
        if (l.isEmpty()) System.out.println("Arquivo baleiro!!!");
        else {
            for (int i=0;i<l.size();i++){
                System.out.println("Nº rexistro "+ (i+1) +": "+ l.get(i));
            }
            boolean conError;
            do {
                conError=false;
                try {
                    System.out.println("Qué rexistro desexa Modificar???");
                    int alP=miTeclado.nextInt()-1;
                    System.out.println(l.get(alP));
                    boolean salir=false;
                    do {
                        System.out.print("Desexa modificar este rexistro???(s/n)");
                        char SN=miTeclado.next().charAt(0);
                        if (SN=='S' || SN=='s') {
                            modificarLibro((Libro) l.get(alP));
                            System.out.println("Arquivo modificado!!!");
                            salir=true;
                        }
                        else
                            if (SN=='N' || SN=='n') salir=true;
                            else System.out.print("Elección erronea!!!");
                    } while (salir!=true);                                        
                }
                catch (IndexOutOfBoundsException e) {
                    miTeclado.nextLine();
                    System.out.println("Pasou algo meu!!!");
                    conError=true;
                }
                catch (InputMismatchException e) {
                    miTeclado.nextLine();
                    System.out.println("Escribe un número, animal!!!");
                    conError=true;
                }
            } while (conError);
        }
    }
    
    public static void modificarLibro(Libro l){
        int op ;
        do {
            System.out.println(l.toString());
            System.out.println("Qué desexa modificar: \n 1:Título. \n 2:Editorial. \n 3:Autor/Autores."
                    + "\n 4:ISBN. \n 5:Nº Páxinas. \n 6:Sair.");    
            op=introDatos("Escolle unha opción:");
            switch (op){
                case 1: {
                    System.out.println("Modificar Título: " + l.getTitulo() + ", por: ");
                    l.setTitulo(miTeclado.next());
                    l.setAutoSignatura();
                }
                break;
                case 2: {
                    System.out.println("Modificar Editorial: " + l.getEditorial() + ", por: ");
                    l.setEditorial(miTeclado.next());
                    l.setAutoSignatura();
                }
                break;
                case 3: {
                    modifAutores(l.getAutores());
                }
                break;
                case 4: {
                    l.setIsbn(introDatos("Modificar ISBN: " + l.getIsbn() + ", por: "));
                    l.setAutoSignatura();
                }
                break;
                case 5: {
                    l.setNumPax(introDatos("Modificar Nº páxinas: " + l.getNumPax() + ", por: "));                
                }
                break;
                case 6: System.out.println("Ata logo xestión Modificar.");
                break;       
                default: System.out.println("Opción non válida:");
                break; 
            }
        }while(op!=6);   
    }   

    public static void modifAutores(ArrayList a){
        int op ;
        do {
            for (int i=0; i<a.size();i++){
                System.out.println(a.get(i));
            }
            System.out.println("Qué desexa modificar: \n 1:Alta autor. \n 2:Baixa autor. \n 3:Modificar autor."
                    + "\n 4:Sair.");    
        op=introDatos("Escolle unha opción:");
            switch (op){
                case 1: introAutores(a);
                break;
                case 2: baixaArrays(a);
                break;
                case 3: modificarAutores(a);
                break;
                case 4: System.out.println("Ata logo xestión modificar autores.");
                break;       
                default: System.out.println("Opción non válida:");
                break; 
            }
        }while(op!=4);   
    }

    public static void modificarAutores(ArrayList a){
            if (a.isEmpty()) System.out.println("Arquivo baleiro!!!");
        else {
            for (int i=0;i<a.size();i++){
                System.out.println("Nº rexistro "+ (i+1) +": "+ a.get(i));
            }
            boolean conError;
            do {
                conError=false;
                try {
                    System.out.println("Qué rexistro desexa Modificar???");
                    int alP=miTeclado.nextInt()-1;
                    System.out.println(a.get(alP));
                    boolean salir=false;
                    do {
                        System.out.print("Desexa modificar este rexistro???(s/n)");
                        char SN=miTeclado.next().charAt(0);
                        if (SN=='S' || SN=='s') {
                            System.out.println("Autor do libro!!!");
                            a.set(alP, miTeclado.next());
                            salir=true;
                        }
                        else
                            if (SN=='N' || SN=='n') salir=true;
                            else System.out.print("Elección erronea!!!");
                    } while (salir!=true);                                        
                }
                catch (IndexOutOfBoundsException e) {
                    miTeclado.nextLine();
                    System.out.println("Pasou algo meu!!!");
                    conError=true;
                }
                catch (InputMismatchException e) {
                    miTeclado.nextLine();
                    System.out.println("Escribe un número, animal!!!");
                    conError=true;
                }
            } while (conError);
        }
    }

    public static void buscarTit(ArrayList a) {
        String sTextoBuscado;
        Libro l;        
        boolean salAutor=false, atop;
        do {
            atop=false;
            System.out.println("Texto de busqueda:");
            sTextoBuscado=miTeclado.next();
            for (int i=0; i<a.size(); i++){
                l=(Libro) a.get(i);
                if (l.getTitulo().toUpperCase().startsWith(sTextoBuscado.toUpperCase())){
                    System.out.println(l.toString());
                    atop=true;
                }    
            }
            if (atop==false) System.out.println("Libro non atopado!!!");
            boolean sn=false;
            do {
                System.out.print("Desexa buscar outro libro???(s/n)");
                char SN=miTeclado.next().charAt(0);
                if (SN=='S' || SN=='s') sn=true;
                else if (SN=='N' || SN=='n'){
                    salAutor=true;
                    sn=true;
                }
                else System.out.print("Elección erronea!!!");
            } while (sn==false);
        } while (salAutor==false);





    }    
    
    public static int introDatos (String m){
        System.out.println(m);
        int y = 0;
        boolean conError;
        do {
            conError=false;
            try {
                y=miTeclado.nextInt();
            }
            catch (InputMismatchException e) {
                miTeclado.nextLine();
                System.out.println("Escribe un número, animal!!!");
                conError=true;
            }
        } while (conError);
        return y;
    }
}