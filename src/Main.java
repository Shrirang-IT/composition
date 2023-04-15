import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen =new SmartKitchen();
        Scanner sc=new Scanner(System.in);
        boolean  [] arr=new boolean[3];
      System.out.println("Please answer the following questionnaire");
      System.out.println("Do you want food");
      arr[0]=sc.nextBoolean();
        System.out.println( " Do you want coffee");
        arr[1]=sc.nextBoolean();
        System.out.println("Do you want to wash dishes");
        arr[2]=sc.nextBoolean();

        smartKitchen.setKitchen(arr[0],arr[1],arr[2]);
        smartKitchen.doKitchenWork();
    }
}
/*
    Please answer the following questionnaire
        Do you want food
        false
        Do you want coffee
        true
        Do you want to wash dishes
        true
        Food not available
        Coffee is available
        Dish washer available
*/