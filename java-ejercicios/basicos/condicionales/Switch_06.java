package condicionales;

class Switch_06{
    public static void main (String [] args){
        char grupo = 'C';
        switch (grupo) {
        /* Primero creamos una variable char, el condicional switch comprueba la variable entre ()
        Despues de que lo comprueba tiene que ver lo que tiene que comprobar, ahi entran los case.*/
            case 'A' :
            System.out.println("Formas parte del Grupo A, enhorabuena");
            break;
            /* Case es lo que comprueba, si coincide la variable con el case pues entrará por eso, 
            y break es para decirle que deje de ejecutar el bloque switch.
            O sea que el braak le dice deja de analizar A para que no se quede atrapado.
            Los valores que se usan en un case pueden ser tanto caracteres como enteros.*/
            case 'B' :
            System.out.println("Estas dentro del grupo de aprobados");                    
            break;
            
            case 'C' :
            System.out.println("Estas dentro del grupo de los suspendidos");
            break;
            
            default:
            System.out.println("Formas parte del Grupo D");
            /* Esta linea es que cuando los case no coincidan con la variable pues que entre por aqui. 
            Es como decir ejecutar esto si es distitno a todos los case.*/
        }
    }
}