package app.personajes;

import app.ILLevaReliquia;
import app.armas.Arma;
import app.reliquias.Reliquia;

public class Humano extends Personaje implements ILLevaReliquia {
    //Atributo
    protected Reliquia reliquia;

//Constructores
    public Humano(String nombre, int salud, int stamina, Reliquia reliquia) {
        super(nombre, salud, stamina);
        this.reliquia = reliquia;
    }
    public Humano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
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
    if (personajeAtacado instanceof ILLevaReliquia) {
            int danio = (int)(arma.getDanio()+ (arma.getDanio()* this.reliquia.getFactorDeAtaque()) - (arma.getDanio()*reliquia.getFactorDeDefensa()))  ;
        
            personajeAtacado.setSalud(personajeAtacado.getSalud() - danio);
            this.setStamina(this.getStamina()- arma.getStamina());
        } else{
            int danio = (int)(arma.getDanio()+ (arma.getDanio()* this.reliquia.getFactorDeAtaque()) )  ;
        
            personajeAtacado.setSalud(personajeAtacado.getSalud()- danio);
            this.setStamina(this.getStamina()- arma.getStamina());
        }
    }


}
