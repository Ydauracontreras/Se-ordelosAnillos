package app.personajes;

import app.IHaceMAgia;
import app.armas.Arma;


public class Wizard extends Humano implements IHaceMAgia {


    public int energiaMagica;

    //Constructor 
    public Wizard(String nombre, int salud, int stamina) {
        super();
    }

    public Wizard() {
        super();
    }
//Getter
    public int getEnergiaMagica() {
        return energiaMagica;
    }
//Setter
    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

   //Este metodo nos dice si puede o no hacer un ataque epico
    @Override
    public boolean puedoEjecutarAtaqueEpico() {
        if(this.stamina < 10 && this.energiaMagica >= 5){
            return true;

        }
        return false;
       
    }
 //Metodo para ejecutar el ataque epico si el metodo puedoEjecutarAtaqueEpico() da como resultado true
    @Override
    public void ataqueEpico(Personaje personaje, Arma arma) {
        
        if (puedoEjecutarAtaqueEpico() == true) {
            personaje.salud = personaje.salud -50 ;
            
        }

    }

}