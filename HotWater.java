/*
A Concrete Beverage class, provides implementation to get the Ingridients
which is done in constructor itself to avoid creating another function to expose this functionality and avoid geting ingridients without creating a  new beverage.
*/
public class HotWater extends Beverage{
    public HotWater() {
        name = "hot water";
        IngridientFactory ingFac = new IngridientFactory();
        prepared &= ingFac.getIngridient("hot water", 50);
    }
}