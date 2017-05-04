public class Vaca extends Mamifero implements Vacunable
{
  private static final int PESO_INICIAL = 25;
  private static final String SONIDO = "Muuuu, muuuuu";  
  private static final int PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION = 30;    
  
  public Vaca()
  {
  	super(PESO_INICIAL, SONIDO);
  }
  
  public void vacunar() {
    variarPuntosDeVida(PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION);
  }  
}