package app;

import java.util.ArrayList;
import java.util.List;
import app.reliquias.Reliquia;
import app.reliquias.AnilloElfo;
import app.reliquias.AnilloNarya;
import app.reliquias.AnilloNenya;
import app.reliquias.AnilloPoder;
import app.reliquias.AnilloSauron;
import app.reliquias.AnilloVilya;
import app.reliquias.ChalecoMithril;
import app.reliquias.FrascoGaladriel;

public class JuegoLOTR {
    public static List<Reliquia> reliquias = new ArrayList<Reliquia>();

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

    }

    public void elegirPersonaje() {

    }

    public void elegirArma(){
        

    }    

    }

    
    
        
