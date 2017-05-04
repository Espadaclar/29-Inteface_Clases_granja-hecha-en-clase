public class Pollo extends Ave implements Vacunable
{ 
  private static final int PESO_INICIAL = 1;
  private static final int PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION = 10;
  private static final String SONIDO = "Pio, pio";

  public Pollo()
  {
  	super(PESO_INICIAL, SONIDO);
  }
  
  public void vacunar() {
    variarPuntosDeVida(PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION);
  }
}