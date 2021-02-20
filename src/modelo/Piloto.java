
package modelo;


public class Piloto extends Persona {
    private String codigoPiloto;
    
    public Piloto(String nombre, String apellido, String celular, String direccion, String correo) {
        super(nombre, apellido, celular, direccion, correo);
    }

    public String getCodigoPiloto() {
        return codigoPiloto;
    }

    public void setCodigoPiloto(String codigoPiloto) {
        this.codigoPiloto = codigoPiloto;
    }
    
}
