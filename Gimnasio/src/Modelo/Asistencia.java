package Modelo;
//----------------------------------------------------------------------------------------------------------------

public class Asistencia 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private char fecha;
    private char hora;
    private Cliente cliente;
    private Plan plan;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Asistencia(char fecha, char hora, Cliente cliente, Plan plan) 
    {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.plan = plan;
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
    //------------------------------------------------------------------------------------------------------------GET HORA
    public char getHora() 
    {
        return hora;
    }
    //------------------------------------------------------------------------------------------------------------SET HORA
    public void setHora(char hora) 
    {
        this.hora = hora;
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
    //------------------------------------------------------------------------------------------------------------GET PLAN
    public Plan getPlan() 
    {
        return plan;
    }
    //------------------------------------------------------------------------------------------------------------SET PLAN
    public void setPlan(Plan plan) 
    {
        this.plan = plan;
    }
    //------------------------------------------------------------------------------------------------------------TO STRING
    @Override
    public String toString() 
    {
        return "Asistencia{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", plan=" + plan + '}';
    }
    
}
