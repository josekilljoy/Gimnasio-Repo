package Modelo;
//----------------------------------------------------------------------------------------------------------------
import java.util.ArrayList;
//----------------------------------------------------------------------------------------------------------------
public class Cliente extends Persona
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private char categoria;
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
    public Cliente(int codigo, char nombre, char apellido, int dni, char direccion, char categoria, int tel)
    {
        super(codigo, nombre, apellido, dni, direccion);
        this.categoria = categoria;
        this.tel = tel;   
    }
    //------------------------------------------------------------------------------------------------------------GET CATEGORIA
    public char getCategoria() 
    {
        return categoria;
    }
    //------------------------------------------------------------------------------------------------------------SET CATEGORIA
    public void setCategoria(char categoria) 
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
