package app.reliquias;


public class Reliquia {
private String nombre;
private double factorDeAtaque;
private double factorDeDefensa;

public Reliquia(String nombre, double factorDeAtaque, double factorDeDefensa) {
    super();
    this.nombre = nombre;
    this.factorDeAtaque = factorDeAtaque;
    this.factorDeDefensa = factorDeDefensa;
}

public Reliquia() {
}

public String getNombre() {
    return nombre;
}

public double getFactorDeAtaque() {
    return factorDeAtaque;
}


public double getFactorDeDefensa() {
    return factorDeDefensa;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setFactorDeAtaque(double factorDeAtaque) {
    this.factorDeAtaque = factorDeAtaque;
}


public void setFactorDeDefensa(double factorDeDefensa) {
    this.factorDeDefensa = factorDeDefensa;
}

}