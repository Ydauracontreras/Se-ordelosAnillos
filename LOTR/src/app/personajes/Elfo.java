package app.personajes;

import app.reliquias.Reliquia;

public class Elfo extends Criatura {
    public int energiaMagica;
    public Reliquia reliquia;

    public Elfo(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);

    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

}