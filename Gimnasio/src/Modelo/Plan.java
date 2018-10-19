package Modelo;
//----------------------------------------------------------------------------------------------------------------
import java.util.ArrayList;
//----------------------------------------------------------------------------------------------------------------
public class Plan 
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private int codigo;
    private String nombre;
    private float horasSemanales;
    private String dias;
    private float abono;
    private String dedicacion;
    private ArrayList ejercicios = new ArrayList<Ejercicios>();
    
    
    
    /*
    NOTA:
    se podia agregar un atributo de
    arreglo de profesores que estan acargdo del plan
    arreglo de asistencias de los clientes que han asistido
    arreglo de cuotas que los clientes han pagado por ese plan
    */
    
    
    
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Plan(int codigo, String nombre, float horasSemanales, String dias, float abono, String dedicacion) 
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
    public String getNombre() 
    {
        return nombre;
    }
    //------------------------------------------------------------------------------------------------------------SET NOMBRE
    public void setNombre(String nombre) 
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
    public String getDias() 
    {
        return dias;
    }
    //------------------------------------------------------------------------------------------------------------SET DIAS
    public void setDias(String dias) 
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
    public String getDedicacion() 
    {
        return dedicacion;
    }
    //------------------------------------------------------------------------------------------------------------SET DEDICACION
    public void setDedicacion(String dedicacion) 
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
