package app;

import app.armas.Arma;
import app.personajes.Personaje;

public interface IHaceMAgia {

    int getEnergiaMagica(); 
    void setEnergiaMagica(int energiaMagica);
    boolean puedoEjecutarAtaqueEpico();
    void ataqueEpico(Personaje personaje, Arma arma);
    

}