package Conexion;
//----------------------------------------------------------------------------------------------------------------
import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class GestionarBD 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private Conexion conexion = Conexion.createInstancia();
    private Statement stat;
    private ResultSet rset;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public GestionarBD()
    {
        //vacio
    }
    //------------------------------------------------------------------------------------------------------------GET STAT
    public Statement getStat() 
    {
        return stat;
    }
    //------------------------------------------------------------------------------------------------------------GET RSET
    public ResultSet getRset() 
    {
        return rset;
    }
    //------------------------------------------------------------------------------------------------------------SET STAT
    public void setStat(Statement stat)
    {
        this.stat = stat;
    }
    //------------------------------------------------------------------------------------------------------------SET RSET
    public void setRset(ResultSet rset)
    {
        this.rset = rset;
    }
    //-----------------------------------------------------------------------------------------------------------\
    //------------------------------------------------------------------------------------------------------------COMUNICACION BASE DE DATOS
    //-----------------------------------------------------------------------------------------------------------/
    public Vector getClientes(String consulta)
    {
        Vector<Cliente> vector = new Vector();
        try
        {
            conexion.setConnection(conexion.getConnection());
            setStat(conexion.getConnection().createStatement());
            setRset(getStat().executeQuery(consulta));
            while(getRset().next())
            {
                Cliente cliente = new Cliente(getRset().getInt("pe_cod"), getRset().getString("pe_nombre"), getRset().getString("pe_apellido"), getRset().getInt("pe_dni"), getRset().getString("pe_direccion"), getRset().getString("cl_categoria"), getRset().getInt("cl_tel"));
                vector.add(cliente);
            }
            rset.close();
            stat.close();
            conexion.getConnection().close();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return vector;
    }
}