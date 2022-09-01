package condicionales;

class Ifs_Else{
    public static void main (String [] args){
        int puntuacion = 3;
        char grupo ='C';
        if (puntuacion >= 5) {
            System.out.println("Enhorabuena has aprobado");
            System.out.println("Tu nota final es: " + puntuacion);
            grupo = 'A';
        }
        else{
            System.out.println("Lo siento has suspendido");
            System.out.println("Tu nota final es: " + puntuacion);
            grupo = 'B';
        }
        // Else hará que la variable cambie de valor si NO se cumple la condicion como vemos.
            System.out.println("Formas parte del grupo: " + grupo);
    }
}