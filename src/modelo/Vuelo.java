package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.ArrayList;

public class Vuelo {
    private String codigoVuelo;
    private LocalDate fechaVuelo;
    private LocalTime horaAbordaje;
    private Avion avion;
    private Piloto piloto;
    private String destino;
    private double precio;
    private ArrayList<Equipaje> equipajes;
    private String estado;

    public Vuelo(String codigoVuelo, LocalDate fechaVuelo, LocalTime horaAbordaje, Avion avion, Piloto piloto, String destino, double precio, ArrayList<Equipaje> equipajes, String estado) {
        this.codigoVuelo = codigoVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaAbordaje = horaAbordaje;
        this.avion = avion;
        this.piloto = piloto;
        this.destino = destino;
        this.precio = precio;
        this.equipajes = equipajes;
        this.estado = estado;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }

    public LocalTime getHoraAbordaje() {
        return horaAbordaje;
    }

    public Avion getAvion() {
        return avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Equipaje> getEquipajes() {
        return equipajes;
    }

    public String getEstado() {
        return estado;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public void setFechaVuelo(LocalDate fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public void setHoraAbordaje(LocalTime horaAbordaje) {
        this.horaAbordaje = horaAbordaje;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEquipajes(ArrayList<Equipaje> equipajes) {
        this.equipajes = equipajes;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
   
