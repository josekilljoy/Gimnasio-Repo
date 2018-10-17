package Modelo;
//----------------------------------------------------------------------------------------------------------------
public class Ejercicios 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private int codigo;
    private char nombre;
     
    
    
    /*
    NOTA:
    se podia agregar un atributo de
    arreglo de planes en donde esta ese ejercicio
    */
    
    
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Ejercicios(int codigo, char nombre) 
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
    public char getNombre() 
    {
        return nombre;
    }
    //------------------------------------------------------------------------------------------------------------SET NOMBRE
    public void setNombre(char nombre) 
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
