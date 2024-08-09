public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(){
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }
    public void comments() {

//    public CoffeeMaker getCoffeeMaker() {
//        return coffeeMaker;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }

//    public Refrigerator getRefrigerator() {
//        return refrigerator;
//    }

        //    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
//        this.coffeeMaker = coffeeMaker;
//        this.dishWasher = dishWasher;
//        this.refrigerator = refrigerator;
//    }

//    public void addWater(){
//        coffeeMaker.setHasWorkToDo(true);
//    }
//    public void pourMilk(){
//        refrigerator.setHasWorkToDo(true);
//    }
//    public void loadDishwasher(){
//        dishWasher.setHasWorkToDo(true);
//    }
    }

    public void setKitchenState(boolean a,boolean b, boolean c){
        coffeeMaker.setHasWorkToDo(a);
        refrigerator.setHasWorkToDo(b);
        dishWasher.setHasWorkToDo(c);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }


}

class Refrigerator{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("ordering the food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("doing dishes");
            hasWorkToDo = false;
        }

    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("brewing coffee");
            hasWorkToDo = false;
        }

    }
}