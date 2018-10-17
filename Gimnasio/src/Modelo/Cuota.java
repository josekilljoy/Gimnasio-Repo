package Modelo;
//----------------------------------------------------------------------------------------------------------------
public class Cuota 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private float monto;
    private float descuento;
    private char fecha;
    private Cliente cliente;
    private Plan plan;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Cuota(float monto, float descuento, char fecha, Cliente cliente, Plan plan) 
    {
        this.monto = monto;
        this.descuento = descuento;
        this.fecha = fecha;
        this.cliente = cliente;
        this.plan = plan;
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
    //------------------------------------------------------------------------------------------------------------GET DESCUENTO
    public float getDescuento() 
    {
        return descuento;
    }
    //------------------------------------------------------------------------------------------------------------SET DESCUENTO
    public void setDescuento(float descuento) 
    {
        this.descuento = descuento;
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
        return "Cuota{" + "monto=" + monto + ", descuento=" + descuento + ", fecha=" + fecha + ", cliente=" + cliente + ", plan=" + plan + '}';
    }
  
}
