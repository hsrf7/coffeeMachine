/*
Ingridient Class provides the base attribute/functionality for any concrete Ingridient
functionalities:
1. Quantity of Ingridient
2. getIngridient :- when a beverages asks for ingrideint the quantity gets reduced 
3. getQunatity :- revelals current qunatity of ingridient
4. refill :- add given amount to ingridient quantity
5. notifyObservers :- this is to notify the observers of the specific Ingridient regarding the change in the value, we use a simple observer pattern for this case.
					the implemntation of Subject Interface is handled by IngridientBase
*/
abstract public class Ingridient extends IngridientBase{
     
    protected int quantity; 

	// getIngridient :- when a beverages asks for ingrideint the quantity gets reduced, also notify the observers	
    public boolean getIngridient(int quant) 
    {
        if(quantity>=quant) {
            quantity -= quant;
            return true;
		}
		
		notifyObservers();

        return false; 
    }
	
	// get current quantity 
	public int getQuantity() {
		return quantity;
	}


	// re fill the quantity and notify to the observer
    public void reFill(int quant) {
		
		quantity += quant;
		
		notifyObservers();

	}
	
	public void notifyObservers() {
		boolean isLow = (quantity <= 50);
		for (Observer observer : observers) {
			observer.update(this.toString(), isLow);
		}
	}
}