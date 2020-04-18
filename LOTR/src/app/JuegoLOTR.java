package app;

import java.util.ArrayList;
import java.util.List;

import app.armas.Anduril;
import app.armas.ArcoYFlecha;
import app.armas.Arma;
import app.armas.Baculo;
import app.armas.Espada;
import app.armas.HachaDoble;
import app.armas.Sting;
import app.personajes.Personaje;

public class JuegoLOTR {

    public List<Arma> armas = new ArrayList<Arma>();
    public List<Personaje> personajes = new ArrayList<Personaje>();

    public void agregarArma() {

        Baculo baculo = new Baculo("Baculo", 20, 20);
        armas.add(baculo);

        Espada espada = new Espada("Espada", 10, 10);
        armas.add(espada);

        Anduril anduril = new Anduril("Anduril", 20, 20);
        armas.add(anduril);

        Sting sting = new Sting("Sting", 15, 10);
        armas.add(sting);

        ArcoYFlecha arcoYFlecha = new ArcoYFlecha("Arco y flecha", 5, 10);
        armas.add(arcoYFlecha);

        HachaDoble hachaDoble = new HachaDoble("Hacha doble", 10, 10);
        armas.add(hachaDoble);

    }

    public void inicializarJuego() {

    }

    public Personaje elegirPersonaje(String nombre) {
        for (Personaje personaje : personajes) {
            if (personaje.getNombre().equals(nombre)) {
                return personaje;
            }
        }
        return null;
    }

    public Arma elegirArma(String nombre) {

        for (Arma arma : armas) {
            if (arma.getNombre().equals(nombre)) {
                return arma;
            }
        }
        return null;

    }

}