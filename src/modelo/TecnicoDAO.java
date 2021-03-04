
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

public class TecnicoDAO {
    public void insertarTecnico(Tecnico t)
    {
        BasicDBObject documentoTecnico = new BasicDBObject();
        documentoTecnico.put("Nombre","'" + t.getNombre() + "'");
        documentoTecnico.put("Apelido","'" + t.getApellido() + "'");
        documentoTecnico.put("Dirección","'" + t.getDireccion() + "'");
        documentoTecnico.put("Celular","'" + t.getCelular() + "'");
        documentoTecnico.put("Dirección","'" + t.getDireccion() + "'");
        documentoTecnico.put("COrreo","'" + t.getCorreo() + "'");
        documentoTecnico.put("Codigo técnico","'" + t.getCodigoTecnico() + "'");
        
    } 
}
