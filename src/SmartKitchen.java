public class SmartKitchen {

    CoffeeMaker brewMaster=new CoffeeMaker();
    Dishwasher dishwasher=new Dishwasher();

    Refridgerator food=new Refridgerator();


  /*  public SmartKitchen(CoffeeMaker brewMaster, Dishwasher dishwasher, Refridgerator food) {
        this.brewMaster = brewMaster;
        this.dishwasher = dishwasher;
        this.food = food;
    }
*/

    public void addWater(){
        food.orderFood();
    }

    public void pourMilk(){
        brewMaster.brewCoffee();
    }

    public void loadDiswasher()
    {
        dishwasher.doDishers();
    }

    public void setKitchen(boolean r,boolean c,boolean d){
        food.setHasWorkToDo(r);
        brewMaster.setHasWorkToDo(c);
        dishwasher.setHasWorkToDo(d);
    }

    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDiswasher();
    }


}
