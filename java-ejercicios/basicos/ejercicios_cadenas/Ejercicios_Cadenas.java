/*
Crear también la clase principal en la que se usarán los métodos creados. 

 */
package ejercicios_cadenas;


public class Ejercicios_Cadenas {

    public static void main(String[] args) {
        
        String ej1="Cadena de prueba";
        String ej2=new String("A mi me mima");
        String ej3="Amad a la dama";
        String ej4="anota la atona";
        String ej5="Anota la atona";
        String ej6="anota y atona";
        
        System.out.println("Con charAt:");
        Operaciones_Cadenas.reves(ej1);
        System.out.println();
        System.out.println(Operaciones_Cadenas.reves4(ej1));     
        System.out.println();
        System.out.println("Con StringBuilder:");
        Operaciones_Cadenas.reves2(ej2);
        
        System.out.println("-------------");
        System.out.println("Sin espacios:");
        System.out.println(Operaciones_Cadenas.sinEspacios2(ej1));
        System.out.println(Operaciones_Cadenas.sinEspacios3(ej3));
        Operaciones_Cadenas.sinEspacios(ej2);
        System.out.println();
        
        System.out.print("-------------");        
        Operaciones_Cadenas.palindromo(ej6);
        Operaciones_Cadenas.palindromo(ej6);
        Operaciones_Cadenas.palindromo2(ej6);
        Operaciones_Cadenas.palindromo3(ej6);
        System.out.println();
        System.out.println(Operaciones_Cadenas.palindromo4(ej6));
        System.out.println();
        
        System.out.println("-------------");
        Operaciones_Cadenas.aparicionesPalabra(ej2, "ma");
        System.out.println();
        Operaciones_Cadenas.aparicionesPalabra(ej3, "ma");
        System.out.println();
        Operaciones_Cadenas.aparicionesPalabra(ej4, "ma");
        System.out.println();
        System.out.println("Modo dos:");
        Operaciones_Cadenas.aparicionesPalabra2(ej2, "ma");
        System.out.println();
        Operaciones_Cadenas.aparicionesPalabra2(ej3, "ma");
        System.out.println();
        Operaciones_Cadenas.aparicionesPalabra2(ej4, "ma");
        System.out.println();
        
        System.out.println("-------------");
        Operaciones_Cadenas.ocurrenciasPalabra(ej2, "mi");
        System.out.println();
        Operaciones_Cadenas.ocurrenciasPalabra(ej5, "an");
        System.out.println();
        Operaciones_Cadenas.ocurrenciasPalabra(ej6, "an");
        System.out.println("_");
        System.out.println(Operaciones_Cadenas.ocurrenciasPatron(ej6, "an"));
        System.out.println();
        System.out.println("-------------");
        Operaciones_Cadenas.sustituirPalabra(ej4, "na", "su", true);    //String sTexto, String sTextoBuscado, String sTextoNuevo, boolean maYus
        System.out.println();
        Operaciones_Cadenas.sustituirPalabra(ej2, "mi", "su", true);
        System.out.println();
        Operaciones_Cadenas.sustituirPalabra(ej5, "anota", "su", true);
        System.out.println(Operaciones_Cadenas.sustituirPalabra2(ej5, "anota", "su", true));
        System.out.println();
        System.out.println(Operaciones_Cadenas.sustituirPalabra(ej2, "mi", "su", false));
        System.out.println();    
        
        
        
    }
    
}
