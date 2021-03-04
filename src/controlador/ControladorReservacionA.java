
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import modelo.ConexionPasajeros;
import modelo.Equipaje;
import modelo.Pasajero;
import modelo.PasajeroDAO;
import modelo.Tecnico;
import modelo.Vuelo;
import vista.ReservacionA;
import vista.ReservacionB;

public class ControladorReservacionA implements ActionListener {
    
    ReservacionA vRes1 = new ReservacionA();
    Pasajero ps = new Pasajero();
    PasajeroDAO dao = new PasajeroDAO();
    ArrayList <Equipaje> equipajes = new ArrayList <Equipaje>();
    
    ReservacionB vResB = new ReservacionB ();
    Vuelo vuelo = new Vuelo ();
    Tecnico tecnico = new Tecnico();
    
    public ControladorReservacionA(ReservacionA vRes1)
    {
        this.vRes1 = vRes1;
        this.vRes1.btnSig1.addActionListener(this);
        this.vRes1.btnAgregarEq.addActionListener(this);
    }
    
    public ControladorReservacionA(ReservacionB vRes2)
    {
        this.vResB = vRes2;
        this.vResB.btnSeleccionar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vRes1.btnSig1)
        {
            agregarDBpasajero();
            
        }
        if(ae.getSource() == vRes1.btnAgregarEq)
        {
            agregarEquipaje();
        }
        
    }
    
    public void agregarDBpasajero()
    {
        ps.setNombre(vRes1.txtNombre.getText());
        ps.setApellido(vRes1.txtApellido.getText());
        ps.setCelular(vRes1.txtCelular.getText());
        ps.setDireccion(vRes1.txtDireccion.getText());
        ps.setCorreo(vRes1.txtCorreo.getText());
        ps.setEquipajes(equipajes);
        
        dao.insertarPasajero(ps);
    }
    
    public void agregarEquipaje()
    {
        Equipaje aux = new Equipaje();
        aux.setPropietario(ps);
        aux.setCodigoEquipaje(ps.getCodigoPasajero());
        aux.setPesoEquipaje(vRes1.txtPeso.getText());
        aux.setDescripcion(vRes1.cmbDescripcion.getSelectedItem().toString());
        equipajes.add(aux);
        limpiarEquipaje();
        
    }
    
    
    
    public void limpiarEquipaje()
    {
        vRes1.txtPeso.setText("");
        vRes1.cmbDescripcion.setSelectedIndex(0);
    }
}
