public class Car {
    private String make = "Range Rover";
    private String model = "Velar";
    private String color = "White";
    private int door = 4;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        //update the private string make, or assign the value of String make to the upper make
//        this.make = make;
        if(make == null){
            //this.make = make;
            make = "unknownn";
        }
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
            case "range rover", "mahindra", "porsche","tesla" -> this.make = make;
            default -> {
                this.make = "unsupportedd";
            }
        }
    }

    public void describeCar(){
        System.out.println(door+"-Doors "+
                    color+" "+
                make+" " +
                        model+" "+
                        (convertible?"Convertible" : " "));
    }
}
