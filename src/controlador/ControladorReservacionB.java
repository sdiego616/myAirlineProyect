
package controlador;

import com.mongodb.BasicDBObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import modelo.Pasajero;
import modelo.PasajeroDAO;
import modelo.Tecnico;
import modelo.Vuelo;
import vista.ReservacionB;

public class ControladorReservacionB implements ActionListener {
    ReservacionB resB = new ReservacionB ();
    Pasajero ps = new Pasajero ();
    PasajeroDAO dao = new PasajeroDAO();
    Vuelo vuelo = new Vuelo ();
    
    Tecnico tec = new Tecnico();
    
    public ControladorReservacionB(ReservacionB res)
    {
        this.resB = res;
        this.resB.btnSeleccionar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == resB.btnSeleccionar)
        {
            agregarVuelo();
        }
    }
    
    public void agregarVuelo()
    {
        vuelo.setDestino(resB.cmbDestino.getSelectedItem().toString());
        vuelo.setFechaVuelo(LocalDate.of(Integer.parseInt(resB.cmbYear.getSelectedItem().toString()), this.mesToInt(), Integer.parseInt(resB.cmbDia.getSelectedItem().toString())));
        vuelo.setHoraAbordaje(LocalTime.of(Integer.parseInt(resB.cmbHora.getSelectedItem().toString()), Integer.parseInt(resB.cmbMinutos.getSelectedItem().toString())));
        
        BasicDBObject objB = new BasicDBObject();
        
        Iterator <Pasajero> i = dao.obtenerPasajeros().iterator();
        Pasajero aux = new Pasajero();
        int k = 0;
        //String [] auxS = this.setCombPs();
        while (i.hasNext())
        {
            aux= i.next();
            if (aux.getCodigoPasajero().equals(this.selectCodigoPs()))
            {
                objB.append("codigoPasajero", this.selectCodigoPs());
                System.out.println("lee el codigoPs " + this.selectCodigoPs());
                break;
            }
            k ++;
        }
        
        tec.updateVuelo(objB, vuelo.toDBVuelo());
    }
    
    public int mesToInt()
    {
        if(resB.cmbMes.getSelectedItem().toString().equals("Enero"))
            return 1;
        if(resB.cmbMes.getSelectedItem().toString().equals("Febreo"))
            return 2;
        if(resB.cmbMes.getSelectedItem().toString().equals("Marzo"))
            return 3;
        if(resB.cmbMes.getSelectedItem().toString().equals("Abril"))
            return 4;
        if(resB.cmbMes.getSelectedItem().toString().equals("Mayo"))
            return 5;
        if(resB.cmbMes.getSelectedItem().toString().equals("Junio"))
            return 6;
        if(resB.cmbMes.getSelectedItem().toString().equals("Julio"))
            return 7;
        if(resB.cmbMes.getSelectedItem().toString().equals("Agosto"))
            return 8;
        if(resB.cmbMes.getSelectedItem().toString().equals("Septiembre"))
            return 9;
        if(resB.cmbMes.getSelectedItem().toString().equals("Octubre"))
            return 10;
        if(resB.cmbMes.getSelectedItem().toString().equals("Noviembre"))
            return 11;
        if(resB.cmbMes.getSelectedItem().toString().equals("Diciembre"))
            return 12;
        else
            return 0;
    }
    
    public void setCombPs()
    {
        //dao.obtenerPasajeros();
        //String [] cods = new String [dao.obtenerPasajeros().size()];
        String aux;
        //String auxBuscar;
        Pasajero auxps;
        for (int i = 0; i < dao.obtenerPasajeros().size(); i ++)
        {
            auxps = (Pasajero) dao.obtenerPasajeros().get(i);
            aux = auxps.getNombre() +" "+ auxps.getApellido();
          //  auxBuscar = auxps.getCodigoPasajero();
            //cods [i] = auxBuscar;
            //System.out.println(cods [i]+ "  "+ i);
            resB.cmbPasajero.addItem(aux);
        }
    }
    public String selectCodigoPs()
    {
        //dao.obtenerPasajeros();
        //String [] cods = new String [dao.obtenerPasajeros().size()];
        String aux = new String();
        //String auxBuscar;
        Pasajero auxps;
        for (int i = 0; i < dao.obtenerPasajeros().size(); i ++)
        {
            auxps = (Pasajero) dao.obtenerPasajeros().get(i);
            if ((auxps.getNombre()+ " " +auxps.getApellido()).equals(resB.cmbPasajero.getSelectedItem()))
            {
                aux = auxps.getCodigoPasajero();
                break;
            }
        }
        return aux;
    }
}
