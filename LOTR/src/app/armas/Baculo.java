package app.armas;

import app.IEsMagico;

public class Baculo extends Arma implements IEsMagico {

    

	public Baculo(String nombre, int danio, int stamina) {
        super(nombre, danio, stamina);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getEnergiaMagica() {
        
        return 0;
    }

    @Override
    public void setEnergiaMagica(int energiaMagica) {
    

    }

  

}