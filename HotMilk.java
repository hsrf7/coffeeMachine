/*
A Concrete Beverage class, provides implementation to get the Ingridients
which is done in constructor itself to avoid creating another function to expose this functionality and avoid geting ingridients without creating a  new beverage.
*/
public class HotMilk extends Beverage{
    public HotMilk() {
        name = "hot milk";
        IngridientFactory ingFac = new IngridientFactory();
        prepared &= ingFac.getIngridient("hot milk", 50);
    }
}