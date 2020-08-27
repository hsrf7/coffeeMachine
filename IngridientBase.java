/*

this is class is created to separate the functionality of creating implementing the subject interface from the Ingridient whihc handles more generic data for Ingridient
functionality:
1. Implement register Observer
2. Implement remove obserber
3. maintain a list of observers

Using a simple subject-observer pattern here 

*/
import java.util.*;

public abstract class IngridientBase implements Subject{
    protected ArrayList<Observer> observers;

	IngridientBase() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
}