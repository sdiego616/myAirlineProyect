
package proyecto_myairline;

import controlador.ControlAux;
import modelo.Portada;
import vista.Presentacion;

public class Gestor_myAirline {

    public static void main(String[] args) {
        System.out.println("Programa para gestionar las tareas de un aeropuerto");
        System.out.println("Este programa se desarrolla mediante el patron Modelo Vista Controlador");
        
        Presentacion p = new Presentacion ();
        Portada po = new Portada ();
        
        ControlAux ca = new ControlAux(p,po);
        
        ca.iniciar();
        p.setVisible(true);
    }    
}