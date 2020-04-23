package app.personajes;

import app.ILLevaReliquia;
import app.armas.Arma;

public class Troll extends Criatura {

    public Troll(String nombre, int salud, int stamina ) {
        super(nombre, salud, stamina);
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }

    public void atacar(Personaje personajeAtacado, Arma arma){

        int danio = (int)(arma.getDanio()- arma.getDanio()*(((ILLevaReliquia)personajeAtacado).getReliquia().getFactorDeDefensa()));
        
        personajeAtacado.setSalud(personajeAtacado.salud - danio);
        this.setStamina(this.getStamina()- arma.getStamina());

}
}