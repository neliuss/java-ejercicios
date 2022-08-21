package Exercicio3;

/**
 *
 * @author dawa51
 */
public class NewMain {
    public static void main(String[] args) {
        Empregado miEmpregado = new Empregado("Pepe");
        System.out.println(miEmpregado);
        Directivo miDirectivo = new Directivo("Lydia");
        System.out.println(miDirectivo);
        Operario miOperario = new Operario("Luis");
        System.out.println(miOperario);
        Oficial miOficial = new Oficial("María");
        System.out.println(miOficial);
        Tecnico miTecnico = new Tecnico("Juan");
        System.out.println(miTecnico);
    }
}