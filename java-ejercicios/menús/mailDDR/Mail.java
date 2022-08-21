 /*
3) Haz una clase llamada Password que siga las siguientes condiciones:

Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
Los constructores serán los siguiente:
Un constructor por defecto.
Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
Los métodos que implementa serán:
esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
generarPassword():  genera la contraseña del objeto con la longitud que tenga.
Método get para contraseña y longitud.
Método set para longitud.

Ahora, crea una clase clase ejecutable:
Crea un array de Passwords con el tamaño que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posición del array.
Indica también por teclado la longitud de los Passwords (antes de bucle).
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1
contraseña2 valor_bololeano2
…
 */
package mailDDR;

public class Mail {
    //Constantes
    private final static int LONG_DEF=8;    //longitud por defecto
  
    //Atributos
    private int longitud;       //Longitud de la contraseña

    private String contraseña;      //caracteres de la contraseña
  
    //Metodos publicos
  
    public int getLongitud() {      //Devuelve la longitud.return longitud de la contraseña
        return longitud;
    }
  
    public void setLongitud(int longitud) {     //Modifica la longitud de la contraseña.param longitud a cambiar
        this.longitud = longitud;
    }
  
    public String getContraseña() {     //Devuelve la contraseña.return contraseña
        return contraseña;
    }

    public String generaPassword (){        //Genera una contraseña al azar con la longitud que este definida.return contraseña
        String password="";
        for (int i=0;i<longitud;i++){
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }
  
    public boolean esFuerte(){      //Comprueba la fortaleza de la contraseña.return
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contraseña.length();i++){
                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
  
    //Constructores
    public Mail (){     //Crea una contraseña al azar
        this(LONG_DEF);
    }

    public Mail (int longitud){     //La contraseña sera la pasada por parametro.param longitud
        this.longitud=longitud;
        contraseña=generaPassword();
    }
}