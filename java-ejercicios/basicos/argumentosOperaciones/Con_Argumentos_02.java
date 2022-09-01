package argumentosOperaciones;

class Con_Argumentos_02{
/* Para meter los argumentos hay que ir a "Run\ser project configuration\customize\Arguments".
Le decimos a que main class se le añade y le escribimos los argumentos separados por espacio blanco.*/
    public static void main (String [] args){
        System.out.println("Los lenguajes de programación que prefiero son: "
            + "El primero: " + args[0] + " El segundo: "
            + args[1]
            + " Y por último el tercero es: "
            + args[2]
            );
    }
}