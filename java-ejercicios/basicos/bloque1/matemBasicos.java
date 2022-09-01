package bloque1;

import java.util.Scanner;

public class matemBasicos {

    public static void main(String[] args) {
        float n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1 = sc.nextFloat();
        System.out.println("Intruduzca el segundo número: ");
        n2 = sc.nextFloat();
        float resultadosuma = n1 + n2;
        float resultadoresta = n1 - n2;
        float resultadomultiplicacion = n1 * n2;
        float resultadodivision = n1 / n2;
        float resultadopotencia = (int)Math.pow(n1,2);
        double resultadoraiz = Math.sqrt(n1);
        
        System.out.println("La suma de " + n1 + " mas " + n2 + " es: " + resultadosuma);
        System.out.println("La resta de " + n1 + " menos" + n2 + " es: " + resultadoresta);
        System.out.println("La multiplacion de " + n1 + " por " + n2 + " es: " + resultadomultiplicacion);
        System.out.println("La división de " + n1 + " entre " + n2 + " es: " + resultadodivision);
        System.out.println("El resultado de elevar " + n1 + " al cuadrado es: " + resultadopotencia);
        System.out.println("La raiz cuadrada de " + n1 + " es: " + resultadoraiz);
    }
}

