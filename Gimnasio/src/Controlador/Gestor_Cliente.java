package Controlador;
//----------------------------------------------------------------------------------------------------------------
import Conexion.GestionarBD;
import Modelo.Cliente;
import java.util.Vector;
//----------------------------------------------------------------------------------------------------------------
public class Gestor_Cliente 
{
    public static Vector consultarCliente()
    {
        //creo cosas
        GestionarBD baseDatos = new GestionarBD();
        Vector<Cliente> clientes = new Vector();
        String consulta = "SELECT * FROM cliente, persona WHERE pe_cod_cliente = pe_cod ORDER BY pe_nombre";
        
        //obtengo los clientes de la base de datos
        clientes = baseDatos.getClientes(consulta);
        
        return clientes;
    
    }
}
