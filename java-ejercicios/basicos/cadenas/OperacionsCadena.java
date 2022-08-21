package cadenas;

import static java.lang.Character.isSpaceChar;

/**
 *
 * @author dawa51
 */
public class OperacionsCadena {
    
    public static String reves(String s){
        if (s == null) return s;
 
    String s2 = "";
    for (int i = s.length() - 1; i >= 0; i--) s2 = s2 + s.charAt(i);
       return s2; 
    }

    public static String sinEspacios(String s){
        if (s == null) return s;
        
    String s2 = "";
    for (int i = 0; i < s.length(); i++){
        if (isSpaceChar(s.charAt(i))==false)
            s2 = s2 + s.charAt(i);
        
    }
       return s2; 
    }

    public static boolean palindromo(String s){
        if (sinEspacios(s).equalsIgnoreCase(reves(sinEspacios(s)))) return true;
        else return false;
    }

    public static int aparicionesPalabra(String sTexto, String sTextoBuscado) {
        int contador = 0;
        while (sTexto.indexOf(sTextoBuscado) > -1) {
          sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
          contador++; 
        }
        return contador;
    }

    public static String ocurrenciasPalabra(String sTexto, String sTextoBuscado) {
        String finTexto = "";
        String[] partes = sTexto.split(" ");
        for (int i=0; i<partes.length; i++){

            if (partes[i].toUpperCase().startsWith(sTextoBuscado.toUpperCase()))
                finTexto=finTexto+partes[i]+", ";
        }
        return finTexto;
    }    

        public static String sustituirPalabra(String sTexto, String sTextoBuscado, String sTextoNuevo, boolean maYus) {
        String finTexto = "";
        String[] partes = sTexto.split(" ");
        if (maYus){
            for (int i=0; i<partes.length; i++){
                if (partes[i].toUpperCase().equals(sTextoBuscado.toUpperCase())) finTexto=finTexto+sTextoNuevo+" ";
                else finTexto=finTexto+partes[i]+" ";
            }
        }
        else {
            for (int i=0; i<partes.length; i++){
                if (partes[i].equals(sTextoBuscado)) finTexto=finTexto+sTextoNuevo+" ";
                else finTexto=finTexto+partes[i]+" ";
            }
        }            
        return finTexto;
    }    

}
