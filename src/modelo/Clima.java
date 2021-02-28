
package modelo;

import java.time.LocalDate;

public class Clima {
    private double temperatura;
    private double velocidadViento;
    private double precipitacion;

    private LocalDate fecha;

    public Clima(double temperatura, double velocidadViento, double precipitacion, LocalDate fecha) {
        this.temperatura = temperatura;
        this.velocidadViento = velocidadViento;
        this.precipitacion = precipitacion;
        this.fecha = fecha;
    }

    
    
}
