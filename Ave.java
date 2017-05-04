public abstract class Ave extends Animal
{
    private static final int GANANCIA_PESO_POR_COMER = 1;

    public Ave(int peso, String sonido)
    {
        super(peso,sonido);
    }

    public void comer()
    {
        variarPeso(GANANCIA_PESO_POR_COMER);
    }  
}