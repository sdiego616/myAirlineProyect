
package modelo;

public class Tecnico extends Persona implements AccionesReserva, AccionesClima, GestionPasajeros {
    private String codigoTecnico;

    public Tecnico(String codigoTecnico, String nombre, String apellido, String celular, String direccion, String correo) {
        super(nombre, apellido, celular, direccion, correo);
        this.codigoTecnico = codigoTecnico;
    }

    public String getCodigoTecnico() {
        return codigoTecnico;
    }

    public void setCodigoTecnico(String codigoTecnico) {
        this.codigoTecnico = codigoTecnico;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "codigoTecnico=" + codigoTecnico + '}';
    }
    
    public void firmar()
    {
        
    }

    @Override
    public void generarBoleto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ingresarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPasajero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retirarPasajero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarEquipaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retirarEquipaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
