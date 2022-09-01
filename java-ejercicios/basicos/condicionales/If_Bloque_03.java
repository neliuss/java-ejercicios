package condicionales;

class If_Bloque_03{
    public static void main (String [] args){
        int puntuacion = 3;
        char grupo ='C';
        if (puntuacion >= 5) {
            System.out.println("Enhorabuena has aprobado");
            System.out.println("Tu nota final es: " + puntuacion);
            grupo = 'A';
        }
        // Primero le decimos que haga 3 cosas si se cumple la condicion, pero si no se cumple se quedará como estaba antes, o sea C si no se cumple.
        // Es decir si se cumple la condicion la variable grupo cambia de valor.
            System.out.println("Formas parte del grupo: " + grupo);
    }
}