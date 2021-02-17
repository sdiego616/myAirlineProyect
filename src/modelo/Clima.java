
package modelo;

import java.time.LocalDate;

public class Clima {
    private String fenomenoAtmosferico;
    private double temperatura;
    private double humedad;
    private double precipitacion;
    private double tormentaElectrica;
    private LocalDate fecha;

    public Clima(String fenomenoAtmosferico, double temperatura, double humedad, double precipitacion, double tormentaElectrica, LocalDate fecha) {
        this.fenomenoAtmosferico = fenomenoAtmosferico;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.precipitacion = precipitacion;
        this.tormentaElectrica = tormentaElectrica;
        this.fecha = fecha;
    }
    
}
