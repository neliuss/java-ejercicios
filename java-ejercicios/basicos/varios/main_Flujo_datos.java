/*TAREA 
Crear un programa en el que se declaren 4 variables de los siguientes tipos y que se le pidan al usuario por teclado sus valores:
-Entero (int)
-Decimal  con por lo menos 3 cifras en la parte entera y 6 en la parte decimal  (float)
-Cadena (String)
-Fecha (Date)
•	Utilizar tanto el método format() como printf()
A cada variable asignarle un valor y después mostrarlas por pantalla utilizando los siguientes formatos:
TIPO  DATO              	FORMATO
entero          Mostraremos el signo aunque sea positivo y en un ancho de 12 caracteres
float           Mostrar el número con 3 decimales y mostrarlo también en notación científica
cadena          Mostrar la cadena en mayúscula, ocupando 15 espacios
fecha           Mostrar en distintos formatos, fecha y hora

 */
package varios;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main_Flujo_datos {

    
    
    public static void main(String[] args) {
        
        System.out.println("dimeEntero:");
        dameEntero();
        
        System.out.println("dimeFloat:");
        dameFloat();
        
//        System.out.println("dimeString:");
//        dameString();
        
        System.out.println("dimeFecha:");
        dameFecha();
        System.out.println("dimeFecha2:");
        dameFecha2();
        
    }
    
    public static int dameEntero() {
        System.out.println("Introduzca número entero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.printf("El número introducido es: %d %n", num);

//El primer % indica que en esa posición se va a escribir un valor. El valor a escribir se encuentra a continuación de las comillas.
//.2 indica el número de decimales.
//La f indica que el número es de tipo float o double. Si el número a mostrar es un entero se utiliza el caracter d:    System.out.printf("%d %n", x);
//%n indica un salto de línea. Equivale a \n. Con printf podemos usar ambos para hacer un salto de línea.
        return num;
        
    }
    
    public static float dameFloat() {
        
        System.out.println("Introduzca número decimal. Separa por comas (float)");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.printf("%+.4f %n", num);
        return num;
    }
    
//    public String dameString() {
//        
//    }
    
    public static Date dameFecha() {

        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = fecha; 
                
        try{
            testDate = df.parse(date);
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+testDate);
        } catch (Exception e){ System.out.println("invalid format");}

        if (!df.format(testDate).equals(date)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
        return testDate;
    }
    
    public static String dameFecha2() {
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
               
        return "La fecha introducida es:" +fecha;
    }
}
      

/*Si queremos mostrar el número 12.3698 de tipo double con dos decimales:

System.out.printf("%.2f %n", 12.3698);

El primer % indica que en esa posición se va a escribir un valor. El valor a escribir se encuentra a continuación de las comillas.
.2 indica el número de decimales.
La f indica que el número es de tipo float o double. En la tabla que aparece más adelante podeis ver todos los carateres de conversión para todos los tipos de datos.
%n indica un salto de línea. Equivale a \n. Con printf podemos usar ambos para hacer un salto de línea.

La salida por pantalla es:
12,37

Comprobamos que printf realiza un redondeo para mostrar los decimales indicados.
Lo más común será que tengamos el valor en una variable, en ese caso si queremos escribir el valor de n con tres decimales:

double n = 1.25036;
System.out.printf("%.3f %n", n);
Salida:
1,250

Para mostrar el signo + en un número positivo:
double n = 1.25036;
System.out.printf("%+.3f %n", n);
Salida:
+1.250

Si el número a mostrar es un entero se utiliza el caracter d:
int x = 10;
System.out.printf("%d %n", x);
Salida:
10

Para mostrarlo con signo:
int x = 10;
System.out.printf("%+d %n", x);
Salida:
+10

Para mostrar varias variables pondremos tantos % como valores vamos a mostrar. Las variables se escriben a continuación de las comillas separadas por comas:

double n = 1.25036;
int x = 10;
System.out.printf("n = %.2f x = %d %n", n, x);
Salida:
n = 1,25 x = 10

Cuando hay varias variables podemos indicar de cual de ellas es el valor a mostrar escribiendo 1$, 2$, 3$, ... indicando que el valor a mostrar es el de la primera variable que aparece a continuación de las comillas, de la segunda, etc.
La instrucción anterior la podemos escribir así:
System.out.printf("n = %1$.2f x = %2$d %n", n, x);

Este número es opcional, si no aparece se entenderá que el primer valor proviene de la primera variable, el segundo de la segunda, etc.

Si queremos mostrar el número 123.4567 y su cuadrado ambos con dos decimales debemos escribir:
double n = 123.4567;
System.out.printf("El cuadrado de %.2f es %.2f\n", n, n*n);
Salida:
El cuadrado de 123,46 es 15241,56

printf permite mostrar valores con un ancho de campo determinado. Por ejemplo, si queremos mostrar el contenido de n en un ancho de campo de 10 caracteres escribimos:

double n = 1.25036;
System.out.printf("%+10.2f %n", n);
Salida:
bbbbb+1.25
Donde cada b indica un espacio en blanco.
El 10 indica el tamaño en caracteres que ocupará el número en pantalla. Se cuentan además de las cifras del número el punto decimal y el signo si lo lleva. En este caso el número ocupa un espacio de 5 caracteres (3 cifras, un punto y el signo) por lo tanto se añaden 5 espacios en blanco al principio para completar el tamaño de 10.

Si queremos que en lugar de espacios en blancos nos muestre el número completando el ancho con ceros escribimos:
System.out.printf("%+010.2f %n", n);
Salida:
+000001.25

Más ejemplos de printf:

Mostrar el número 1.22 en un ancho de campo de 10 caracteres y con dos decimales.

double precio = 1.22;
System.out.printf("%10.2f", precio);

Salida:
bbbbbb1.22 
(el carácter b indica un espacio en blanco)
El número ocupa un espacio total de 10 caracteres incluyendo el punto y los dos decimales.

Mostrar la cadena "Total:" con un ancho de 10 caracteres y alineada a la izquierda:

System.out.printf("%-10s", "Total:");

Salida:
Total:bbbb

El caracter s indica que se va a mostrar una cadena de caracteres.
El signo - indica alineación a la izquierda.

Mostrar la cadena "Total:" con un ancho de 10 caracteres y alineada a la derecha:

System.out.printf("%10s", "Total:");

Salida:
bbbbTotal:
*/