
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class ConexionMongo {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento = new BasicDBObject();
    
    public ConexionMongo()
{
    try{
        MongoClient mongo = new MongoClient("localhost",27017);
        baseDatos = mongo.getDB("aeropuerto");
        coleccion = baseDatos.getCollection("pilotos");
        System.out.println("conexión a base de Datos exitoso");            
    }
    catch(Exception ex)
    {
        
    }
}
    
}
