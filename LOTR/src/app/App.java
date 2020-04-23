package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.armas.Arma;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class App {

     // COLORES PARA MOSTRAR
     public static final String ANSI_BLACK = "\u001B[30m";
     public static final String ANSI_RED = "\u001B[31m";
     public static final String ANSI_GREEN = "\u001B[32m";
     public static final String ANSI_YELLOW = "\u001B[33m";
     public static final String ANSI_BLUE = "\u001B[34m";
     public static final String ANSI_PURPLE = "\u001B[35m";
     public static final String ANSI_CYAN = "\u001B[36m";
     public static final String ANSI_WHITE = "\u001B[37m";
     public static final String ANSI_RESET = "\u001B[0m";

     // vARIABLE QUE RECIBE DATOS DEL TECLADO
     public static Scanner Teclado = new Scanner(System.in);

     public static void main(String[] args) throws Exception {

          // OBJETO JUEGO
          JuegoLOTR mijuegoJava = new JuegoLOTR();

          // INICIALIZAR EL JUEGO
          mijuegoJava.inicializarJuego();

          // Metodo que imprime en pantalla el saludo del juego y las opciones de
          // jugadores
          mijuegoJava.saludoInicial();

          int opcion = 0;
          opcion = Teclado.nextInt();
          Teclado.nextLine();
          // Si escoge Jugador vs Jugador
          if (opcion == 1) {

               // Jugador 1
               System.out.println(
                         ANSI_WHITE + "******** SELECCIONA EL NOMBRE DEL PRIMER JUGADOR ********" + ANSI_RESET);
               mijuegoJava.listarPesonajesDisponibles();

               Personaje personaje1 = new Personaje();

               String nombre = Teclado.nextLine();
               personaje1.setNombre(nombre);

               personaje1 = mijuegoJava.elegirPersonaje(nombre);

               System.out.println(personaje1.getNombre());
               personaje1.setNombre(nombre);

               System.out.println(ANSI_WHITE + "******* SELECCIONA LAS ARMAS DEL JUGADOR *******" + ANSI_RESET);
               mijuegoJava.listarArmasDisponibles();

               List<Arma> armasEscogidas = new ArrayList<>();
               for (int i = 0; i <= 2; i++) {
                    Arma arma1 = new Arma();
                    String nombreArma = Teclado.nextLine();
                    arma1 = mijuegoJava.elegirArma(nombreArma);
                    armasEscogidas.add(arma1);

               }

               personaje1.setArmas(armasEscogidas);

               if (personaje1 instanceof ILLevaReliquia) {

                    System.out.println(ANSI_WHITE + "**** SELECCIONA UNA RELIQUIA PARA LA BATALLA  ****" + ANSI_RESET);
                    mijuegoJava.listarReliquiasDisponibles();

                    Reliquia reliquia = new Reliquia();
                    String reliquiaJugador1 = Teclado.nextLine();

                    reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);
                    System.out.println(reliquia.getNombre());
                    ((ILLevaReliquia) personaje1).setReliquia(reliquia);

               }

               // Jugador 2

               System.out.println(
                         ANSI_WHITE + "******** SELECCIONA EL NOMBRE DEL SEGUNDO JUGADOR ********" + ANSI_RESET);
               mijuegoJava.listarPesonajesDisponibles();

               Personaje personaje2 = new Personaje();

               String nombreDos = Teclado.nextLine();

               personaje2 = mijuegoJava.elegirPersonaje(nombreDos);

               System.out.println(personaje2.getNombre());
               personaje2.setNombre(nombreDos);

               System.out.println(ANSI_WHITE + "******* SELECCIONA LAS ARMAS DEL SEGUNDO JUGADOR *******" + ANSI_RESET);
               mijuegoJava.listarArmasDisponibles();

               List<Arma> armasEscogidasDos = new ArrayList<>();
               for (int i = 0; i <= 2; i++) {
                    Arma arma2 = new Arma();
                    String nombreArmaDos = Teclado.nextLine();
                    arma2 = mijuegoJava.elegirArma(nombreArmaDos);
                    armasEscogidasDos.add(arma2);

               }
               personaje2.setArmas(armasEscogidasDos);

               if (personaje2 instanceof ILLevaReliquia) {

                    System.out.println(ANSI_WHITE + "**** SELECCIONA UNA RELIQUIA PARA LA BATALLA  ****" + ANSI_RESET);
                    mijuegoJava.listarReliquiasDisponibles();

                    Reliquia reliquiaDos = new Reliquia();
                    String reliquiaJugador2 = Teclado.nextLine();

                    reliquiaDos = mijuegoJava.elegirReliquia(reliquiaJugador2);
                    System.out.println(reliquiaDos.getNombre());
                    ((ILLevaReliquia) personaje2).setReliquia(reliquiaDos);

               }
               while (personaje1.estaVivo() && personaje2.estaVivo()) {

                    personaje1.atacar(personaje2, mijuegoJava.getRandomArmaParaBatalla(armasEscogidas));
                    if (personaje2.estaVivo()) {

                         System.out.println("El jugador dos tiene : " + personaje2.getSalud() + " de salud");

                         personaje2.atacar(personaje1, mijuegoJava.getRandomArmaParaBatalla(armasEscogidasDos));

                    } else {
                         System.out.println(personaje2.getNombre() + "  ha fallecido");
                    }
                    if (personaje1.estaVivo()) {
                         System.out.println("El jugador uno tiene : " + personaje1.getSalud() + " de salud");

                    } else {
                         System.out.println(personaje1.getNombre() + "  ha fallecido");
                    }

                    if (personaje1 instanceof IHaceMAgia) {
                         ((IHaceMAgia) personaje1).ataqueEpico(personaje2,
                                   mijuegoJava.getRandomArmaParaBatalla(armasEscogidas));
                         System.out.println("El personaje: " + personaje1.getNombre() + "ejecuta el ataque epico");

                    }
                    if (personaje2 instanceof IHaceMAgia) {
                         ((IHaceMAgia) personaje2).ataqueEpico(personaje1,
                                   mijuegoJava.getRandomArmaParaBatalla(armasEscogidasDos));
                         System.out.println("El personaje: " + personaje2.getNombre() + "ejecuta el ataque epico");

                    }

               }

          }
          // Si escoge Jugador vs PC
          if (opcion == 2) {
               // Jugador 1
               System.out.println(
                         ANSI_WHITE + "******** SELECCIONA EL NOMBRE DEL PRIMER JUGADOR ********" + ANSI_RESET);
               System.out.println(ANSI_CYAN + "*********************************************************" + ANSI_RESET);
               System.out.println(ANSI_CYAN + "********                 HUMANOS                 ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "                         Aragorn\n                         Eowyn");
               System.out.println(ANSI_CYAN + "********                 HOBBIT                  ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "                         Frodo \n                         Samsagaz");
               System.out.println(ANSI_CYAN + "********                 WIZARD                  ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "                         Gandalf\n                         Saruman");
               System.out.println(ANSI_CYAN + "********                 ELFO                    ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "                         Legolas\n                         Arwen");
               System.out.println(ANSI_CYAN + "********                 ORCO                    ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "                         Ugluk\n                         Snaga");
               System.out.println(ANSI_CYAN + "********                 TROLL                   ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "                         TrollUno\n                         TrollDos");
               System.out.println(ANSI_CYAN + "********                 GOBBLIN                 ********" + ANSI_RESET);
               System.out.println(
                         ANSI_WHITE + "                         GobblinUno\n                         GobblinDos");
               System.out.println(ANSI_CYAN + "*********************************************************" + ANSI_RESET);

               Personaje personaje1 = new Personaje();

               String nombre = Teclado.nextLine();

               personaje1 = mijuegoJava.elegirPersonaje(nombre);

               System.out.println(personaje1.getNombre());

               System.out.println(ANSI_WHITE + "******* SELECCIONA LAS ARMAS DEL PRIMER JUGADOR *******" + ANSI_RESET);
               System.out.println(ANSI_RED + "*******************************************************" + ANSI_RESET);
               System.out.println(ANSI_RED + "********                 Baculo                ********" + ANSI_RESET);
               System.out.println(ANSI_RED + "********               Arco y Flecha           ********" + ANSI_RESET);
               System.out.println(ANSI_RED + "********                Hacha Doble            ********" + ANSI_RESET);
               System.out.println(ANSI_RED + "********                 Espada                ********" + ANSI_RESET);
               System.out.println(ANSI_RED + "********                 Anduril               ********" + ANSI_RESET);
               System.out.println(ANSI_RED + "********                 String                ********" + ANSI_RESET);
               System.out.println(ANSI_RED + "*******************************************************" + ANSI_RESET);

               List<Arma> armasEscogidas = new ArrayList<>();
               for (int i = 0; i <= 2; i++) {
                    Arma arma1 = new Arma();
                    String nombreArma = Teclado.nextLine();
                    arma1 = mijuegoJava.elegirArma(nombreArma);
                    armasEscogidas.add(arma1);

               }

               if (personaje1 instanceof ILLevaReliquia) {

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

                    Reliquia reliquia = new Reliquia();
                    String reliquiaJugador1 = Teclado.nextLine();

                    reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);
                    System.out.println(reliquia.getNombre());

               }
               // Jugador Aleatorio de la PC
               
               Personaje personajeAleatorio = new Personaje();
               personajeAleatorio = mijuegoJava.getRandoNombre();
               System.out.println("COMPUTADORA" + " " + personajeAleatorio.getNombre());

               Arma armasAleatorias = new Arma();
               armasAleatorias = mijuegoJava.getRandoArmas();
               System.out.println("COMPUTADORA" + " " + armasAleatorias.getNombre());

               if (personajeAleatorio instanceof ILLevaReliquia) {

                    Reliquia reliquiaAleatorias = new Reliquia();
                    reliquiaAleatorias = mijuegoJava.getRandoReliquia();
                    System.out.println("COMPUTADORA" + " " + reliquiaAleatorias.getNombre());
               }

          }

     }

}
