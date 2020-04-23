package app.personajes;

import app.ILLevaReliquia;
import app.armas.Arma;

public class Enano extends Criatura {

    public Enano(String nombre, int salud, int stamina) {
        super(nombre, salud, stamina);
    }

    public void atacar(Personaje personajeAtacado, Arma arma){

        int danio = (int)(arma.getDanio()- arma.getDanio()* (((ILLevaReliquia)personajeAtacado).getReliquia().getFactorDeDefensa()));
        
        personajeAtacado.setSalud(personajeAtacado.salud - danio);
        this.setStamina(this.getStamina()- arma.getStamina());

}
    

}