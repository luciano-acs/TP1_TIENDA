package RMIInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano Acosta
 */
public interface RemoteInterface extends Remote{

    public ArrayList<String> ingresarSistema(String legajo, String contraseña)throws RemoteException;

    public void nuevoCliente(String cuit, String condicion, String domicilio, String email, String razon)throws RemoteException;

    public ArrayList<String> cargarCombos()throws RemoteException;

    public String[][] cargarTabla()throws RemoteException;

    public ArrayList<String> buscarFactura(String id, String cuit)throws RemoteException;

    public void eliminarProducto(int codProducto)throws RemoteException;

    public String[][] listarTablaProductos()throws RemoteException;

    public int cargarId() throws RemoteException;

    public String[][] listarVentas(DefaultTableModel datos, long cuit, int codigoTipo)throws RemoteException;

    public void modificarProducto(String nombre, String descripcion, String iva, String costo, String margen, String marca, String rubro)throws RemoteException;

    public ArrayList<String> rellenarCampos(String nombre)throws RemoteException;

    public ArrayList<ArrayList<String>> cargarCombosM()throws RemoteException;

    public void cargarProducto(String nombre, String descripcion, String iva, String costo, String margen, String marca, String rubro, String cantidad)throws RemoteException;

    public ArrayList<ArrayList<String>> cargarCombosP()throws RemoteException;

    public boolean existe(String nombre)throws RemoteException;

    public ArrayList<String> llenarCombos(String tipo)throws RemoteException;

    public void agregarColor(String color)throws RemoteException;

    public void agregarMarca(String marca)throws RemoteException;

    public void actualizarStock(String nombre, String cantidad, String talle, String color)throws RemoteException;

    public ArrayList<ArrayList<String>> cargarCombosStock()throws RemoteException;

    public String[][] listarTablaColor()throws RemoteException;

    public String[][] listarTablaMarca()throws RemoteException;

    public ArrayList<String> agregarCaracteristicas(String nombre)throws RemoteException;

    public String[][] listarCaracteristicas(String nombre)throws RemoteException;

    public boolean verificarExistencia(String nombre)throws RemoteException;

    public ArrayList<String> cargarProducto1(String nombre)throws RemoteException;

    public ArrayList<String> buscarCliente(String cuit)throws RemoteException;

    public int buscarCodColor(String color)throws RemoteException;

    public int buscarCodTalle(String talle)throws RemoteException;

    public int consultarStock(String nombre, int codColor, int codTalle)throws RemoteException;

    public ArrayList<String> cargarLinea(String codigo, String descripcion, int cant, String talle, String color, String text, String text1, String text2, String id)throws RemoteException;

    public void restaurarStock(String codigo, int cant, String talle, String color, int linea)throws RemoteException;

    public ArrayList<String> cargarCombosTalle()throws RemoteException;

    public void cargarLineaV(String fecha, int comprobante, double total, DefaultTableModel datos, String cliente)throws RemoteException;

    public void cancelarVenta(DefaultTableModel datos, String id)throws RemoteException;

    public void finalizarVenta(String id, String pago, String total)throws RemoteException;

    public ArrayList<ArrayList<String>> cargarCombosV(String text)throws RemoteException;
}
