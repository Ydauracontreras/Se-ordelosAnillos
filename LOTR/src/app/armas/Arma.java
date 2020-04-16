package app.armas;

/**
 * Esta es la clase Arma base.
 */
public class Arma {
    private String nombre;
    private int danio;
    private int stamina;


  public String getNombre() {


      return nombre;
  }

  public int getDanio() {
      return danio;
  }

  public int getStamina() {
      return stamina;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }
 
  public void setDanio(int danio) {
      this.danio = danio;
  }

  public void setStamina(int stamina) {
      this.stamina = stamina;
  }

  

}