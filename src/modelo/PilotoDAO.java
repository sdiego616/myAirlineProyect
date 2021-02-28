
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

public class PilotoDAO {
    public void insertarPiloto(Piloto p)
    {
        ConexionMongo con = new ConexionMongo();
        BasicDBObject documentoPiloto = new BasicDBObject();
        documentoPiloto.put("Nombre","'" + p.getNombre() + "'");
        documentoPiloto.put("Apelido","'" + p.getApellido() + "'");
        documentoPiloto.put("Dirección","'" + p.getDireccion() + "'");
        documentoPiloto.put("Celular","'" + p.getCelular() + "'");
        documentoPiloto.put("Dirección","'" + p.getDireccion() + "'");
        documentoPiloto.put("Correo","'" + p.getCorreo() + "'");
        documentoPiloto.put("Código piloto","'" + p.getCodigoPiloto() + "'");
        con.coleccion.insert(documentoPiloto);
    }
    
    public ArrayList obtenerPilotos()
    {
        ArrayList listaPilotos = new ArrayList<>();
        return listaPilotos;
    }
    
    
}
