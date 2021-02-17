
package modelo;

import java.util.ArrayList;

public class Pasajero extends Persona {
    private String codigoPasajero;
    //private Vuelo viaje;
    private ArrayList<Equipaje> equipajes;
    private String tipoAsiento;

    public Pasajero(String codigoPasajero, ArrayList<Equipaje> equipajes, String tipoAsiento, String nombre, String apellido, String celular, String direccion, String correo) {
        super(nombre, apellido, celular, direccion, correo);
        this.codigoPasajero = codigoPasajero;
        this.equipajes = equipajes;
        this.tipoAsiento = tipoAsiento;
    }

    

    public String getCodigoPasajero() {
        return codigoPasajero;
    }

    public void setCodigoPasajero(String codigoPasajero) {
        this.codigoPasajero = codigoPasajero;
    }

    public ArrayList<Equipaje> getEquipajes() {
        return equipajes;
    }

    public void setEquipajes(ArrayList<Equipaje> equipajes) {
        this.equipajes = equipajes;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "codigoPasajero=" + codigoPasajero + ", equipajes=" + equipajes + ", tipoAsiento=" + tipoAsiento + '}';
    }
    
}
