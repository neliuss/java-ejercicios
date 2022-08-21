package singleton;

public class SedePrincipal {

    private static SedePrincipal instance = new SedePrincipal();
    private int num_limonada = 0;
    private int num_cola = 0;

    // El constructor privado evita que se instancie esta clase fuera de la misma
    private SedePrincipal() {}

    public static SedePrincipal getInstance() {
        return instance;
    }

    public int getNumLimonada()
    {
        return this.num_limonada;
    }

    public int getNumCola()
    {
        return this.num_cola;
    }

    public void addLimonada(int num)
    {
        this.num_limonada += num;
    }

    public void addCola(int num)
    {
        this.num_cola += num;
    }
}

