package Modelo;
//----------------------------------------------------------------------------------------------------------------
import java.util.ArrayList;
//----------------------------------------------------------------------------------------------------------------
public class Plan 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private int codigo;
    private char nombre;
    private float horasSemanales;
    private char dias;
    private float abono;
    private char dedicacion;
    private ArrayList ejercicios = new ArrayList<Ejercicios>();
    
    
    
    /*
    NOTA:
    se podia agregar un atributo de
    arreglo de profesores que estan acargdo del plan
    arreglo de asistencias de los clientes que han asistido
    arreglo de cuotas que los clientes han pagado por ese plan
    */
    
    
    
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Plan(int codigo, char nombre, float horasSemanales, char dias, float abono, char dedicacion) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        this.dias = dias;
        this.abono = abono;
        this.dedicacion = dedicacion;
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
    //------------------------------------------------------------------------------------------------------------GET HORAS SEMANALES
    public float getHorasSemanales() 
    {
        return horasSemanales;
    }   
    //------------------------------------------------------------------------------------------------------------SET HORAS SEMANALES
    public void setHorasSemanales(float horasSemanales) 
    {
        this.horasSemanales = horasSemanales;
    }
    //------------------------------------------------------------------------------------------------------------GET DIAS
    public char getDias() 
    {
        return dias;
    }
    //------------------------------------------------------------------------------------------------------------SET DIAS
    public void setDias(char dias) 
    {
        this.dias = dias;
    }
    //------------------------------------------------------------------------------------------------------------GET ABONO
    public float getAbono() 
    {
        return abono;
    }
    //------------------------------------------------------------------------------------------------------------SET ABONO
    public void setAbono(float abono) 
    {
        this.abono = abono;
    }
    //------------------------------------------------------------------------------------------------------------GET DEDICACION
    public char getDedicacion() 
    {
        return dedicacion;
    }
    //------------------------------------------------------------------------------------------------------------SET DEDICACION
    public void setDedicacion(char dedicacion) 
    {
        this.dedicacion = dedicacion;
    }
    //------------------------------------------------------------------------------------------------------------GET EJERCICIOS
    public ArrayList getEjercicios()
    {
        return ejercicios;
    }
    //------------------------------------------------------------------------------------------------------------SET EJERCICIOS
    public void setEjercicios(ArrayList ejercicios) 
    {
        this.ejercicios = ejercicios;
    }
    //------------------------------------------------------------------------------------------------------------TO STRING
    @Override
    public String toString() 
    {
        return "Plan{" + "codigo=" + codigo + ", nombre=" + nombre + ", horasSemanales=" + horasSemanales + ", dias=" + dias + ", abono=" + abono + ", dedicacion=" + dedicacion + ", ejercicios=" + ejercicios + '}';
    }
}
