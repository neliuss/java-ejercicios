/*Crea un programa executable que realice o seguinte:
– Cree un array de Electrodomésticos de 10 posicións.
– Asigna a cada posición un obxecto das clases anteriores cos valores que se desexe.
– Recorrer o array e executar o método prezoFinal().
– Mostrar o prezo de cada clase, é dicir, o prezo de todas as televisións por un lado, o das lavadoras por outro e a suma dos Electrodomésticos 
(tamén se poden crear obxectos Electrodomésticos, pero recorda que Televisión e Lavadora tamén son Electrodomésticos). Recorda usar o operador instanceof.
Por ex, se temos un Electrodom cun prezo final de 300, unha lavadora de 200 e unha tv de 500, o resultado final será de 1000(300+200+500) para Electrodom,200 para Lavadora, e 500 para Tv.
Modifica la tarea 4 creando un enumerado que contenga las letra del consumo energético y el precio. Adaptar todas las clases necesarias para que utilicen este enumerado*/
package gestionElectrodomestico;

import java.util.ArrayList;
import java.util.Scanner;

public class mainElectro {
 static Scanner teclado = new Scanner (System.in); 
 
    public static void main(String[] args) {
        ArrayList <Electrodomestico> electroarray=new ArrayList <Electrodomestico>();
        
        Electrodomestico elec1=new Electrodomestico(50,"verde",'A',40.55);
        Electrodomestico elec2=new Electrodomestico(100,"azul",'B',80);
        Electrodomestico elec3=new Electrodomestico(60,"amarillo",'Z',20);
        electroarray.add(elec1);electroarray.add(elec2);electroarray.add(elec3);
        
        Lavadora lav1=new Lavadora(300,160.50);
        Lavadora lav2=new Lavadora(500,250);
        Lavadora lav3=new Lavadora(50);
        electroarray.add(lav1); electroarray.add(lav2);electroarray.add(lav3);
        
        Television tv1=new Television (1280, true);
        Television tv2=new Television (100, 50);
        Television tv3=new Television (720, true);
        Television tv4=new Television (360, false);
        
        electroarray.add(tv1); electroarray.add(tv2); electroarray.add(tv3); electroarray.add(tv4);
        
        elec1.prezoFinal();elec2.prezoFinal(); elec3.prezoFinal(); 
        lav1.prezoFinal();lav2.prezoFinal();lav3.prezoFinal();
        tv1.prezoFinal();tv2.prezoFinal();tv3.prezoFinal(); tv4.prezoFinal();
     
        recorrer(electroarray);
        
        verPrecio(electroarray);
        
 
    }

    public static void recorrer( ArrayList <Electrodomestico> array){        
//        for (int i=0; i<array.size(); i++){
//            System.out.println("El precio es "+array.get(i).getPrezo()+". Color:"+array.get(i).getCor()+". Su consumo: "+array.get(i).getCons()+". Peso:"+array.get(i).getPeso()); 
//        }
//        System.out.println("Con foreach:");
        for (Electrodomestico e: array){
            System.out.println(e.toString());
        }
//    for (int i=0;i<array.length;i++){
//           System.out.println("Valor "+(i+1)+" : "+array[i]);
//       } 
    }
    
    public static void verPrecio(ArrayList<Electrodomestico> electroarray){
        double prezoTotal=0;
         int op;
       do{ 
        System.out.println("Dime el precio total de los productos a visualizar: \n 1:lavadoras.\n 2:Tv. \n 3:Electrodomésticos. \n 4.:Total. \n 5.Salir");
        op=teclado.nextInt();
        switch(op){
            case 1:
                for(int i=0;i<electroarray.size();i++){
                    if(electroarray.get(i) instanceof Lavadora==true){
                        System.out.println(electroarray.get(i).getPrezo());
                        prezoTotal=prezoTotal+electroarray.get(i).getPrezo();
                    }                                    
                }
                System.out.println("El precio de las lavadoras: "+prezoTotal);
                break;
            case 2:
                for(int i=0;i<electroarray.size();i++){
                    if(electroarray.get(i) instanceof Television==true){
                        System.out.println(electroarray.get(i).getPrezo());
                        prezoTotal=prezoTotal+electroarray.get(i).getPrezo();
                    }                                    
                }
                System.out.println("El precio de los televisores: "+prezoTotal);
                break;
            case 3:
                for(int i=0;i<electroarray.size();i++){
                    if(electroarray.get(i)instanceof Electrodomestico==true && ((electroarray.get(i) instanceof Television==false) && (electroarray.get(i) instanceof Lavadora==false))){
                        System.out.println(electroarray.get(i).getPrezo());
                        prezoTotal=prezoTotal+electroarray.get(i).getPrezo();
                    }                                    
                }
                System.out.println("El precio de los electrodomésticos: "+prezoTotal);
                break;
            case 4:
                for(int i=0;i<electroarray.size();i++){
                    System.out.println(electroarray.get(i).getPrezo());
                    prezoTotal=prezoTotal+electroarray.get(i).getPrezo();
                }
                System.out.println("El precio total de todos los productos en stock: "+prezoTotal);
                break;
            
        }
    }while (op!=5);
    }
        
    
}


