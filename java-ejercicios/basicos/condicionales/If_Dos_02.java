package condicionales;

class If_Dos_02{
    public static void main (String [] args){
        int puntuacion = 7;
        if (puntuacion == 7) {
            System.out.println("Tienes un notable");
        }

        if (puntuacion == 3) {
            System.out.println("Tienes un insuficiente");   
        }
        
            System.out.println("Nota final: " + puntuacion);
    }
    // Usar varios ifs con una misma variable, condiciones que dan distintos mensajes, podriamos decirle que haga distintas cosas dependiendo de la condicion.
}