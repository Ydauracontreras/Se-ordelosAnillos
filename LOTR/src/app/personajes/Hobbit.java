package app.personajes;

import app.ILLevaReliquia;
import app.reliquias.Reliquia;

public class Hobbit extends Criatura implements ILLevaReliquia{
    private Reliquia reliquia;

    public Hobbit(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
    }

    public Reliquia getReliquia() {
        return reliquia;
    }

    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;
    }

}