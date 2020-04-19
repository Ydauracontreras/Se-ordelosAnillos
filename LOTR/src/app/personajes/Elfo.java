package app.personajes;

import app.IHaceMAgia;
import app.ILLevaReliquia;
import app.armas.Arma;
import app.reliquias.Reliquia;

public class Elfo extends Criatura implements IHaceMAgia , ILLevaReliquia {
    public int energiaMagica;
    public Reliquia reliquia;
    
    public Elfo(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, stamina, stamina);
        this.reliquia = reliquia;
    }
    public Elfo(String nombre, int salud, int stamina) {
        super(nombre, stamina, stamina);
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

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
     
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
      

    }

}