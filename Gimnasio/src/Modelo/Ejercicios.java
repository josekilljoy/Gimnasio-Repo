package Modelo;
//----------------------------------------------------------------------------------------------------------------
public class Ejercicios 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private int codigo;
    private String nombre;
     
    
    
    /*
    NOTA:
    se podia agregar un atributo de
    arreglo de planes en donde esta ese ejercicio
    */
    
    
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Ejercicios(int codigo, String nombre) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
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
    //------------------------------------------------------------------------------------------------------------TO STRING
    @Override
    public String toString() 
    {
        return "Ejercicios{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
}
