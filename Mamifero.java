public abstract class Mamifero extends Animal
{
    private static final int GANANCIA_PESO_POR_COMER = 2;

    public Mamifero(int peso, String sonido){
        super(peso ,sonido);
    }

    public void comer()
    {
        variarPeso(GANANCIA_PESO_POR_COMER);
    }
}