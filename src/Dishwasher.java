public class Dishwasher {

    private boolean hasWorkToDo;


    //public Dishwasher(boolean hasWorkToDo) {
      //  this.hasWorkToDo = hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    //}

    public void doDishers(){
        if(hasWorkToDo){
            System.out.println("Dish washer available");
        }
        else {
            System.out.println("Dish washer not available");
        }
    }
}
