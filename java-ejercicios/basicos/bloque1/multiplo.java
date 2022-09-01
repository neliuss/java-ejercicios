package bloque1;


import java.util.Scanner;

public class multiplo {

    public static void main(String[] args) {
    
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1 = sc.nextInt();
        System.out.println("Intruduzca el segundo número");
        n2 = sc.nextInt();
        if (n1%n2 == 0){
        System.out.println("La variable " + n1 + " es multiplo de " + n2);
        }else{
        System.out.println("La variable " + n1 + " no es multiplo de " + n2); 
        }
    }
}
