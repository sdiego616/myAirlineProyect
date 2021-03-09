
package proyecto_myairline;

import controlador.ControlAux;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Clima;
import vista.LoginFrm;
import vista.Menu;
import vista.Register;
import vista.ReservacionA;
import vista.ReservacionB;
import vista.SeleccionarAsientosFrm;


public class Gestor_myAirline implements ActionListener {
    Menu vMenu = new Menu();
   public static void main(String[] args) {
        System.out.println("Aporte de prueba");
        System.out.println("Programa para gestionar las tareas de un aeropuerto");
        System.out.println("Este programa se desarrolla mediante el patron Modelo Vista Controlador");
        
        Clima vc = new Clima();
        LoginFrm vLog = new LoginFrm();
        Menu vMenu = new Menu();
        Register vRegistro = new Register();
        ReservacionA vistaRevA = new ReservacionA();
        ReservacionB vistaRevB = new ReservacionB();
        SeleccionarAsientosFrm vSelect = new SeleccionarAsientosFrm ();
        
        vLog.setVisible(true);
        vLog.setLocationRelativeTo(vLog);
        int n =0;
        while (n<13)
        {
            ControlAux ca = new ControlAux(vc,vLog,vMenu,vRegistro,vistaRevA,vistaRevB,vSelect);
            n++;
            ca =null;
        }
        
        System.out.println("Actualizar repositorio");
        
        System.out.println("Edito desde GitHub");
    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vMenu.btnSalir)
        {
            
        }
    }
    public void salir()
    {
        vMenu.dispose();
    }
}
