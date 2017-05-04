public abstract class Animal
{
    private int peso;
    private int puntosDeVida;
    private String sonidoCaracteristico;
    public static final int PUNTOS_VIDA_INICIALES=100;
    public static final int PUNTOS_VIDA_PERDIDOS_POR_COMER=10;

    /**
     * Constructor para objetos de la clase Animal
     * @param peso Peso inicial del animal.
     * @param sonido Sonido caracteristico del animal.
     */
    public Animal(int peso, String sonido)
    {
        this.sonidoCaracteristico = sonido;
        this.peso = peso;
        puntosDeVida = PUNTOS_VIDA_INICIALES;
    }

    public void comer()
    {
        puntosDeVida = puntosDeVida - PUNTOS_VIDA_PERDIDOS_POR_COMER;
    }

    public void emitirSonidoCaracteristico()
    {
        System.out.println(sonidoCaracteristico);
    }

    public int getPeso(){
        return peso;    
    }

    public int getPuntosDeVida(){
        return puntosDeVida;
    }

    protected void variarPeso(int variacionPeso)
    {
        peso += variacionPeso;
    }
    
    protected void variarPuntosDeVida(int variacionPuntosVida)
    {
       puntosDeVida += variacionPuntosVida;
    }    
}