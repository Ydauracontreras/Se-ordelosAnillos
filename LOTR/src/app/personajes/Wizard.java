package app.personajes;

import app.IHaceMAgia;
import app.armas.Arma;

public class Wizard extends Humano implements IHaceMAgia {

    private int energiaMagica;

    public Wizard(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        // TODO Auto-generated method stub

    }

}