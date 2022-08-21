/*Exemplo no que se crea e utiliza un ArrayList, onde usaremos algún método dos que falamos na interface Collection e un iterador, así como métodos
propios da interface List.
Os nodos da lista van a ser obxectos de tipo Alumno, polo que primeiro creamos a clase Alumno.
Creamos no programa principal dúas listas de tipo alumno, no que inseriremos varios nodos e logo operaremos coas listas facendo uso de distintos métodos.
 */
package Collection_Iterator_nodo;

/**
 *
 * @author alex
 */
public class Alumno {

    String dni;
    String nome;
    String curso;

    int idade;
    Alumno(String dni, String nome, String curso, int idade){
        this.dni = dni;
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }
    
    @Override
    public boolean equals(Object al){
        boolean rdo = false;
        if (al instanceof Alumno) {
             rdo = (dni.equals(((Alumno) al).dni));
        }
        return rdo;
    }
}

