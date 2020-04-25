package app.personajes;

import app.IEsMagico;
import app.IHaceMAgia;
import app.ILLevaReliquia;
import app.armas.Arma;
import app.reliquias.Reliquia;

public class Elfo extends Criatura implements IHaceMAgia , ILLevaReliquia {
    private int energiaMagica;
    private Reliquia reliquia;
    
    public Elfo(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, stamina, stamina);
        this.reliquia = reliquia;
    }

    public Elfo(String nombre, int salud, int stamina, int energiaMagica) {
        super(nombre, salud, stamina);
        this.energiaMagica = energiaMagica;
    }
    
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

    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        if (this.stamina > 0 && this.stamina < 10)
            if (this.energiaMagica > 5) {
            return true;
        }
        return false;
    
    }

    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
            personaje.setSalud(personaje.getSalud()-30);
            personaje.setStamina(0);
            this.setEnergiaMagica(0);
    }

    @Override
    public void atacar(Personaje personajeAtacado, Arma arma){

        if (personajeAtacado instanceof ILLevaReliquia) {
            int danio = (int)(arma.getDanio()+ (arma.getDanio()* this.reliquia.getFactorDeAtaque()) - (arma.getDanio()*reliquia.getFactorDeDefensa()))  ;
        
        personajeAtacado.setSalud(personajeAtacado.getSalud() - danio);
        this.setStamina(this.getStamina()- arma.getStamina());
        if (this.getReliquia() instanceof IEsMagico) {
            this.setEnergiaMagica(this.getEnergiaMagica() - ((IEsMagico)reliquia).getEnergiaMagica());
        }
        } else{
            int danio = (int)(arma.getDanio()+ (arma.getDanio()*this.reliquia.getFactorDeAtaque()))  ;
        
            personajeAtacado.setSalud(personajeAtacado.getSalud() - danio);
            this.setStamina(this.getStamina()- arma.getStamina());
            if (this.getReliquia() instanceof IEsMagico) {
                this.setEnergiaMagica(this.getEnergiaMagica() - ((IEsMagico)reliquia).getEnergiaMagica());
            }

   

    
    }
}
}