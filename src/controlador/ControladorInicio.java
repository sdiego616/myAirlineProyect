
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Login;
import vista.LoginFrm;


public class ControladorInicio implements ActionListener , Login{
    LoginFrm loginv = new LoginFrm();
    
    public ControladorInicio(LoginFrm v)
    {
        this.loginv = v;
        loginv.btnAcceder.addActionListener(this);
        loginv.btnRegister.addActionListener(this);      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         iniciarSesion();
    } 

    @Override
    public void iniciarSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
