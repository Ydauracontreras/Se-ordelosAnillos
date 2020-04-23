package app.reliquias;

import app.IEsMagico;

public class FrascoGaladriel extends Reliquia implements IEsMagico{
    int miEnergiaMagica;
    

	public FrascoGaladriel(String nombre, double factorDeAtaque, double factorDeDefensa) {
        super(nombre, factorDeAtaque, factorDeDefensa);
    }


    @Override
    public int getEnergiaMagica() {
        return miEnergiaMagica;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
        energiaMagica = miEnergiaMagica;

    }

}