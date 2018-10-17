package Conexion;
//----------------------------------------------------------------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//----------------------------------------------------------------------------------------------------------------
public class Conexion
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private static Connection conexion = null;
    private static  Conexion instancia = null;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    private Conexion()
    { 
        //vacio
    }
    //------------------------------------------------------------------------------------------------------------SET CONEXION
    public void setConnection(Connection conexion) 
    {
        this.conexion = conexion;
    }
    //------------------------------------------------------------------------------------------------------------CREAR INSTANCIA
    public static Conexion createInstancia()
    {
        if(instancia == null)
            instancia = new Conexion();
        return instancia;
    }
    //------------------------------------------------------------------------------------------------------------GET CONEXION
    public Connection getConnection()
    {
        try 
        {
            if(conexion == null || conexion.isClosed())
            {
                try
                {
                    String url = "jdbc:postgresql://localhost:5432/postgres";
                    String contraseña="sacha";
                    Class.forName("org.postgresql.Driver");
                    conexion = DriverManager.getConnection(url,"postgres",contraseña);
                    if(conexion != null)
                    {
                        // esta consulta por null es por si no se establecio la conexion
                        System.out.println("Se ha conectado a la base de datos\n");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Problemas en la conexion: "+e.getMessage());
                }
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}