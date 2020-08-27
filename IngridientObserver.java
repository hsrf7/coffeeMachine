/*
This class observes the ingridient quantity and provides the medium to reFill the Ingrideint from the main interaction class i.e. ChaiPoint
This class implements Observer interface
*/


import java.util.*;

public class IngridientObserver implements Observer {

	private ArrayList<String> lowIngridients;
	private IngridientFactory ingridientFactory;

	// intialize the quantites of the ingridients
	public IngridientObserver() {
		ingridientFactory = new IngridientFactory();

		Subject ingCoffee 	= ingridientFactory.getIngridientInstance("coffee syrup", 500);
		ingCoffee.registerObserver(this);
		Subject ingElaichi 	= ingridientFactory.getIngridientInstance("elaichi syrup", 500);
		ingElaichi.registerObserver(this);
		Subject ingGinger 	= ingridientFactory.getIngridientInstance("ginger syrup", 500);
		ingGinger.registerObserver(this);
		Subject ingHotMilk 	= ingridientFactory.getIngridientInstance("hot milk", 500);
		ingHotMilk.registerObserver(this);
		Subject ingHotWater = ingridientFactory.getIngridientInstance("hot water", 500);
		ingHotWater.registerObserver(this);
		Subject ingSugar 	= ingridientFactory.getIngridientInstance("sugar syrup", 500);
		ingSugar.registerObserver(this);
		Subject ingTea 		= ingridientFactory.getIngridientInstance("tea syrup", 500);	
		ingTea.registerObserver(this);

		lowIngridients = new ArrayList<String>();
	}

	// update the list of low ingridients
	public void update(String str, boolean bool) {
		String ingridientName = str;
		boolean isLow = bool;

		if(isLow && lowIngridients.contains(ingridientName) == false)
			lowIngridients.add(ingridientName);
		else if(!isLow && lowIngridients.contains(ingridientName))
			lowIngridients.remove(ingridientName);

	}

	// re fill an ingridient
	public void reFill(String str, int quant)
	{
		ingridientFactory.reFillIngridient(str, quant);
	}
	
	// provide list of low ingridients
	public StringBuffer displayLowIngridients() {

		StringBuffer sb = new StringBuffer();
		sb.append("These are running low \n");
		for(String m: lowIngridients){   
				sb.append(m + '\n');
		}
		return sb;
	}
}
