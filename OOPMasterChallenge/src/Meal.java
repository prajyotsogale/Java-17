public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal(){
        burger = new Burger();
        drink = new Drink();
        sideItem = new SideItem();
    }

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public Meal(String burgerType, int burgerPrice, String drinkType, String drinkSize, String sideItemType, int sideItemPrice) {
        this.burger = new Burger(burgerType, burgerPrice);
        this.drink = new Drink(drinkType,drinkSize);
        this.sideItem = new SideItem(sideItemType,sideItemPrice);
    }
    public void addToppings(int num){
        burger.extraToppings = num;
    }
    public void changeSizeofDrink(String size){
        drink.size = size;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                '}';
    }
}
class Drink{
    private String type;
    protected String size;
    private int price;

    public Drink() {
        this("Cola","small");
    }
    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        
        if(size.toUpperCase() == "small"){
            this.price = 35;
        } else if (size.toLowerCase()=="medium") {
            this.price = 50;
        } else if (size.toLowerCase() == "large") {
            this.price = 75;
        }else if(size.toLowerCase() == "extra small"){
            this.price = 100;
        }
        else{
            this.price = 35;
        }
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

class SideItem{
    private String type;
    private int price;

    public SideItem() {
        this("fries",10);
    }

    public SideItem(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
class Burger{
    private String type;
    private int basePrice;
    protected int extraToppings;

    public Burger() {
        this("Regular burger",35);
    }

    public Burger(String type, int basePrice) {
        this.type = type;
        this.basePrice = basePrice;
        if(basePrice<35){
            extraToppings = 1;
        }else if(basePrice<50){
            extraToppings = 2;
        }else{
            extraToppings = 3;
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", basePrice=" + basePrice +
                ", extraToppings=" + extraToppings +
                '}';
    }
}

class DeluxBurger extends Burger{

    public DeluxBurger(String type, int basePrice,int extraToppings) {
        super(type, basePrice);
        if(extraToppings>=5){
            extraToppings = 5;
        }
        super.extraToppings = extraToppings;
    }
}
