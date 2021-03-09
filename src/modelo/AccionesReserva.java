
package modelo;

import com.mongodb.BasicDBObject;

public interface AccionesReserva {
    public void generarBoleto();
    public void modificarReserva();
    public void seleccionarAsiento();
    public void updateVuelo(BasicDBObject pasajero, BasicDBObject vuelo);
    
}
