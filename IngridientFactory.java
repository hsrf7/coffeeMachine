/*
The role of this class is to expose the functionality to create ingridient instance, get an already created instance and re fill an ingridient
This makes Ingridient and Ingridients loosely coupled and hides the implementation details from the client classes.
*/
public class IngridientFactory {

	public Ingridient getIngridientInstance(String type) {
		Ingridient ingridient = null;

		if (type.equals("hot water")) {
            ingridient =  IngHotWater.getInstance();
		} else if (type.equals("hot milk")) {
			ingridient = IngHotMilk.getInstance();
		} else if (type.equals("coffee syrup")) {
			ingridient = IngCoffee.getInstance();
		} else if (type.equals("elaichi syrup")) {
			ingridient = IngElaichi.getInstance();
		} else if (type.equals("ginger syrup")) {
			ingridient = IngGinger.getInstance();
        } else if (type.equals("tea syrup")) {
			ingridient = IngTea.getInstance();
        } else if (type.equals("sugar syrup")) {
			ingridient = IngSugar.getInstance();
        }

        return ingridient;
    }

    public Ingridient getIngridientInstance(String type, int quant) {
		Ingridient ingridient = null;

		if (type.equals("hot water")) {
            ingridient =  IngHotWater.getInstance(quant);
		} else if (type.equals("hot milk")) {
			ingridient = IngHotMilk.getInstance(quant);
		} else if (type.equals("coffee syrup")) {
			ingridient = IngCoffee.getInstance(quant);
		} else if (type.equals("elaichi syrup")) {
			ingridient = IngElaichi.getInstance(quant);
		} else if (type.equals("ginger syrup")) {
			ingridient = IngGinger.getInstance(quant);
        } else if (type.equals("tea syrup")) {
			ingridient = IngTea.getInstance(quant);
        } else if (type.equals("sugar syrup")) {
			ingridient = IngSugar.getInstance(quant);
        }

        return ingridient;
    }
    
    public boolean getIngridient(String type, int quantity) {
        Ingridient ing = getIngridientInstance(type);

        if(ing.getIngridient(quantity))
            return true;
        else 
            return false;
    }

    public void reFillIngridient(String type, int quantity) {
        Ingridient ing = getIngridientInstance(type);
        ing.reFill(quantity);
    }

}
