package bloque1;

import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        double SP, L1, L2, L3, area, areafinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce Primer lado: ");
        L1 = sc.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce Segundo lado: ");
        L2 = sc.nextDouble();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce Tercer lado: ");
        L3 = sc.nextDouble();
        SP = ((L1 + L2 + L3)/2);
        area = (SP*(SP-L1)*(SP-L2)*(SP-L3));
        areafinal = Math.sqrt(area);
        System.out.println("El area de los lados " + L1 + ", " + L2 + ", " + L3 + " y " + "es: " + areafinal);
    }    
}
