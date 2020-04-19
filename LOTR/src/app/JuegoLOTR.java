package app;

import java.util.ArrayList;
import java.util.List;
import app.reliquias.Reliquia;
import app.armas.Anduril;
import app.armas.ArcoYFlecha;
import app.armas.Arma;
import app.armas.Baculo;
import app.armas.Espada;
import app.armas.HachaDoble;
import app.armas.Sting;
import app.personajes.Elfo;
import app.personajes.Goblin;
import app.personajes.Hobbit;
import app.personajes.Humano;
import app.personajes.Orco;
import app.personajes.Personaje;
import app.personajes.Troll;
import app.personajes.Wizard;
import app.reliquias.AnilloElfo;
import app.reliquias.AnilloNarya;
import app.reliquias.AnilloNenya;
import app.reliquias.AnilloPoder;
import app.reliquias.AnilloSauron;
import app.reliquias.AnilloVilya;
import app.reliquias.ChalecoMithril;
import app.reliquias.FrascoGaladriel;

public class JuegoLOTR {
    public List<Reliquia> reliquias = new ArrayList<Reliquia>();
    public List<Personaje> personajes = new ArrayList<>();
    public List<Arma> armas = new ArrayList<>();
    

    //Elegir la reliquia de la lista
    public Reliquia elegirReliquia(String nombre) {
        for (Reliquia reliquia : reliquias) {
            if(reliquia.getNombre().equals(nombre))
             return reliquia;
        }
        return null;
    }

    public void inicializarJuego(){
            // Listado de Reliquias
        FrascoGaladriel frascoGaladriel = new FrascoGaladriel("Frasco Galadriel", 10, 10);
        ChalecoMithril chalecoMithril = new ChalecoMithril("Chaleco Mithril", 20, 80);
        AnilloVilya anilloVilya = new AnilloVilya("Anillo Vilya", 10, 20);
        AnilloSauron anilloSauron = new AnilloSauron("AnilloSauron", 20, 20);
        AnilloPoder anilloPoder = new AnilloPoder("Anillo Poder", 10, 20);
        AnilloNenya anilloNenya = new AnilloNenya("AnilloNenya", 20, 10);
        AnilloNarya anilloNarya = new AnilloNarya("AnilloNarya", 10, 20);
        AnilloElfo anilloElfo = new AnilloElfo("AnilloElfo", 20, 10);
        reliquias.add(frascoGaladriel);
        reliquias.add(chalecoMithril);
        reliquias.add(anilloVilya);
        reliquias.add(anilloSauron);
        reliquias.add(anilloPoder);
        reliquias.add(anilloNenya);
        reliquias.add(anilloNarya);
        reliquias.add(anilloElfo);

        Humano humanoUno = new Humano("Aragon", 100, 100);
        Humano humanoDos = new Humano("Aragon", 100, 100);
        Hobbit hobbitUno = new Hobbit("Frodo", 100, 100);
        Hobbit hobbitDos = new Hobbit("Frodo", 100, 100);
        Elfo elfoUno = new Elfo("",100,100);
        Elfo elfoDos = new Elfo("",100,100);
        Goblin goblinUno = new Goblin("nombre", 100, 100);
        Goblin goblinDos = new Goblin("nombre", 100, 100);
        Orco orcoUno = new Orco("x1", 100,100);
        Orco orcoDos = new Orco("x2", 100,100);
        Troll trollUno = new Troll("x3", 100,100);
        Troll trollDos = new Troll("x4", 100,100);
        Wizard wizardUno = new Wizard("x5", 100, 100, 100);
        Wizard wizardDos = new Wizard("x6", 100, 100, 100);




        personajes.add(humanoUno);
        personajes.add(humanoDos);
        personajes.add(hobbitUno);
        personajes.add(hobbitDos);
        personajes.add(elfoUno);
        personajes.add(elfoDos);
        personajes.add(goblinUno);
        personajes.add(goblinDos);
        personajes.add(wizardUno);
        personajes.add(wizardDos);
        personajes.add(orcoUno);

        personajes.add(trollUno);

        Baculo baculo = new Baculo("Baculo", 20, 20);
        Espada espada = new Espada("Espada", 10, 10);     
        Anduril anduril = new Anduril("Anduril", 20, 20);
        Sting sting = new Sting("Sting", 15, 10);
        ArcoYFlecha arcoYFlecha = new ArcoYFlecha("Arco y flecha", 5, 10);
        HachaDoble hachaDoble = new HachaDoble("Hacha doble", 10, 10);
        armas.add(baculo);
        armas.add(espada);
        armas.add(anduril);
        armas.add(sting);
        armas.add(arcoYFlecha);
        armas.add(hachaDoble);




    }

    public Personaje elegirPersonaje(String nombre) {
        for (Personaje personaje : personajes) {
            if (personaje.getNombre().equalsIgnoreCase(nombre)) {
                return personaje;
            }
        }
        return null;
    }

    public Arma elegirArma(String nombre){
        for (Arma arma : armas) {
            if (arma.getNombre().equalsIgnoreCase(nombre)) {
                return arma;
                
            }
            
        }
        return null;

    }    



   


    }

    
    
        
