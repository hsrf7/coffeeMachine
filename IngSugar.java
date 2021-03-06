/*
This is an implementation of a concrete ingridient this is made singelton because we have only one common place to access the ingridient in a machine
The quantity should be updated for the smae object by multiple outlets
*/
public class IngSugar extends Ingridient{
     
    private static IngSugar single_instance = null; 
  
    // private constructor restricted to this class itself 
    private IngSugar(int quant) 
    { 
        quantity = quant; 
    } 
  
    // static method to create instance of class 
    public static IngSugar getInstance(int quant) 
    { 
        if(single_instance == null) {
            single_instance = new IngSugar(quant); 
        }
        
        return single_instance; 
    }

    public static IngSugar getInstance() 
    {
        return single_instance; 
    } 

    public String toString()
    {
        return "sugar syrup";
    }
}