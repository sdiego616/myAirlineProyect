
package modelo;

public class Avion {
    private String codigoAvion;
    private double pesoMax;
    private int pasajerosMax;
    private double velocidad;
    private boolean disponible;

    public Avion(String codigoAvion, double pesoMax, int pasajerosMax, double velocidad, boolean disponible) {
        this.codigoAvion = codigoAvion;
        this.pesoMax = pesoMax;
        this.pasajerosMax = pasajerosMax;
        this.velocidad = velocidad;
        this.disponible = disponible;
    }
  
}
