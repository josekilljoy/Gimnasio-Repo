package Modelo;
//----------------------------------------------------------------------------------------------------------------
public class Persona 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private int codigo;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Persona(int codigo, String nombre, String apellido, int dni, String direccion) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }
    //------------------------------------------------------------------------------------------------------------GET CODIGO
    public int getCodigo()
    {
        return codigo;
    }
    //------------------------------------------------------------------------------------------------------------SET CODIGO
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    //------------------------------------------------------------------------------------------------------------GET NOMBRE
    public String getNombre() 
    {
        return nombre;
    }
    //------------------------------------------------------------------------------------------------------------SET NOMBRE
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    //------------------------------------------------------------------------------------------------------------GET APELLIDO
    public String getApellido() 
    {
        return apellido;
    }
    //------------------------------------------------------------------------------------------------------------SET APELLIDO
    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }
    //------------------------------------------------------------------------------------------------------------GET DNI
    public int getDni() 
    {
        return dni;
    }
    //------------------------------------------------------------------------------------------------------------SET DNI
    public void setDni(int dni) 
    {
        this.dni = dni;
    }
    //------------------------------------------------------------------------------------------------------------GET DIRECCION
    public String getDireccion() 
    {
        return direccion;
    }
    //------------------------------------------------------------------------------------------------------------SET DIRECCION
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    //------------------------------------------------------------------------------------------------------------TO STRING
    @Override
    public String toString() 
    {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + '}';
    }
}
