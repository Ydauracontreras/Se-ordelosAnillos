package app.personajes;

import app.ILLevaReliquia;
import app.armas.Arma;
import app.reliquias.Reliquia;

public class Goblin extends Criatura {

    public int energiaMagica;
    public Reliquia reliquia;

    public Goblin(String nombre, int salud, int stamina) {
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

    public void atacar(Personaje personajeAtacado, Arma arma){

        int danio = (int)(arma.getDanio()- arma.getDanio()* (((ILLevaReliquia)personajeAtacado).getReliquia().getFactorDeDefensa()));
        
        personajeAtacado.setSalud(personajeAtacado.salud - danio);
        this.setStamina(this.getStamina()- arma.getStamina());

}
}
