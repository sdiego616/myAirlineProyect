/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Clima;
import vista.Menu;
import vista.ReservacionA;
import vista.RutasFrm;

/**
 *
 * @author TOSHIBA
 */
public class ControladorMenu implements ActionListener {
    
    Menu vMenu = new Menu();
    
    public ControladorMenu (Menu v)
    {
        this.vMenu = v;
        vMenu.btnClima.addActionListener(this);
        vMenu.btnReservacion.addActionListener(this);
        vMenu.btnRutas.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vMenu.btnClima)
        {
            abrirClima();
            System.out.println("hola");
        }
        if(ae.getSource() == vMenu.btnReservacion)
        {
            abrirReservacion();
        }
//        if(ae.getSource() == vMenu.btnRutas)
//        {
//            abrirRutas();
//        }
    }
    
    public void abrirClima()
    {
        Clima clima = new Clima();
        clima.setVisible(true);
        vMenu.dispose();
    }
    
    public void abrirReservacion()
    {
        ReservacionA reserv = new ReservacionA();
        reserv.setVisible(true);
        vMenu.dispose();
    }
    
    public void abrirRutas()
    {
        RutasFrm ruta = new RutasFrm();
        ruta.setVisible(true);
        vMenu.dispose();
      
   }
    
}
