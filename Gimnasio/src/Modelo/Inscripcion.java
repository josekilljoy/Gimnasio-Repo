package Modelo;
//----------------------------------------------------------------------------------------------------------------
public class Inscripcion 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private float monto;
    private char fecha;
    private Cliente cliente;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Inscripcion(float monto, char fecha, Cliente cliente) 
    {
        this.monto = monto;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    //------------------------------------------------------------------------------------------------------------GET MONTO
    public float getMonto() 
    {
        return monto;
    }
    //------------------------------------------------------------------------------------------------------------SET MONTO
    public void setMonto(float monto) 
    {
        this.monto = monto;
    }
    //------------------------------------------------------------------------------------------------------------GET FECHA
    public char getFecha() 
    {
        return fecha;
    }
    //------------------------------------------------------------------------------------------------------------SET FECHA
    public void setFecha(char fecha) 
    {
        this.fecha = fecha;
    }
    //------------------------------------------------------------------------------------------------------------GET CLIENTE
    public Cliente getCliente() 
    {
        return cliente;
    }
    //------------------------------------------------------------------------------------------------------------SET CLIENTE
    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }
    //------------------------------------------------------------------------------------------------------------TO STRING
    @Override
    public String toString() 
    {
        return "Inscripcion{" + "monto=" + monto + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }
    
}
