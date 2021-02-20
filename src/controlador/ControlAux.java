
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Portada;
import vista.Presentacion;

public class ControlAux implements ActionListener {
    private Presentacion view;
    private Portada display;
    
    public ControlAux (Presentacion view, Portada display)
    {
        this.view = view;
        this. display = display;
        this.view.btnPresentar.addActionListener(this);
    }
    
    public void iniciar ()
    {
        view.setTitle("myAirline Proyect");
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        view.txtPresentacion.setText(display.presentar());
    }
    
}
