package Modelo;
//----------------------------------------------------------------------------------------------------------------
public class Persona 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private int codigo;
    private char nombre;
    private char apellido;
    private int dni;
    private char direccion;
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Persona(int codigo, char nombre, char apellido, int dni, char direccion) 
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
    public char getNombre() 
    {
        return nombre;
    }
    //------------------------------------------------------------------------------------------------------------SET NOMBRE
    public void setNombre(char nombre) 
    {
        this.nombre = nombre;
    }
    //------------------------------------------------------------------------------------------------------------GET APELLIDO
    public char getApellido() 
    {
        return apellido;
    }
    //------------------------------------------------------------------------------------------------------------SET APELLIDO
    public void setApellido(char apellido) 
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
    public char getDireccion() 
    {
        return direccion;
    }
    //------------------------------------------------------------------------------------------------------------SET DIRECCION
    public void setDireccion(char direccion) 
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
