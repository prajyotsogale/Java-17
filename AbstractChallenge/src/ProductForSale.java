public abstract class ProductForSale {

    private String type;
    private double price;
    private String description;

    public double getSalePrice(int quantity){
        return quantity*price;
    }
    public void printPricedItem(int quantity){
        System.out.println(type + " x "+quantity+ " " +getSalePrice(quantity));
    }
    
}
