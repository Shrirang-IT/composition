public class CoffeeMaker {

    private boolean hasWorkToDo;

   // public CoffeeMaker(boolean hasWorkToDo){
     //   this.hasWorkToDo=hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    //}

    public void brewCoffee (){
        if (hasWorkToDo){
            System.out.println("Coffee is available");
        }
        else {
            System.out.println("Coffee is not available");
        }
    }
}
