package enumeraciones.comoclases;
public class EjemploPlanetas {

	public static void main(String[] args) {
		
		double pesoEnLaTierra = 75.0;
        double masaEnLaTierra = pesoEnLaTierra/ Planeta.TIERRA.gravedadSuperficial();
        for (Planeta p : Planeta.values())
           System.out.printf("Tu peso en "+p+" es "+p.pesoEnLaSuperficie(masaEnLaTierra));
        

	}

}
