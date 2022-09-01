package condicionales;

class ElseIf{
    public static void main (String [] args){
        char grupo = 'C';
        if (grupo == 'A') {
            System.out.println("Formas parte del Grupo A, enhorabuena");
        }
            
        else if (grupo == 'B') {
            System.out.println("Estas dentro del grupo de aprobados");                    
        }
        
        else if (grupo == 'C') {
            System.out.println("Estas dentro del grupo de los suspendidos");
        }
        
        else {
            System.out.println("Formas parte del Grupo D");
        }
        /* Else if, si se cumple la condicion hace una cosa pero sino entraria en el else correcto, o sea sino es el if pero es lo que pone el else se ejecuta eso.
        Hemos metido 3 condiciones que si no se cumple entraria en el Else final. */
    }
}