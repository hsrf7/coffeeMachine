/*
This class defines an abstract Beverage type to define a concrete beverage one needs to inherit this class
The class provides below functionalities 
1. serve :- this is to make and serve the beverage, since, here we assume all beverages take same time so this is a common
2. prepare :- this flag is to set if beverage can be made.
*/
abstract public class Beverage {

	boolean prepared = true;
    String name;

	public String serve() {
		if(prepared)
			return ("Serving " + name);
		else
			return ("Cannot Prepare Beverage " + name);
	}

	public String toString() {
       return name;
	}
}