package bloque1;

public class Ejercicio04 {
// Clase Ejercicio, es el ejercicio 1.4 hecho por Juan Carlos Montes.
    public static void main(String[] args) {
    /*PRIMERO ABRIMOS LAS VARIABLES*/
    /*1. Si un empleado está casado o no.*/
    boolean casado = true;
    boolean soltero = false;
    
    /*2. Valor maximo no modificable: 999999.*/
    final int MAXIMO = 999999;
    
    /*3. Dia de la semana*/
    byte diasem = 1;

    /*4. Dia del ano.*/
    short diaanual = 300;
    
    /*5. Sexo: con dos valores posibles 'V' o 'M'*/
    char sexo= 'M';
    
    /*6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros dias.*/
    long miliseg = 1298332800;

    /*7. Almacenar el total de una factura.*/
    double totalfactura = 10350.678;

    /*8. Población mundial del planeta tierra.*/
    long poblacion = 677523574;
    
    /*AHORA CREAMOS EL PRINT*/
    System.out.println ("Ahora mostramos las variables con println: ");
    System.out.println ("El valor de la variable casado es: " + casado);
    System.out.println ("El valor de la variable MAXIMO es: " + MAXIMO);
    System.out.println ("El valor de la variable diasem es: " + diasem);
    System.out.println ("El valor de la variable diaanual es: " + diaanual);
    System.out.println ("El valor de la variable miliseg es:" + miliseg);
    System.out.println ("El valor de la variable totalfactura es: " + totalfactura);
    System.out.println ("El valor de la variable poblacion es: " + poblacion);
    System.out.println ("El valor de la variable sexo es: " + sexo + "\n");
    
    System.out.printf ("Ahora mostramos las variables con printf: " + "\n");
    System.out.printf ("La variable casado contiene:" + casado + "\n" + "La variable MAXIMO contiene:" + MAXIMO + "\n" + "La variable diasem contiene:" + diasem + "\n" + "La variable diaanual contiene:" + diaanual + "\n" + "La variable miliseg:" + miliseg + "\n" + "La variable totalfactura contiene:" + totalfactura + "\n" + "La variable poblacion contiene:" + poblacion + "\n" + "La variable sexo contiene:" + sexo + "\n");
    }
}