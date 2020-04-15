package app.personajes;

import app.IHaceMAgia;
import app.ILLevaReliquia;
import app.armas.Arma;
import app.reliquias.Reliquia;

public class Elfo extends Criatura implements IHaceMAgia , ILLevaReliquia {

    //Atributos del Elfo
    public int energiaMagica = 100;
    public Reliquia reliquia;

    //Constructor completo

    public Elfo(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);

    }
//Getters y Setters
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

    //Metodo que nos dice si puede o no hacer un ataque epico
    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        if (this.stamina< 10 && this.energiaMagica > 20) {
            return true;
            
        }
        return false;
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        if (puedoEjecutarAtaqueEpico() == true) {

            personaje.salud = personaje.salud - 40;
            
        }

    }

}