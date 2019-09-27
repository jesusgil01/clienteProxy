package RemoteProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ReportGenerator extends Remote{

    public String generateDailyReport(String name) throws RemoteException;

    public boolean login(String user, String password, String rol) throws RemoteException;

    public ArrayList<String> getTiendas() throws RemoteException;

    public String getInfoSucursal(String name) throws RemoteException;

    public boolean addUser(String name, String apellidos, String fecha, String genero, String Curp, String Rfc, String estado_civil, String telefono, String email, String rol, String usuario, String contra, double salario, String direccion) throws RemoteException;

    public boolean addTienda(String nombre, String direccion, String telefono, int encargado) throws RemoteException;

    public boolean consultarUS(String Sucursal) throws RemoteException;
   
}
