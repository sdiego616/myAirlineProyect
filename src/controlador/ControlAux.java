
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Clima;
import vista.LoginFrm;
import vista.Menu;
import vista.Register;
import vista.ReservacionA;
import vista.ReservacionB;
import vista.SeleccionarAsientosFrm;

public class ControlAux implements ActionListener {
    private Clima vc = new Clima();
    private LoginFrm vLog = new LoginFrm();
    private Menu vMenu = new Menu();
    private Register vRegistro = new Register();
    private ReservacionA vistaRevA = new ReservacionA();
    private ReservacionB vistaRevB = new ReservacionB();
    private SeleccionarAsientosFrm vSelect = new SeleccionarAsientosFrm ();

    public ControlAux(Clima vc, LoginFrm log, Menu vm, Register vr, ReservacionA vra, ReservacionB vrb, SeleccionarAsientosFrm vs) {
        this.vc = vc;
        vc.btnClimaVolver.addActionListener(this);
        this.vLog =log;
        vLog.btnAcceder.addActionListener(this);
        vLog.btnRegister.addActionListener(this);
        vLog.btnReservacion.addActionListener(this);
        this.vMenu =vm;
        vMenu.btnClima.addActionListener(this);
        vMenu.btnReservacion.addActionListener(this);
        vMenu.btnRutas.addActionListener(this);
        vMenu.btnSalir.addActionListener(this);
        this.vRegistro=vr;
        vRegistro.btnRegistro.addActionListener(this);
        this.vistaRevA=vra;
        vistaRevA.btnSig1.addActionListener(this);
        this.vistaRevB=vrb;
        vistaRevB.btnSeleccionar.addActionListener(this);
        this.vSelect=vs;
        vSelect.btnReservar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vc.btnClimaVolver)
        {
            abrirMenu();
        }
        if(ae.getSource() == vLog.btnAcceder)
        {
            abrirMenu();
            //System.out.println("presionaste boton acceder");
        }
        if(ae.getSource() == vLog.btnReservacion)
        {
            abrirReservacionA();
        }
        if(ae.getSource() == vLog.btnRegister)
        {
            abrirRegistrar();
        }
        if(ae.getSource() == vMenu.btnClima)
        {
            abrirClima();
        }
        if(ae.getSource() == vMenu.btnReservacion)
        {
            abrirReservacionA();
        }
        if(ae.getSource() == vMenu.btnRutas)
        {
            
        }
        if(ae.getSource() == vMenu.btnSalir)
        {
            cerrar();
        }
        if(ae.getSource() == vRegistro.btnRegistro)
        {
            abrirLogin();
        }
        if(ae.getSource() == vistaRevA.btnSig1)
        {
            abrirReservacionB();
        }
        if(ae.getSource() == vistaRevB.btnSeleccionar)
        {
            abrirSelect();
        }
        if(ae.getSource() == vSelect.btnReservar)
        {
            abrirMenu();
        }
    }
    
    public void abrirMenu()
    {
        vMenu.setVisible(true);
        vMenu.setLocationRelativeTo(vMenu);
        vc.dispose();
        vLog.dispose();
        vRegistro.dispose();
        vistaRevA.dispose();
        vistaRevB.dispose();
        vSelect.dispose();
    }
    public void abrirReservacionA()
    {
        vistaRevA.setVisible(true);
        vistaRevA.setLocationRelativeTo(vistaRevA);
        vc.dispose();
        vLog.dispose();
        vRegistro.dispose();
        vMenu.dispose();
        vistaRevB.dispose();
        vSelect.dispose();
    }
    public void abrirReservacionB()
    {
        vistaRevB.setVisible(true);
        vistaRevB.setLocationRelativeTo(vistaRevB);
        vc.dispose();
        vLog.dispose();
        vRegistro.dispose();
        vMenu.dispose();
        vistaRevA.dispose();
        vSelect.dispose();
    }
    public void abrirRegistrar()
    {
        vRegistro.setVisible(true);
        vRegistro.setLocationRelativeTo(vRegistro);
        vc.dispose();
        vLog.dispose();
        vistaRevB.dispose();
        vMenu.dispose();
        vistaRevA.dispose();
        vSelect.dispose();
    }
    public void abrirClima()
    {
        vc.setVisible(true);
        vc.setLocationRelativeTo(vc);
        vRegistro.dispose();
        vLog.dispose();
        vistaRevB.dispose();
        vMenu.dispose();
        vistaRevA.dispose();
        vSelect.dispose();
    }
    public void abrirLogin()
    {
        vLog.setVisible(true);
        vLog.setLocationRelativeTo(vLog);
        vRegistro.dispose();
        vc.dispose();
        vistaRevB.dispose();
        vMenu.dispose();
        vistaRevA.dispose();
        vSelect.dispose();
    }
    public void abrirSelect()
    {
        vSelect.setVisible(true);
        vSelect.setLocationRelativeTo(vSelect);
        vRegistro.dispose();
        vc.dispose();
        vistaRevB.dispose();
        vMenu.dispose();
        vistaRevA.dispose();
        vLog.dispose();
    }
    public void cerrar()
    {
        vSelect.dispose();
        vRegistro.dispose();
        vc.dispose();
        vistaRevB.dispose();
        vMenu.dispose();
        vistaRevA.dispose();
        vLog.dispose();
    }
}
