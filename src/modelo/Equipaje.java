
package modelo;

public class Equipaje {
    private String codigoEquipaje;
    private String pesoEquipaje;
    private Pasajero propietario;
    private String descripcion;

    public Equipaje(String codigoEquipaje, String pesoEquipaje, Pasajero propietario, String descripcion) {
        this.codigoEquipaje = codigoEquipaje;
        this.pesoEquipaje = pesoEquipaje;
        this.propietario = propietario;
        this.descripcion = descripcion;
    }

    public Equipaje() {
    }

    public String getCodigoEquipaje() {
        return codigoEquipaje;
    }

    public void setCodigoEquipaje(String codigoEquipaje) {
        this.codigoEquipaje = codigoEquipaje;
    }

    public String getPesoEquipaje() {
        return pesoEquipaje;
    }

    public void setPesoEquipaje(String pesoEquipaje) {
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
        return "Equipaje{" + "codigoEquipaje=" + codigoEquipaje + ", pesoEquipaje=" + pesoEquipaje +  ", descripcion=" + descripcion + '}';
    }
    
    
}
