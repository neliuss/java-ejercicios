package condicionales;

class ifs{
    public static void main (String [] args){
        int puntuacion = 4;
        if (puntuacion > 5) {
            System.out.println("!Enhorabuena, has aprobado!");
            // Vemos que no hace nada pq 4 es menor a 5, si pusiesemos 6 entonces nos ejecutaria el println mostrando que aprobamos.
            // Vemos que al if se le pasa la condicion entre () y entre llaves lo que hará si eso es cierto.
        }else{
            System.out.println("Lo siendo has suspendido");}
        // Else dice basicamente que si la condicion no se cumple haga otra cosa, y la sintaxis igual pero como no ponemos condicion solo le metemos la parte {}
        
        int puntuacion2 = 4;
        if (puntuacion2 != 5) {
            System.out.println("!Enhorabuena, has aprobado!");
            // Podemos decirle que tipo de condicion queremos, en este caos es si el valor es distinto a 5, significa DESigual para que entendamos mejor.
            // Y como 4 es un numero distinto a 5 pues se cumple y por eso nos imprime en pantalla que has aprobado.
        }
    }
}