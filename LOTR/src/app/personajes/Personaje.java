package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.armas.Arma;

public abstract class Personaje {

    //Atributos de la Clase personajes
    public String nombre;
    public int salud;
    public int stamina;
    public List<Arma> armas = new ArrayList<Arma>();


//Constructor con parametros= todos los atributos
    public Personaje(String nombre, int salud, int stamina ) {
        super();
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }

    public Personaje() {
        super();
    }
    
	//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

  
    public int getStamina() {
        return stamina;
    }

 
    public List<Arma> getArmas() {
        return armas;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
    this.salud = salud;
    }

  
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

  
    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    /** Metodo para saber si el personaje esta vivo o no
     * 
     * @return true si el personaje tiene salud, es decir si esta vivo
     */
    

    
    
     public boolean estaVivo(){
        if (this.salud>0) {
            return true;
            
        }
        return false;

    }

    /**Este metodo nos devolvera al personaje que fue atacado con la salud que le restamos
     *  No puedo armar el metodo hasta tener armas listo
     * @param personaje
     * @param arma
     */
    public void atacar(Personaje personaje, Arma arma){


    }

}