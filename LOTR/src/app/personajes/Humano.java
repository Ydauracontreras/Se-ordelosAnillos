package app.personajes;

import app.ILLevaReliquia;
import app.reliquias.Reliquia;

public class Humano extends Personaje implements ILLevaReliquia {

    public Humano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
    }

    @Override
    public Reliquia getReliquia() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {
        // TODO Auto-generated method stub

    }

}