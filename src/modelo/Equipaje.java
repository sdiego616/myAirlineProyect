
package modelo;

public class Equipaje {
    private String codigoEquipaje;
    private double pesoEquipaje;
    private Pasajero propietario;
    private String descripcion;

    public Equipaje(String codigoEquipaje, double pesoEquipaje, Pasajero propietario, String descripcion) {
        this.codigoEquipaje = codigoEquipaje;
        this.pesoEquipaje = pesoEquipaje;
        this.propietario = propietario;
        this.descripcion = descripcion;
    }

    public String getCodigoEquipaje() {
        return codigoEquipaje;
    }

    public void setCodigoEquipaje(String codigoEquipaje) {
        this.codigoEquipaje = codigoEquipaje;
    }

    public double getPesoEquipaje() {
        return pesoEquipaje;
    }

    public void setPesoEquipaje(double pesoEquipaje) {
        this.pesoEquipaje = pesoEquipaje;
    }

    public Pasajero getPropietario() {
        return propietario;
    }

    public void setPropietario(Pasajero propietario) {
        this.propietario = propietario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Equipaje{" + "codigoEquipaje=" + codigoEquipaje + ", pesoEquipaje=" + pesoEquipaje + ", propietario=" + propietario + ", descripcion=" + descripcion + '}';
    }
    
    
}
