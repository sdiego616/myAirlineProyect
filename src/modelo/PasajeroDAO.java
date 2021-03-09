
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import static java.util.Collections.list;

public class PasajeroDAO {

    public PasajeroDAO() {
    }
    
    
    public void insertarPasajero(Pasajero pa)
    {
        ConexionPasajeros cox = new ConexionPasajeros();
        BasicDBObject documentoPasajero = new BasicDBObject();
        documentoPasajero.put("nombre", pa.getNombre()  );
        documentoPasajero.put("apellido",  pa.getApellido() );
        documentoPasajero.put("celular", pa.getCelular());
        documentoPasajero.put("dirección", pa.getDireccion());
        documentoPasajero.put("correo", pa.getCorreo());
        documentoPasajero.put("codigoPasajero", pa.getCodigoPasajero() );
        documentoPasajero.put("equipajes","'" +pa.getEquipajes()+"'");
        //documentoPasajero.put("tipoAsiento","'" + pa.getTipoAsiento() + "'");
        //documentoPasajero.put("vuelo","'" + pa.getVuelo() + "'");
        cox.coleccion.insert(documentoPasajero);
    }
    
    public ArrayList obtenerPasajeros()
    {
        ArrayList <Pasajero> listaPasajeros = new ArrayList<Pasajero>();
        ConexionPasajeros con = new ConexionPasajeros();
        Pasajero ps;
        DBCursor cursor = con.coleccion.find();
        while (cursor.hasNext())
        {
            ps = new Pasajero ((String) cursor.next().get("nombre"), (String) cursor.curr().get("apellido"), (String) cursor.curr().get("celular"),
            (String) cursor.curr().get("direccion"),(String) cursor.curr().get("correo"));
            ps.setCodigoPasajero((String) cursor.curr().get("codigoPasajero"));
            listaPasajeros.add(ps);
        }
        return listaPasajeros;
        
    }
    
}
