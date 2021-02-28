
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import static java.util.Collections.list;

public class PasajeroDAO {
    public void insertarPasajero(Pasajero pa)
    {
        ConexionMongo cox = new ConexionMongo();
        BasicDBObject documentoPasajero = new BasicDBObject();
        documentoPasajero.put("Nombre","'" + pa.getNombre() + "'");
        documentoPasajero.put("Apelido","'" + pa.getApellido() + "'");
        documentoPasajero.put("Dirección","'" + pa.getDireccion() + "'");
        documentoPasajero.put("Celular","'" + pa.getCelular() + "'");
        documentoPasajero.put("Dirección","'" + pa.getDireccion() + "'");
        documentoPasajero.put("Correo","'" + pa.getCorreo() + "'");
        documentoPasajero.put("Correo","'" + pa.getCorreo() + "'");
        documentoPasajero.put("Correo","'" + pa.getCorreo() + "'");
        documentoPasajero.put("Código Pasajero","'" + pa.getCodigoPasajero() + "'");
        documentoPasajero.put("Equipaje","'" + pa.getEquipajes() + "'");
        documentoPasajero.put("Asiento","'" + pa.getTipoAsiento() + "'");
        cox.coleccion.insert(documentoPasajero);
    }
    
    public ArrayList obtenerPasajeros()
    {
        ArrayList listaPasajeros = new ArrayList<>();
        return listaPasajeros;
        
    }
    
}
