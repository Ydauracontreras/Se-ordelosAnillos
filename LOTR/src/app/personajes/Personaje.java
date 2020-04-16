package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.armas.Arma;

public abstract class Personaje {

    private String nombre;
    private int salud;
    private int stamina;
    private List<Arma> armas = new ArrayList<Arma>();

    public Personaje(String nombre, int salud, int stamina) {
        super();
        this.nombre = nombre;
        this.salud = salud;
        this.stamina = stamina;
    }
    public boolean estaVivo(){
        return false;

    }

    public void atacar(Personaje personaje, Arma arma){

    }

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



}