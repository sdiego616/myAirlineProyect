/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vista.Clima;
import vista.Menu;

/**
 *
 * @author TOSHIBA
 */
public class ControladorClima implements ActionListener {

    Clima clima = new Clima();
    
    public ControladorClima(Clima c)
    {
        this.clima = c;
        clima.btnClimaVolver.addActionListener(this);
        clima.btnActualizar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clima.btnClimaVolver)
        {
            regresarMenu();
        }
        if(ae.getSource() == clima.btnActualizar)
        {
            
        }
    }
    
    public void regresarMenu()
    {
        clima.dispose();
        clima.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu menu = new Menu();
        menu.setVisible(true);
        
    }
    
}
