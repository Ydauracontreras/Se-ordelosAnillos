package app.personajes;

import app.IEsMagico;
import app.IHaceMAgia;
import app.ILLevaReliquia;
import app.armas.Arma;


public class Wizard extends Humano implements IHaceMAgia {


    private int energiaMagica;

    //Constructor 
    public Wizard(String nombre, int salud, int stamina,  int energiaMagica
    ) {
        super();
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
        this.energiaMagica = energiaMagica;
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
        if(this.stamina > 0 && this.stamina < 10) 
                 if( this.energiaMagica > 5 ){
            return true;
        }
        return false;
       
    }
 //Metodo para ejecutar el ataque epico si el metodo puedoEjecutarAtaqueEpico() da como resultado true
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