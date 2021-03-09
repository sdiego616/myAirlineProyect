
package modelo;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class Pasajero extends Persona {
    private String codigoPasajero;
    private Vuelo vuelo;
    private ArrayList<Equipaje> equipajes;
    private String tipoAsiento;
    
    ZoneId gmt = ZoneId.of("GMT");
    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDate localDateNow = localDateTime.toLocalDate();

    public Pasajero( String tipoAsiento,  Vuelo vuelo, String nombre, String apellido, String celular, String direccion, String correo) {
        super(nombre, apellido, celular, direccion, correo);
        this.codigoPasajero = super.numeroAleatorio();
        //this.equipajes = equipajes;
        this.tipoAsiento = tipoAsiento;
        this.vuelo = vuelo;
    }

    public Pasajero(String nombre, String apellido, String celular, String direccion, String correo) {
        super(nombre, apellido, celular, direccion, correo);
        this.codigoPasajero = super.numeroAleatorio();
        
    }

    public Pasajero() {
        this.codigoPasajero = super.numeroAleatorio();
    }
    
    public Pasajero (BasicDBObject pasajero)
    {
        super(pasajero.getString("nombre"),pasajero.getString("apellido"),pasajero.getString("celular"),pasajero.getString("direccion"),pasajero.getString("correo"));
        this.codigoPasajero=super.numeroAleatorio();
        
        //BasicDBList equipajes =
        //this.equipajes
    
        this.tipoAsiento = pasajero.getString("tipoAsiento");
    }
    
    public BasicDBObject toDBPasajero( )
    {
        BasicDBObject dbPasajero = new BasicDBObject();
        
        dbPasajero.append("nombre", this.getNombre());
        dbPasajero.append("apellido", this.getApellido());
        dbPasajero.append("celular", this.getCelular());
        dbPasajero.append("direccion", this.getDireccion());
        dbPasajero.append("correo", this.getCorreo());
        dbPasajero.append("codigoPasajero", this.getCodigoPasajero());
        //dbPasajero.append("tipoAsiento", this.getTipoAsiento());
        //dbPasajero.append("vuelo", this.getVuelo());
        dbPasajero.append("equipajes", this.getEquipajes());
        return dbPasajero;
    }
    
    public BasicDBObject toDBTipoAsiento( )
    {
        BasicDBObject dbPasajero = new BasicDBObject();
        dbPasajero.append("tipoAsiento", this.getTipoAsiento());

        return dbPasajero;
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

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return super.toString() + "Pasajero{" + "codigoPasajero=" + codigoPasajero + ", equipajes=" + equipajes + '}';
    }

    
    
}
