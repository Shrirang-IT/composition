public class SmartKitchen {

    CoffeeMaker brewMaster;
    Dishwasher dishwasher;

    Refridgerator food;


   public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        this.dishwasher=new Dishwasher();
        this.food =new Refridgerator();
    }


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
