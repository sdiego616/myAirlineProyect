
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Login;
import vista.Register;

public class ControladorRegistro implements ActionListener, Login {
    Register registrov = new Register();
    public ControladorRegistro(Register rv)
    {
        this.registrov = rv;
        registrov.btnRegistro.addActionListener(this);   
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        registrarse();
    }

    @Override
    public void registrarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
