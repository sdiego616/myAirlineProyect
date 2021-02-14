
package modelo;

public class Portada {
    private String aux;

    public Portada() {
        
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }
    
    public String presentar ()
    {
        this.aux = "Programa para gestionar \nlas tareas de un aeropuerto\n";
        this.aux += "Este programa se desarrolla \nmediante el patron \nModelo Vista Controlador";
        return aux;
    }
    
}
