package Modelo;
//----------------------------------------------------------------------------------------------------------------
import java.util.ArrayList;
//----------------------------------------------------------------------------------------------------------------
public class Profesor extends Persona
{
    //------------------------------------------------------------------------------------------------------------ATRIBUTOS
    private ArrayList tel = new ArrayList();
    private boolean sustituto;
    
    
    
    /*
    NOTA:
    se podia agregar un atributo de
    arreglo de planes a los que el profesor esta a cargo
    */
    
    
    
    //------------------------------------------------------------------------------------------------------------CONSTRUCTOR
    public Profesor(int codigo, String nombre, String apellido, int dni, String direccion, boolean sustituto) 
    {
        super(codigo, nombre, apellido, dni, direccion);
        this.sustituto = sustituto;
    }
    //------------------------------------------------------------------------------------------------------------GET TEL
    public ArrayList getTel() 
    {
        return tel;
    }
    //------------------------------------------------------------------------------------------------------------SET TEL
    public void setTel(ArrayList tel) 
    {
        this.tel = tel;
    }
    //------------------------------------------------------------------------------------------------------------IS SUSTITUTO
    public boolean isSustituto() 
    {
        return sustituto;
    }
    //------------------------------------------------------------------------------------------------------------SET SUSTITUTO
    public void setSustituto(boolean sustituto) 
    {
        this.sustituto = sustituto;
    }
    //------------------------------------------------------------------------------------------------------------TO STRING
    @Override
    public String toString() 
    {
        return "Profesor{" + "tel=" + tel + ", sustituto=" + sustituto + '}';
    }
}
