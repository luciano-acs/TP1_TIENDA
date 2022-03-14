package Cliente;

import Vista.*;
import RMIInterfaces.RemoteInterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano Acosta
 */
public class PrincipalCliente {

    RemoteInterface s;

    public static void main(String[] args) {
        Sesion inicio = new Sesion();
        inicio.setVisible(true);
    }

    public void conexion() throws NotBoundException {
        try {
            Registry myRegistry = LocateRegistry.getRegistry("localhost", 5000);
            s = (RemoteInterface) myRegistry.lookup("RemoteInterface");
        } catch (RemoteException ex) {
            Logger.getLogger(PrincipalCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //PRESENTADOR INICIO X1
    public ArrayList<String> ingresarSistema(String legajo, String contraseña) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> ingresarSistema = s.ingresarSistema(legajo, contraseña);
        return ingresarSistema;
    }

    //PRESENTADOR NUEVO CLIENTE X2
    public void nuevoCliente(String cuit, String condicion, String domicilio, String email, String razon) throws RemoteException, NotBoundException {
        conexion();
        s.nuevoCliente(cuit, condicion, domicilio, email, razon);
    }

    public ArrayList<String> cargarCombos() throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> combos = s.cargarCombos();
        return combos;
    }

    //PRESENTADOR CLIENTES X1
    public String[][] cargarTabla() throws RemoteException, NotBoundException {
        conexion();
        String[][] tablaClientes = s.cargarTabla();
        return tablaClientes;
    }

    //PRESENTADOR FACTURA X1
    public ArrayList<String> buscarFactura(String id, String cuit) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> factura = s.buscarFactura(id, cuit);
        return factura;
    }

    //PRESENTADOR PRODUCTOS X2
    public void eliminarProducto(int codProducto) throws RemoteException, NotBoundException {
        conexion();
        s.eliminarProducto(codProducto);
    }

    public String[][] listarTablaProductos() throws RemoteException, NotBoundException {
        conexion();
        String[][] productos = s.listarTablaProductos();
        return productos;
    }

    //nueva venta
    public int cargarId() throws RemoteException, NotBoundException {
        conexion();
        int id = s.cargarId();
        return id;
    }

    //PRESENTADOR VENTAS X1
    public String[][] listarVentas(DefaultTableModel datos, long cuit, int codigoTipo) throws RemoteException, NotBoundException {
        conexion();
        String[][] ventas = s.listarVentas(datos, cuit, codigoTipo);
        return ventas;
    }

    //PRESENTADOR MOD PRODUCTOS X3
    public void modificarProducto(String nombre, String descripcion, String iva, String costo, String margen, String marca, String rubro) throws RemoteException, NotBoundException {
        conexion();
        s.modificarProducto(nombre, descripcion, iva, costo, margen, marca, rubro);
    }

    public ArrayList<String> rellenarCampos(String nombre) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> campos = s.rellenarCampos(nombre);
        return campos;
    }

    public ArrayList<ArrayList<String>> cargarCombosM() throws RemoteException, NotBoundException {
        conexion();
        ArrayList<ArrayList<String>> combosM = s.cargarCombosM();
        return combosM;
    }

    //PRESENTADOR NUEVO PRODUCTO X2
    public void cargarProducto(String nombre, String descripcion, String iva, String costo, String margen, String marca, String rubro, String cantidad) throws RemoteException, NotBoundException {
        conexion();
        s.cargarProducto(nombre, descripcion, iva, costo, margen, marca, rubro, cantidad);
    }

    public ArrayList<ArrayList<String>> cargarCombosP() throws RemoteException, NotBoundException {
        conexion();
        ArrayList<ArrayList<String>> combosP = s.cargarCombosP();
        return combosP;
    }

    //PRESENTADOR GESTIONAR PROD X9
    public ArrayList<String> llenarCombos(String tipo) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> combosTipoG = s.llenarCombos(tipo);
        return combosTipoG;
    }

    public void agregarColor(String color) throws RemoteException, NotBoundException {
        conexion();
        s.agregarColor(color);
    }

    public void agregarMarca(String marca) throws RemoteException, NotBoundException {
        conexion();
        s.agregarMarca(marca);
    }

    public void actualizarStock(String nombre, String cantidad, String talle, String color) throws RemoteException, NotBoundException {
        conexion();
        s.actualizarStock(nombre, cantidad, talle, color);
    }

    public ArrayList<ArrayList<String>> cargarCombosStock() throws RemoteException, NotBoundException {
        conexion();
        ArrayList<ArrayList<String>> combosStock = s.cargarCombosStock();
        return combosStock;
    }

    public String[][] listarTablaColor() throws RemoteException, NotBoundException {
        conexion();
        String[][] tablaColor = s.listarTablaColor();
        return tablaColor;
    }

    public String[][] listarTablaMarca() throws RemoteException, NotBoundException {
        conexion();
        String[][] tablaMarcas = s.listarTablaMarca();
        return tablaMarcas;
    }

    public ArrayList<String> agregarCaracteristicas(String nombre) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> caracteristicas = s.agregarCaracteristicas(nombre);
        return caracteristicas;
    }

    public String[][] listarCaracteristicas(String nombre) throws RemoteException, NotBoundException {
        conexion();
        String[][] lcaracteristicas = s.listarCaracteristicas(nombre);
        return lcaracteristicas;
    }

    //PRESENTADOR NUEVA VENTA X14
    public boolean verificarExistencia(String nombre) throws RemoteException, NotBoundException {
        conexion();        
        boolean existe = s.verificarExistencia(nombre);
        System.out.println(nombre);
        return existe;        
    }

    public ArrayList<String> cargarProducto1(String nombre) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> producto = s.cargarProducto1(nombre);
        return producto;
    }

    public ArrayList<String> buscarCliente(String cuit) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> cliente = s.buscarCliente(cuit);
        return cliente;
    }

    public int buscarCodColor(String color) throws RemoteException, NotBoundException {
        conexion();
        int codColor = s.buscarCodColor(color);
        return codColor;
    }

    public int buscarCodTalle(String talle) throws RemoteException, NotBoundException {
        conexion();
        int codTalle = s.buscarCodTalle(talle);
        return codTalle;
    }

    public int consultarStock(String nombre, int codColor, int codTalle) throws RemoteException, NotBoundException {
        conexion();
        int stock = s.consultarStock(nombre, codColor, codTalle);
        return stock;
    }

    public ArrayList<String> cargarLinea(String codigo, String descripcion, int cant, String talle, String color, String text, String text1, String text2, String id) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> linea = s.cargarLinea(codigo, descripcion, cant, talle, color, text, text1, text2, id);
        return linea;
    }

    public void restaurarStock(String codigo, int cant, String talle, String color, int linea) throws RemoteException, NotBoundException {
        conexion();
        s.restaurarStock(codigo, cant, talle, color, linea);
    }

    public ArrayList<String> cargarComboTalle(String tipo, String nombre) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<String> comboTalle = s.cargarCombosTalle(tipo, nombre);
        return comboTalle;
    }

    public void cargarLineaV(String fecha, int comprobante, double total, String[][] datos, String cliente) throws RemoteException, NotBoundException {
        conexion();
        s.cargarLineaV(fecha, comprobante, total, datos, cliente);
    }

    public void cancelarVenta(DefaultTableModel datos, String id) throws RemoteException, NotBoundException {
        conexion();
        s.cancelarVenta(datos, id);
    }

    public void finalizarVenta(String id, String pago, String total) throws RemoteException, NotBoundException {
        conexion();
        s.finalizarVenta(id, pago, total);
    }

    public ArrayList<ArrayList<String>> cargarCombosV(String text) throws RemoteException, NotBoundException {
        conexion();
        ArrayList<ArrayList<String>> combosV = s.cargarCombosV(text);
        return combosV;
    }

    //se repite
    public boolean existe(String nombre) throws RemoteException, NotBoundException {
        conexion();
        boolean existeProducto = s.existe(nombre);
        return existeProducto;
    }
}
