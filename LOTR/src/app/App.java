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

          if (opcion == 1) {
               System.out.println(
                         ANSI_WHITE + "******* SELECCIONA EL PERSONAJE DEL PRIMER JUGADOR *******" + ANSI_RESET);
               mijuegoJava.listarPesonajesDisponibles();
               Personaje personaje1 = new Personaje();
               String nombre = Teclado.nextLine();
               personaje1.setNombre(nombre);
               personaje1 = mijuegoJava.elegirPersonaje(nombre);
               personaje1.setNombre(nombre);

               System.out.println(ANSI_WHITE + "******* INDICA LA CANTIDAD DE ARMAS A ESCOGER  *******" + ANSI_RESET);
               int cantidad = Teclado.nextInt();
               Teclado.nextLine();
               List<Arma> armasEscogidas = new ArrayList<>();
               System.out.println(ANSI_WHITE + "******* SELECCIONA LAS ARMAS DEL PRIMER JUGADOR *******" + ANSI_RESET);
               mijuegoJava.listarArmasDisponibles();
               for (int i = 1; i <= cantidad; i++) {
                    Arma arma1 = new Arma();
                    String nombreArma = Teclado.nextLine();
                    arma1 = mijuegoJava.elegirArma(nombreArma);
                    armasEscogidas.add(arma1);
               }
               personaje1.setArmas(armasEscogidas);
               mijuegoJava.setArmasEscogidas(armasEscogidas);

               if (personaje1 instanceof ILLevaReliquia) {

                    System.out.println(ANSI_WHITE + "**** SELECCIONA UNA RELIQUIA PARA LA BATALLA  ****" + ANSI_RESET);
                    mijuegoJava.listarReliquiasDisponibles();
                    Reliquia reliquia = new Reliquia();
                    String reliquiaJugador1 = Teclado.nextLine();

                    reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);

                    ((ILLevaReliquia) personaje1).setReliquia(reliquia);

               }

               // Jugador 2

               System.out.println(
                         ANSI_WHITE + "******** SELECCIONA EL NOMBRE DEL SEGUNDO JUGADOR ********" + ANSI_RESET);
               mijuegoJava.listarPesonajesDisponibles();

               Personaje personaje2 = new Personaje();

               String nombreDos = Teclado.nextLine();

               personaje2 = mijuegoJava.elegirPersonaje(nombreDos);
               personaje2.setNombre(nombreDos);

               System.out.println(ANSI_WHITE + "******* INDICA LA CANTIDAD DE ARMAS A ESCOGER  *******" + ANSI_RESET);
               int cantidad2 = Teclado.nextInt();
               Teclado.nextLine();
               List<Arma> armasEscogidasDos = new ArrayList<>();
               System.out.println(ANSI_WHITE + "******* SELECCIONA LAS ARMAS DEL SEGUNDO JUGADOR *******" + ANSI_RESET);
               mijuegoJava.listarArmasDisponibles();
               for (int i = 1; i <= cantidad2; i++) {
                    Arma arma2 = new Arma();
                    String nombreArmaDos = Teclado.nextLine();
                    arma2 = mijuegoJava.elegirArma(nombreArmaDos);
                    armasEscogidasDos.add(arma2);
               }
               personaje2.setArmas(armasEscogidasDos);
               mijuegoJava.setArmasEscogidasDos(armasEscogidasDos);

               if (personaje2 instanceof ILLevaReliquia) {

                    System.out.println(ANSI_WHITE + "**** SELECCIONA UNA RELIQUIA PARA LA BATALLA  ****" + ANSI_RESET);
                    mijuegoJava.listarReliquiasDisponibles();
                    Reliquia reliquiaDos = new Reliquia();
                    String reliquiaJugador2 = Teclado.nextLine();
                    reliquiaDos = mijuegoJava.elegirReliquia(reliquiaJugador2);
                    ((ILLevaReliquia) personaje2).setReliquia(reliquiaDos);

               }
               System.out.println(
                         ANSI_PURPLE + "********             INICIA LA BATALLA             ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "********             "+ ANSI_RESET + ANSI_BLUE + personaje1.getNombre()+ ANSI_RESET + " " + " vs" + " "
               + ANSI_GREEN  + personaje2.getNombre()+ ANSI_RESET + "           ********" + ANSI_RESET);
               mijuegoJava.iniciarBatalla(personaje1, personaje2);

          }
          if (opcion == 2) {
               System.out.println(
                    ANSI_WHITE + "******* SELECCIONA EL PERSONAJE DEL PRIMER JUGADOR *******" + ANSI_RESET);
          mijuegoJava.listarPesonajesDisponibles();
          Personaje personaje1 = new Personaje();
          String nombre = Teclado.nextLine();
          personaje1.setNombre(nombre);
          personaje1 = mijuegoJava.elegirPersonaje(nombre);
          personaje1.setNombre(nombre);

          System.out.println(ANSI_WHITE + "******* INDICA LA CANTIDAD DE ARMAS A ESCOGER  *******" + ANSI_RESET);
          int cantidad = Teclado.nextInt();
          Teclado.nextLine();
          List<Arma> armasEscogidas = new ArrayList<>();
          System.out.println(ANSI_WHITE + "******* SELECCIONA LAS ARMAS DEL PRIMER JUGADOR *******" + ANSI_RESET);
          mijuegoJava.listarArmasDisponibles();
          for (int i = 1; i <= cantidad; i++) {
               Arma arma1 = new Arma();
               String nombreArma = Teclado.nextLine();
               arma1 = mijuegoJava.elegirArma(nombreArma);
               armasEscogidas.add(arma1);
          }
          personaje1.setArmas(armasEscogidas);
          mijuegoJava.setArmasEscogidas(armasEscogidas);

          if (personaje1 instanceof ILLevaReliquia) {

               System.out.println(ANSI_WHITE + "**** SELECCIONA UNA RELIQUIA PARA LA BATALLA  ****" + ANSI_RESET);
               mijuegoJava.listarReliquiasDisponibles();
               Reliquia reliquia = new Reliquia();
               String reliquiaJugador1 = Teclado.nextLine();

               reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);

               ((ILLevaReliquia) personaje1).setReliquia(reliquia);
               }

               //Personaje Aleatorio

               Personaje personajeAleatorio = new Personaje();
               personajeAleatorio = mijuegoJava.getRandoNombre();
               List<Arma> armasEscogidasRandom = new ArrayList<>();
               for (int i = 1; i <= 4; i++) {
                    Arma armaAleatoria = new Arma();
                    armaAleatoria = mijuegoJava.getRandoArmas();
                    armasEscogidasRandom.add(armaAleatoria);
               }
               personajeAleatorio.setArmas(armasEscogidasRandom);
               mijuegoJava.setArmasEscogidasDos(armasEscogidasRandom);

               if (personajeAleatorio instanceof ILLevaReliquia) {
                    Reliquia reliquiaAleatorias = new Reliquia();
                    reliquiaAleatorias = mijuegoJava.getRandoReliquia();
                   ((ILLevaReliquia)personajeAleatorio).setReliquia(reliquiaAleatorias);

                    

               }

               System.out.println(
                         ANSI_PURPLE + "********             INICIA LA BATALLA             ********" + ANSI_RESET);
               System.out.println(ANSI_WHITE + "********             "+ ANSI_RESET + ANSI_BLUE + personaje1.getNombre()+ ANSI_RESET + " " + " vs" + " "
               + ANSI_GREEN  + personajeAleatorio.getNombre()+ ANSI_RESET + "           ********" + ANSI_RESET);
               System.out.println("Tu Contrincante es: " +ANSI_GREEN+ personajeAleatorio.getNombre() + "-PC"+ANSI_RESET);
               mijuegoJava.iniciarBatalla(personaje1, personajeAleatorio);

          }

     }

}
