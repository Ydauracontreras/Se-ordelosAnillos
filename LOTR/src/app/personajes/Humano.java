package app.personajes;

import app.ILLevaReliquia;
import app.reliquias.Reliquia;

public class Humano extends Personaje implements ILLevaReliquia {
    public Reliquia reliquia;

    public Humano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
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

