/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;
import vista.Menu;
import vista.SeleccionarAsientosFrm;

/**
 *
 * @author TOSHIBA
 */
public class ControladorSelectAsientos implements ActionListener {

    //ClienteDAO DAO = new ClienteDAO();
    //Cliente c = new Cliente();
    SeleccionarAsientosFrm vista = new SeleccionarAsientosFrm();
    //DefaultTableModel modelo = new DefaultTableModel();

    public ControladorSelectAsientos (SeleccionarAsientosFrm v)
    {
        this.vista = v;
        this.vista.primeraClase1.addActionListener(this);
        this.vista.primeraClase2.addActionListener(this);
        this.vista.primeraClase3.addActionListener(this);
        this.vista.primeraClase4.addActionListener(this);
        this.vista.claseEjecutiva1.addActionListener(this);
        this.vista.claseEjecutiva2.addActionListener(this);
        this.vista.claseEjecutiva3.addActionListener(this);
        this.vista.claseTurista1.addActionListener(this);
        this.vista.claseTurista2.addActionListener(this);
        this.vista.claseTurista3.addActionListener(this);
        this.vista.claseTurista4.addActionListener(this);
        this.vista.claseTurista5.addActionListener(this);
        this.vista.claseTurista6.addActionListener(this);
        this.vista.claseTurista7.addActionListener(this);
        this.vista.claseTurista8.addActionListener(this);
        this.vista.claseTurista9.addActionListener(this);
        this.vista.claseTurista10.addActionListener(this);
        this.vista.claseTurista11.addActionListener(this);
        this.vista.claseTurista12.addActionListener(this);
        this.vista.claseTurista13.addActionListener(this);
        this.vista.claseTurista14.addActionListener(this);
        this.vista.claseTurista15.addActionListener(this);
        this.vista.claseTurista16.addActionListener(this);
        this.vista.btnReservar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista.primeraClase1)
        {
            reservarAsiento1();
        }
        if(ae.getSource() == vista.primeraClase2)
        {
            reservarAsiento2();
        }
        if(ae.getSource() == vista.primeraClase3)
        {
            reservarAsiento3();
        }
        if(ae.getSource() == vista.primeraClase4)
        {
            reservarAsiento4();
        }
        if(ae.getSource() == vista.claseEjecutiva1)
        {
            reservarAsiento5();
        }
        if(ae.getSource() == vista.claseEjecutiva2)
        {
            reservarAsiento6();
        }
        if(ae.getSource() == vista.claseEjecutiva3)
        {
            reservarAsiento7();
        }
        if(ae.getSource() == vista.claseTurista1)
        {
            reservarAsiento8();
        }
        if(ae.getSource() == vista.claseTurista2)
        {
            reservarAsiento9();
        }
        if(ae.getSource() == vista.claseTurista3)
        {
            reservarAsiento10();
        }
        if(ae.getSource() == vista.claseTurista4)
        {
            reservarAsiento11();
        }
        if(ae.getSource() == vista.claseTurista5)
        {
            reservarAsiento12();
        }
        if(ae.getSource() == vista.claseTurista6)
        {
            reservarAsiento13();
        }
        if(ae.getSource() == vista.claseTurista7)
        {
            reservarAsiento14();
        }
        if(ae.getSource() == vista.claseTurista8)
        {
            reservarAsiento15();
        }
        if(ae.getSource() == vista.claseTurista9)
        {
            reservarAsiento16();
        }
        if(ae.getSource() == vista.claseTurista10)
        {
            reservarAsiento17();
        }
        if(ae.getSource() == vista.claseTurista11)
        {
            reservarAsiento18();
        }
        if(ae.getSource() == vista.claseTurista12)
        {
            reservarAsiento19();
        }
        if(ae.getSource() == vista.claseTurista13)
        {
            reservarAsiento20();
        }
        if(ae.getSource() == vista.claseTurista14)
        {
            reservarAsiento21();
        }
        if(ae.getSource() == vista.claseTurista15)
        {
            reservarAsiento22();
        }
        if(ae.getSource() == vista.claseTurista16)
        {
            reservarAsiento23();
        }
        if(ae.getSource() == vista.btnReservar)
        {
            finalizarReserva();
        }
    }
    
    public void reservarAsiento1 ()
    {
        vista.primeraClase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento2 ()
    {
        vista.primeraClase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento3 ()
    {
        vista.primeraClase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento4 ()
    {
        vista.primeraClase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento5 ()
    {
        vista.claseEjecutiva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento6 ()
    {
        vista.claseEjecutiva2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento7 ()
    {
        vista.claseEjecutiva3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento8 ()
    {
        vista.claseTurista1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento9 ()
    {
        vista.claseTurista2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento10 ()
    {
        vista.claseTurista3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento11 ()
    {
        vista.claseTurista4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento12 ()
    {
        vista.claseTurista5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento13 ()
    {
        vista.claseTurista6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento14 ()
    {
        vista.claseTurista7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento15 ()
    {
        vista.claseTurista8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento16 ()
    {
        vista.claseTurista9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento17 ()
    {
        vista.claseTurista10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento18 ()
    {
        vista.claseTurista11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento19 ()
    {
        vista.claseTurista12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento20 ()
    {
        vista.claseTurista13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento21 ()
    {
        vista.claseTurista14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento22 ()
    {
        vista.claseTurista15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void reservarAsiento23 ()
    {
        vista.claseTurista16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAsientoOcupado.png")));
    }
    public void finalizarReserva()
    {
        //vista.dispose();
        Menu menu=new Menu();
        menu.setVisible(true);
        vista.dispose();
    }
}
