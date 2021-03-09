/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mongodb.BasicDBObject;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
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
    
    
    ZoneId gmt = ZoneId.of("GMT");
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDate localDateNow = localDateTime.toLocalDate();

    public Vuelo(int dia, int mes, int year, int hour, int min, String destino) {
        this.codigoVuelo = piloto.numeroAleatorio();
        this.fechaVuelo =  LocalDate.of(year, mes, dia);
        
        this.horaAbordaje = LocalTime.of(hour, min);
        //this.avion = avion;
        //this.piloto = piloto;
        this.destino = destino;
        //this.precio = precio;
        //this.equipajes = equipajes;
        //this.estado = estado;
    }
    
    public Vuelo(){
        this.codigoVuelo = String.valueOf(localDateNow.atStartOfDay(gmt).toEpochSecond());
    }
    
    public BasicDBObject toDBVuelo()
    {
        BasicDBObject dbVuelo = new BasicDBObject();
        
        dbVuelo.append("codigoVuelo", this.getCodigoVuelo());
        dbVuelo.append("destino", this.getDestino());
        dbVuelo.append("fechaVuelo", this.getFechaVuelo());
        dbVuelo.append("horaAbordaje", this.getHoraAbordaje());
        
        return dbVuelo;
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

    @Override
    public String toString() {
        return "Vuelo{" + "codigoVuelo=" + codigoVuelo + ", fechaVuelo=" + fechaVuelo + ", horaAbordaje=" + horaAbordaje + ", destino=" + destino + ", localDateNow=" + localDateNow + '}';
    }

    
}
