package bucles;

class SalirLoop {
    public static void main (String atgs []) {

        int index2 = 0;
        while (index2 <= 1000) {
            index2 = index2 + 5;
            if (index2 == 400)
                continue;
                System.out.println("El index es " + index2);
                /* El continue es una condicion que le damos cada vez que hace una iteracion, 
                en este caso nos imprimirá el mensaje index es y su valor cada vez.
                Si buscamos lo que mostró en el 400, veremos que no mostró nada porque el 
                continue se salta esa iteracion definida en el if.*/
            }
        }
    }
