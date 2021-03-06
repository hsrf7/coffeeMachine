/*
A Concrete Beverage class, provides implementation to get the Ingridients
which is done in constructor itself to avoid creating another function to expose this functionality and avoid geting ingridients without creating a  new beverage.
*/
public class GingerTea extends Beverage {
        public GingerTea() {
                name = "ginger tea";
                
                IngridientFactory ingFac = new IngridientFactory();
                prepared &= ingFac.getIngridient("hot water", 50);
                prepared &= ingFac.getIngridient("hot milk", 10);
                prepared &= ingFac.getIngridient("tea syrup", 10);
                prepared &= ingFac.getIngridient("ginger syrup", 5);
                prepared &= ingFac.getIngridient("sugar syrup", 10);
        }
}
