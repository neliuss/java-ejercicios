/**Casting: transformar entre tipos de datos compatibles,  es decir, es automático
     */
package parsing_casting_conversiones;

public class main_conversiones_casteo {

    public static void main(String[] args) {
        
        double valorDeNumeroConDecimales= (double) 10;
        int valorDeNumeroSinDecimales= (int) 10.5;
        float otroNumeroDecimales= (float) valorDeNumeroConDecimales;
        System.out.println(valorDeNumeroConDecimales);
        System.out.println(valorDeNumeroSinDecimales);
        System.out.println(otroNumeroDecimales);
        
       // convertir de string a int
        int valorNumerico = Integer.valueOf("123456");
        System.out.println(valorNumerico);
        
        //convertir de string a double
        double valorConDecimales= Double.valueOf("123.456");
        System.out.println(valorConDecimales);
        
         //convertir de int a string
        String cadenaConNumero= String.valueOf(123);
         System.out.println(cadenaConNumero);
    }
    
}



//public class ParsingYCasting {
//    
//    public static void castings(){
//        double valorDeNumeroConDecimales= (double) 10;
//        int valorDeNumeroSinDecimales= (int) 10.5;
//        
//        float otroNumeroDecimales= (float) valorDeNumeroConDecimales;
//    }
//    
//    public static void parsings(){
//        //convertir de string a int
//        int valorNumerico = Integer.valueOf("123456");
//        //convertir de string a double
//        double valorConDecimales= Double.valueOf("123.456");
//         //convertir de int a string
//        String cadenaConNumero= String.valueOf(123);
//    }
//}
