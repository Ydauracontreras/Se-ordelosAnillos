package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import app.reliquias.Reliquia;
import app.armas.Anduril;
import app.armas.ArcoYFlecha;
import app.armas.Arma;
import app.armas.Baculo;
import app.armas.Espada;
import app.armas.HachaDoble;
import app.armas.Sting;
import app.personajes.Elfo;
import app.personajes.Enano;
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
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    

    //Elegir la reliquia de la lista
    public Reliquia elegirReliquia(String nombre) {
        for (Reliquia reliquia : reliquias) {
            if(reliquia.getNombre().equalsIgnoreCase(nombre))
            
             return reliquia;
             
        }
        
        return null;
    
    }

    public void inicializarJuego(){
            // Listado de Reliquias
        FrascoGaladriel frascoGaladriel = new FrascoGaladriel("Frasco Galadriel", 0.1, 0.5);
        ChalecoMithril chalecoMithril = new ChalecoMithril("Chaleco Mithril", 0.20, 0.80);
        AnilloVilya anilloVilya = new AnilloVilya("Anillo Vilya", 0.10, 0.20);
        AnilloSauron anilloSauron = new AnilloSauron("Anillo Sauron", 0.20, 0.20);
        AnilloPoder anilloPoder = new AnilloPoder("Anillo Poder", 0.10, 0.20);
        AnilloNenya anilloNenya = new AnilloNenya("Anillo Nenya", 0.20, 0.10);
        AnilloNarya anilloNarya = new AnilloNarya("Anillo Narya", 0.10, 0.20);
        AnilloElfo anilloElfo = new AnilloElfo("Anillo Elfo", 0.20, 0.10);
        frascoGaladriel.setEnergiaMagica(20);
        anilloPoder.setEnergiaMagica(15);
        reliquias.add(frascoGaladriel);
        reliquias.add(chalecoMithril);
        reliquias.add(anilloVilya);
        reliquias.add(anilloSauron);
        reliquias.add(anilloPoder);
        reliquias.add(anilloNenya);
        reliquias.add(anilloNarya);
        reliquias.add(anilloElfo);

        //Nombre,Salud,Stamina
        Humano humanoUno = new Humano("Aragorn", 100, 100);
        Humano humanoDos = new Humano("Eowyn", 100, 100);
        Hobbit hobbitUno = new Hobbit("Frodo", 100, 100);
        Hobbit hobbitDos = new Hobbit("Samsagaz", 100, 100);
        Goblin goblinUno = new Goblin("goblin", 100, 100);
        Goblin goblinDos = new Goblin("goblinDos", 100, 100);
        Orco orcoUno = new Orco("Ugluk", 100,100);
        Orco orcoDos = new Orco("Snaga", 100,100);
        Troll trollUno = new Troll("troll", 100,100);
        Troll trollDos = new Troll("trollDos", 100,100);
        Enano enanoUno =new Enano("EnanoUno", 100,100);
        Enano enanoDos = new Enano("EnanoDos", 100, 100);

        //Nombre,Salud,Stamina, Energia MAgica
        Wizard wizardUno = new Wizard("Gandalf", 100, 100, 100);
        Wizard wizardDos = new Wizard("Saruman", 100, 100, 100);
        Elfo elfoUno = new Elfo("Legolas",100,100,100);
        Elfo elfoDos = new Elfo("Arwen",100,100,100);




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
        personajes.add(orcoDos);
        personajes.add(trollUno);
        personajes.add(trollDos);
        personajes.add(enanoUno);
        personajes.add(enanoDos);

        //Nombre, Danio, Stamina
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

    public Personaje getRandoNombre() {
        Random aleatorio = new Random();
        Personaje personaje = personajes.get(aleatorio.nextInt(personajes.size()));
        return personaje;

    }

    public Arma getRandoArmas() {
        Random aleatorio = new Random();
        Arma arma = armas.get(aleatorio.nextInt(armas.size()));
        return arma;

    }

     public Reliquia getRandoReliquia() {
        Random aleatorio = new Random();
        Reliquia reliquia = reliquias.get(aleatorio.nextInt(reliquias.size()));
        return reliquia;

    }

    public Arma getRandomArmaParaBatalla(List<Arma> armas) {
        Random aleatorio = new Random();
        Arma arma = armas.get(aleatorio.nextInt(armas.size()));
        return arma;

    }
    
    public void listarPesonajesDisponibles() {

        System.out.println(ANSI_WHITE + "******** SELECCIONA EL NOMBRE DEL PRIMER JUGADOR ********" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "*********************************************************" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "********                 HUMANOS                 ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "                         Aragorn\n                         Éowyn");
        System.out.println(ANSI_CYAN + "********                 HOBBIT                  ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "                         Frodo \n                         Samsagaz");
        System.out.println(ANSI_CYAN + "********                 WIZARD                  ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "                         Gandalf\n                         Saruman");
        System.out.println(ANSI_CYAN + "********                 ELFO                    ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "                         Legolas\n                         Arwen");
        System.out.println(ANSI_CYAN + "********                 ORCO                    ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "                         OrcoUno\n                         OrcoDos");
        System.out.println(ANSI_CYAN + "********                 TROLL                   ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "                         TrollUno\n                         TrollDos");
        System.out.println(ANSI_CYAN + "********                 GOBBLIN                 ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "                         GobblinUno\n                         GobblinDos");
        System.out.println(ANSI_CYAN + "*********************************************************" + ANSI_RESET);
    }

    public void listarArmasDisponibles() {
        System.out.println(ANSI_WHITE + "******* SELECCIONA LAS ARMAS DEL PRIMER JUGADOR *******" + ANSI_RESET);
        System.out.println(ANSI_RED + "*******************************************************" + ANSI_RESET);
        System.out.println(ANSI_RED + "********                 Baculo                ********" + ANSI_RESET);
        System.out.println(ANSI_RED + "********               Arco y Flecha           ********" + ANSI_RESET);
        System.out.println(ANSI_RED + "********                Hacha Doble            ********" + ANSI_RESET);
        System.out.println(ANSI_RED + "********                 Espada                ********" + ANSI_RESET);
        System.out.println(ANSI_RED + "********                 Anduril               ********" + ANSI_RESET);
        System.out.println(ANSI_RED + "********                 String                ********" + ANSI_RESET);
        System.out.println(ANSI_RED + "*******************************************************" + ANSI_RESET);

    }

    public void listarReliquiasDisponibles() {
        System.out.println(ANSI_WHITE + "**** SELECCIONA UNA RELIQUIA PARA LA BATALLA  ****" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "**************************************************" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********           Frasco Galadriel       ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********             Anillo Elfo          ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********             Anillo Narya         ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********             Anillo Nenya         ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********             Anillo Poder         ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********             Anillo Sauron        ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********             Anillo Vilya         ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "********            Chaleco Mithril       ********" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "**************************************************" + ANSI_RESET);

    }

    public void listarFormasdeJuego(){
        System.out.println(ANSI_PURPLE + "*******        BIENVENIDOS A LA TIERRA MEDIA       *******" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "*******        SELECCIONA EL MODO DE JUEGO         *******" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "**********************************************************" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "********         1. \\o/ Player vs  \\o/ Player     ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "********           2. \\o/ Player vs PC            ********" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "**********************************************************" + ANSI_RESET);

    }
          

   


    }

    
    
        
