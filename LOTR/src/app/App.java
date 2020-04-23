package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.armas.Arma;
import app.personajes.Personaje;
import app.reliquias.Reliquia;

public class App {

     public static final String ANSI_BLACK = "\u001B[30m";
     public static final String ANSI_RED = "\u001B[31m";
     public static final String ANSI_GREEN = "\u001B[32m";
     public static final String ANSI_YELLOW = "\u001B[33m";
     public static final String ANSI_BLUE = "\u001B[34m";
     public static final String ANSI_PURPLE = "\u001B[35m";
     public static final String ANSI_CYAN = "\u001B[36m";
     public static final String ANSI_WHITE = "\u001B[37m";
     public static final String ANSI_RESET = "\u001B[0m";

     public static Scanner Teclado = new Scanner(System.in);

     public static void main(String[] args) throws Exception {

          JuegoLOTR mijuegoJava = new JuegoLOTR();

          mijuegoJava.inicializarJuego();

         mijuegoJava.listarFormasdeJuego();

          int opcion = 0;
          opcion = Teclado.nextInt();
          Teclado.nextLine();

          if (opcion == 1) {
               mijuegoJava.listarPesonajesDisponibles();
               Personaje personaje1 = new Personaje();
               String nombre = Teclado.nextLine();
               personaje1.setNombre(nombre);
               personaje1 = mijuegoJava.elegirPersonaje(nombre);
               personaje1.setNombre(nombre);
             

          System.out.println(ANSI_WHITE + "******* INDICA LA CANTIDAD DE ARMAS A ESCOGER  *******" + ANSI_RESET);
               int cantidad = Teclado.nextInt();
               List<Arma> armasEscogidas = new ArrayList<>();
               mijuegoJava.listarArmasDisponibles();
               for (int i = 0; i <= cantidad ; i++) {
                    Arma arma1 = new Arma();
                    String nombreArma = Teclado.nextLine();
                    arma1 = mijuegoJava.elegirArma(nombreArma);
                    armasEscogidas.add(arma1);
               }
                    personaje1.setArmas(armasEscogidas);

               if (personaje1 instanceof ILLevaReliquia) {
               mijuegoJava.listarReliquiasDisponibles();
                    Reliquia reliquia = new Reliquia();
                    String reliquiaJugador1 = Teclado.nextLine();

                    reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);
                    System.out.println(reliquia.getNombre());
                    ((ILLevaReliquia) personaje1).setReliquia(reliquia);

               }
               mijuegoJava.listarPesonajesDisponibles();
               Personaje personaje2 = new Personaje();
               String nombreDos = Teclado.nextLine();

               personaje2 = mijuegoJava.elegirPersonaje(nombreDos);

               System.out.println(personaje2.getNombre());
               personaje2.setNombre(nombreDos);

               System.out.println(ANSI_WHITE + "******* INDICA LA CANTIDAD DE ARMAS A ESCOGER  *******" + ANSI_RESET);
               int cantidadDos = Teclado.nextInt();
               List<Arma> armasEscogidasDos = new ArrayList<>();
               mijuegoJava.listarArmasDisponibles();
               for (int i = 0; i <= cantidadDos; i++) {
                    Arma arma2 = new Arma();
                    String nombreArma = Teclado.nextLine();
                    arma2 = mijuegoJava.elegirArma(nombreArma);
                    armasEscogidas.add(arma2);
               }
               personaje1.setArmas(armasEscogidasDos);

               if (personaje2 instanceof ILLevaReliquia) {
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
          if (opcion == 2) {

               mijuegoJava.listarPesonajesDisponibles();

               Personaje personaje1 = new Personaje();
               String nombre = Teclado.nextLine();
               personaje1 = mijuegoJava.elegirPersonaje(nombre);
               System.out.println(personaje1.getNombre());
               personaje1.setNombre(nombre);

               System.out.println(ANSI_WHITE + "******* INDICA LA CANTIDAD DE ARMAS A ESCOGER  *******" + ANSI_RESET);
               int cantidad = Teclado.nextInt();
               List<Arma> armasEscogidas = new ArrayList<>();
               mijuegoJava.listarArmasDisponibles();
               for (int i = 0; i <= cantidad; i++) {
                    Arma arma1 = new Arma();
                    String nombreArma = Teclado.nextLine();
                    arma1 = mijuegoJava.elegirArma(nombreArma);
                    armasEscogidas.add(arma1);
               }
               personaje1.setArmas(armasEscogidas);

               if (personaje1 instanceof ILLevaReliquia) {

               mijuegoJava.listarReliquiasDisponibles();
                    Reliquia reliquia = new Reliquia();
                    String reliquiaJugador1 = Teclado.nextLine();
                    reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);
                    System.out.println(reliquia.getNombre());
                    ((ILLevaReliquia) personaje1).setReliquia(reliquia);

               }


               Personaje personajeAleatorio = new Personaje();
               personajeAleatorio = mijuegoJava.getRandoNombre();
               List<Arma> armasEscogidasRandom = new ArrayList<>();
               for (int i = 0; i <= 4 ; i++) {
                    Arma armaDos = new Arma();
                    String nombreArma = Teclado.nextLine();
                    armaDos = mijuegoJava.elegirArma(nombreArma);
                    armasEscogidas.add(armaDos);
               }
                    personajeAleatorio.setArmas(armasEscogidasRandom);

               if (personajeAleatorio instanceof ILLevaReliquia) {
                    Reliquia reliquiaAleatorias = new Reliquia();
                    reliquiaAleatorias = mijuegoJava.getRandoReliquia();
          
               }

          }

     }

}
