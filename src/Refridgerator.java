public class Refridgerator {

    private boolean hasWorkToDo;

 //   public Refridgerator(boolean hasWorkToDo) {
   //     this.hasWorkToDo = hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    //}

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Food is available");
        }
        else {
            System.out.println("Food not available");
        }
    }
}
