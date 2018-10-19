package Modelo;
//----------------------------------------------------------------------------------------------------------------
import java.util.ArrayList;
//----------------------------------------------------------------------------------------------------------------
public class Cliente extends Persona
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private String categoria;
    private int tel;
    private ArrayList telEmer = new ArrayList();
    
    
    
    /*
    NOTA:
    se podia agregar un atributo de
    arreglo de inscripciones por cada vez que se inscribio
    arreglo de asistencias de cada vez que accede a una clase
    arreglo de cuotas que pago
    */
    
    

    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Cliente(int codigo, String nombre, String apellido, int dni, String direccion, String categoria, int tel)
    {
        super(codigo, nombre, apellido, dni, direccion);
        this.categoria = categoria;
        this.tel = tel;   
    }
    //------------------------------------------------------------------------------------------------------------GET CATEGORIA
    public String getCategoria() 
    {
        return categoria;
    }
    //------------------------------------------------------------------------------------------------------------SET CATEGORIA
    public void setCategoria(String categoria) 
    {  
        this.categoria = categoria;
    }
    //------------------------------------------------------------------------------------------------------------GET TEL
    public int getTel() 
    {
        return tel;
    }
    //------------------------------------------------------------------------------------------------------------SET TEL
    public void setTel(int tel) 
    {
        this.tel = tel;
    }
    //------------------------------------------------------------------------------------------------------------GET TELEMER
    public ArrayList getTelEmer() 
    {
        return telEmer;
    }
    //------------------------------------------------------------------------------------------------------------SET TELEMER
    public void setTelEmer(ArrayList telEmer) 
    {
        this.telEmer = telEmer;
    }
    //------------------------------------------------------------------------------------------------------------TO STRING
    @Override
    public String toString() 
    {
        return "Cliente{" + "categoria=" + categoria + ", tel=" + tel + ", telEmer=" + telEmer + '}';
    }
}
