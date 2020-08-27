/*

This class is responsible to create/instantiate a beverage, whihc includes fetching the ingridients for the Beverage

*/
public class BeverageFactory {

	public Beverage createBeverage(String type) {
		Beverage beverage = null;

		if (type.equals("ginger tea")) {
			beverage = new GingerTea();
		} else if (type.equals("elaichi tea")) {
			beverage = new ElaichiTea();
		} else if (type.equals("coffee")) {
			beverage = new Coffee();
		} else if (type.equals("hot water")) {
			beverage = new HotWater();
		} else if (type.equals("hot milk")) {
			beverage = new HotMilk();
        }
		
		return beverage;
	}
}
