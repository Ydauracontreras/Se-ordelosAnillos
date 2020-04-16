package app.reliquias;

import app.IEsMagico;

public class FrascoGaladriel extends Reliquia implements IEsMagico{

    public FrascoGaladriel(String nombre, double factorDeAtaque, double factorDeDefensa) {
        super(nombre, factorDeAtaque, factorDeDefensa);
       
    }

    @Override
    public int getEnergiaMagica() {
        
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
      

    }

}