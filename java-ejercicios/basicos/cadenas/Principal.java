package cadenas;
/**
 *
 * @author dawa51
 */
public class Principal {
    public static void main(String[] args) {
        if (OperacionsCadena.palindromo("La s Bb sal")) System.out.println("Si é Palíndromo");
        else System.out.println("Non é Palíndromo");

        System.out.println(OperacionsCadena.sustituirPalabra("pnnn pabra npalabra palotes y paBra fgfgfs palll pabra lsdfd ", "pabra", "pavra", false ));
 
    }
    
}
