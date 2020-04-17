package app.personajes;

import app.ILLevaReliquia;
import app.reliquias.Reliquia;

public class Humano extends Personaje implements ILLevaReliquia {
    public Reliquia reliquia;

    
    public Humano(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, stamina, stamina);
        this.reliquia = reliquia;
    }

    public Humano() {
        super();
    }

	@Override
    public Reliquia getReliquia() {
        return reliquia;
    }


    @Override
    public void setReliquia(Reliquia reliquia) {
    this.reliquia = reliquia;

    }

}