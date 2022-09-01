package argumentosOperaciones;

import java. awt. *;
    public class Ejemplo_Applet_03 extends javax.swing. JApplet{
        int numero;
        
        public void init()  {
            numero = 317;
        }
        
        public void paint(Graphics screen)   {
               Graphics2D screen2D = (Graphics2D) screen;
               screen2D. drawString("La raiz cuadrada de " +
                       numero +
                       " es " +
                       Math.sqrt(numero), 5, 50);
        }
    }