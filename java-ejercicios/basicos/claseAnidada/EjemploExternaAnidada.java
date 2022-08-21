/**
 * EJEMPLO DE USO DE CLASES ANIDADAS ESTÁTICAS Y NO ESTÁTICAS
 */
package claseAnidada;

public class EjemploExternaAnidada {

	public static void main(String[] args) {
		
		//Podemos instanciar AnidadaEstatica sin necesidad de tener
		//una instancia de Externa
		Externa.AnidadaEstatica ie = new Externa.AnidadaEstatica("SOY ESTATICA");
		System.out.println("ESTATICA: "+ie.getStr());
		//System.out.println("ESTATICA: "+ie.getN()); no puede acceder
				
		//Estas son las dos formas de instanciar una clase
		//anidada NO estática
		//Creando primero la instancia externa
		Externa e = new Externa(1);
		//Y usándola para crear la anidada
		Externa.Anidada i = e.new Anidada("HOLA");
		//Creando ambas instancias a la vez
		Externa.Anidada i2 = new Externa(2).new Anidada("Mundo");
		
		
		System.out.println("Anidada uno: "+i.getN()+" cadena:"+i.getS());
		System.out.println("anidada dos: el número de la externa "+i2.getN());

	}

}
