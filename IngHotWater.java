/*
This is an implementation of a concrete ingridient this is made singelton because we have only one common place to access the ingridient in a machine
The quantity should be updated for the smae object by multiple outlets
*/
public class IngHotWater extends Ingridient{
    
    private static IngHotWater single_instance = null; 
  
    // private constructor restricted to this class itself 
    private IngHotWater(int quant) 
    { 
        quantity = quant; 
    } 
  
    // static method to create instance of class 
    public static IngHotWater getInstance(int quant) 
    { 
        if(single_instance == null) {
            single_instance = new IngHotWater(quant); 
        }
        
        return single_instance; 
    }

    public static IngHotWater getInstance() 
    {
        return single_instance; 
    } 

    public String toString()
    {
        return "hot water";
    }
}