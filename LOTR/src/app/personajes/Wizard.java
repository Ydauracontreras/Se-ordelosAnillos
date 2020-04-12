package app.personajes;

public class Wizard extends  Humano {
 
    public int energiaMagica;

    public Wizard(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

}