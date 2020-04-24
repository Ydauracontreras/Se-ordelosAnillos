package app.personajes;

import app.ILLevaReliquia;
import app.armas.Arma;
import app.reliquias.Reliquia;

public class Humano extends Personaje implements ILLevaReliquia {
    //Atributo
    protected Reliquia reliquia;

//Constructores
    public Humano(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, stamina, stamina);
        this.reliquia = reliquia;
    }
    public Humano(String nombre, int salud, int stamina) {
        super(nombre, stamina, stamina);
    }

    public Humano() {
        super();
    }

    //Metodos que hereda
    @Override
    public Reliquia getReliquia() {
        return reliquia;
    }

    @Override
    public void setReliquia(Reliquia reliquia) {
        this.reliquia = reliquia;

    }
    @Override
    public void atacar(Personaje personajeAtacado, Arma arma){

        int danio = (int)(arma.getDanio()+ (arma.getDanio()* this.reliquia.getFactorDeAtaque()) - (arma.getDanio()*reliquia.getFactorDeDefensa()))  ;
        
        personajeAtacado.setSalud(personajeAtacado.salud - danio);
        this.setStamina(this.getStamina()- arma.getStamina());
    }



}
