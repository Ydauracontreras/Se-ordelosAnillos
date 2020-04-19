package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.armas.Arma;
import app.personajes.Personaje;
import app.personajes.Wizard;
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

        System.out.println("Selecciona el modo de juego:");
        System.out.println(ANSI_CYAN + "*********************  1. Player vs Player *********************" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "********************* 2. Player vs PC *********************" + ANSI_RESET);

        int opcion = 0;
        opcion = Teclado.nextInt();
        Teclado.nextLine();

        if (opcion == 1) {
             
          System.out.println("Ingresa el nombre e alguno de los siguientes personajes:");
        System.out.println(ANSI_BLUE + "********************* Humanos *********************" + ANSI_RESET);
        
        System.out.println("Aragon");

        System.out.println(ANSI_BLUE + "********************* Hobbit *********************" + ANSI_RESET);
        System.out.println("Frodo");

        System.out.println(ANSI_BLUE + "********************* Wizard *********************" + ANSI_RESET);
        
        System.out.println("Gandalf");

        System.out.println(ANSI_BLUE + "********************* Elfo *********************" + ANSI_RESET);
        System.out.println("Elfo:");
        System.out.println("Legolas");

        System.out.println(ANSI_BLUE + "********************* Orco *********************" + ANSI_RESET);
        System.out.println("Orco:");
        System.out.println("");

        System.out.println(ANSI_BLUE + "********************* Troll *********************" + ANSI_RESET);
        System.out.println("Troll:");
        System.out.println("");

        System.out.println(ANSI_BLUE + "********************* Gobblin *********************" + ANSI_RESET);
     
        System.out.println("");
        System.out.println(ANSI_BLUE + "******************************************" + ANSI_RESET);

        Personaje personaje1 = new Personaje();

        String nombre = Teclado.nextLine();

        personaje1 = mijuegoJava.elegirPersonaje(nombre);

        System.out.println(personaje1.getNombre());
      


        System.out.println("Ingrese las armas para su personaje");
     System.out.println(ANSI_RED+ "**********************"+ ANSI_RESET);
     System.out.println("Baculo");
     System.out.println("Arco y Flecha");
     System.out.println("Hacha Doble");
     System.out.println("Espada");
     System.out.println("Anduril");
     System.out.println("Sting");
     System.out.println(ANSI_RED+ "**********************" +ANSI_RESET);

     
          List<Arma> armasEscogidas = new ArrayList<>();
          for (int i = 0; i <= 5; i++) {
               Arma arma1 = new Arma();
               String nombreArma = Teclado.nextLine();
               arma1 = mijuegoJava.elegirArma(nombreArma);
               armasEscogidas.add(arma1);
     
          }
      


     if (personaje1 instanceof ILLevaReliquia) {
          

  System.out.println(ANSI_WHITE + "***********  SELECCIONA UNA RELIQUIA PARA LA BATALLA  *************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************  Frasco Galadriel ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Elfo     ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Narya    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Nenya    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Poder    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Sauron   ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Vilya    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************  Chaleco Mithril *************************" + ANSI_RESET);

  Reliquia reliquia = new Reliquia();
  String reliquiaJugador1 = Teclado.nextLine();

  reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);
  System.out.println(reliquia.getNombre());
   
     }
     System.out.println(ANSI_BLUE + "***********  SELECCIONA El SEGUNDO JUGADOR  *************" + ANSI_RESET);
     System.out.println(ANSI_BLUE + "********************* Humanos *********************" + ANSI_RESET);
        
        System.out.println("Aragon");

        System.out.println(ANSI_BLUE + "********************* Hobbit *********************" + ANSI_RESET);
        System.out.println("Frodo");

        System.out.println(ANSI_BLUE + "********************* Wizard *********************" + ANSI_RESET);
        
        System.out.println("Gandalf");

        System.out.println(ANSI_BLUE + "********************* Elfo *********************" + ANSI_RESET);
        System.out.println("Elfo:");
        System.out.println("Legolas");

        System.out.println(ANSI_BLUE + "********************* Orco *********************" + ANSI_RESET);
        System.out.println("Orco:");
        System.out.println("");

        System.out.println(ANSI_BLUE + "********************* Troll *********************" + ANSI_RESET);
        System.out.println("Troll:");
        System.out.println("");

        System.out.println(ANSI_BLUE + "********************* Gobblin *********************" + ANSI_RESET);
     
        System.out.println("");
        System.out.println(ANSI_BLUE + "******************************************" + ANSI_RESET);

        Personaje personaje2 = new Personaje();

        String nombreDos = Teclado.nextLine();

        personaje1 = mijuegoJava.elegirPersonaje(nombreDos);

        System.out.println(personaje2.getNombre());
      


        System.out.println("Ingrese las armas para su personaje");
     System.out.println(ANSI_RED+ "**********************"+ ANSI_RESET);
     System.out.println("Baculo");
     System.out.println("Arco y Flecha");
     System.out.println("Hacha Doble");
     System.out.println("Espada");
     System.out.println("Anduril");
     System.out.println("Sting");
     System.out.println(ANSI_RED+ "**********************" +ANSI_RESET);

     
          List<Arma> armasEscogidasDos = new ArrayList<>();
          for (int i = 0; i <= 5; i++) {
               Arma arma2 = new Arma();
               String nombreArmaDos = Teclado.nextLine();
               arma2 = mijuegoJava.elegirArma(nombreArmaDos);
               armasEscogidasDos.add(arma2);
     
          }
      


     if (personaje2 instanceof ILLevaReliquia) {
          

  System.out.println(ANSI_WHITE + "***********  SELECCIONA UNA RELIQUIA PARA LA BATALLA  *************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************  Frasco Galadriel ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Elfo     ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Narya    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Nenya    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Poder    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Sauron   ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************   Anillo Vilya    ************************" + ANSI_RESET);
  System.out.println(ANSI_YELLOW + "************************  Chaleco Mithril *************************" + ANSI_RESET);

  Reliquia reliquiaDos = new Reliquia();
  String reliquiaJugador2 = Teclado.nextLine();

  reliquiaDos = mijuegoJava.elegirReliquia(reliquiaJugador2);
  System.out.println(reliquiaDos.getNombre());
   
     }

  }  else {

     System.out.println("Ingresa el nombre e alguno de los siguientes personajes:");
     System.out.println(ANSI_BLUE + "********************* Humanos *********************" + ANSI_RESET);
     
     System.out.println("Aragon");

     System.out.println(ANSI_BLUE + "********************* Hobbit *********************" + ANSI_RESET);
     System.out.println("Frodo");

     System.out.println(ANSI_BLUE + "********************* Wizard *********************" + ANSI_RESET);
     
     System.out.println("Gandalf");

     System.out.println(ANSI_BLUE + "********************* Elfo *********************" + ANSI_RESET);
     System.out.println("Elfo:");
     System.out.println("Legolas");

     System.out.println(ANSI_BLUE + "********************* Orco *********************" + ANSI_RESET);
     System.out.println("Orco:");
     System.out.println("");

     System.out.println(ANSI_BLUE + "********************* Troll *********************" + ANSI_RESET);
     System.out.println("Troll:");
     System.out.println("");

     System.out.println(ANSI_BLUE + "********************* Gobblin *********************" + ANSI_RESET);
  
     System.out.println("");
     System.out.println(ANSI_BLUE + "******************************************" + ANSI_RESET);

     Personaje personaje1 = new Personaje();

     String nombre = Teclado.nextLine();

     personaje1 = mijuegoJava.elegirPersonaje(nombre);

     System.out.println(personaje1.getNombre());
   


     System.out.println("Ingrese las armas para su personaje");
  System.out.println(ANSI_RED+ "**********************"+ ANSI_RESET);
  System.out.println("Baculo");
  System.out.println("Arco y Flecha");
  System.out.println("Hacha Doble");
  System.out.println("Espada");
  System.out.println("Anduril");
  System.out.println("Sting");
  System.out.println(ANSI_RED+ "**********************" +ANSI_RESET);

  
       List<Arma> armasEscogidas = new ArrayList<>();
       for (int i = 0; i <= 5; i++) {
            Arma arma1 = new Arma();
            String nombreArma = Teclado.nextLine();
            arma1 = mijuegoJava.elegirArma(nombreArma);
            armasEscogidas.add(arma1);
  
       }
   


  if (personaje1 instanceof ILLevaReliquia) {
       

System.out.println(ANSI_WHITE + "***********  SELECCIONA UNA RELIQUIA PARA LA BATALLA  *************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************  Frasco Galadriel ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Elfo     ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Narya    ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Nenya    ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Poder    ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Sauron   ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************   Anillo Vilya    ************************" + ANSI_RESET);
System.out.println(ANSI_YELLOW + "************************  Chaleco Mithril *************************" + ANSI_RESET);

Reliquia reliquia = new Reliquia();
String reliquiaJugador1 = Teclado.nextLine();

reliquia = mijuegoJava.elegirReliquia(reliquiaJugador1);
System.out.println(reliquia.getNombre());

  }
             
        }

        
}
}




    


