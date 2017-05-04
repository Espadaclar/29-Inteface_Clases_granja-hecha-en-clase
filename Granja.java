public class Granja 
{
  public void alimentar(Animal animal)
    {
        if(animal.getPuntosDeVida()>0){
            animal.comer();
        }
    }
  
  public void vacunar(Vacunable animalAVacunar)
  {
    		animalAVacunar.vacunar();
  }
  
    public void hacerEmitirSonidoCaracterístico(Animal animalParaEscucharSonido)
    {
        animalParaEscucharSonido.emitirSonidoCaracteristico();
    }
}