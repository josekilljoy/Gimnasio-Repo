package Modelo;
//----------------------------------------------------------------------------------------------------------------

public class Asistencia 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Plan plan;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Asistencia(String fecha, String hora, Cliente cliente, Plan plan) 
    {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.plan = plan;
    }
    //------------------------------------------------------------------------------------------------------------GET FECHA
    public String getFecha() 
    {
        return fecha;
    }
    //------------------------------------------------------------------------------------------------------------SET FECHA
    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }
    //------------------------------------------------------------------------------------------------------------GET HORA
    public String getHora() 
    {
        return hora;
    }
    //------------------------------------------------------------------------------------------------------------SET HORA
    public void setHora(String hora) 
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
