public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

//        smartKitchen.getRefrigerator().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//        smartKitchen.getCoffeeMaker().setHasWorkToDo(true);
//
//        smartKitchen.getCoffeeMaker().brewCoffee();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getRefrigerator().orderFood();

        smartKitchen.setKitchenState(true,true,false);
        smartKitchen.doKitchenWork();
    }
}