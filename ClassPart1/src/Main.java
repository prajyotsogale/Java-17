public class Main{
    public static void main(String[] args){
        Car car = new Car();
        //Private fields can't be accessible
//        car.make = "Tesla";
        car.setMake(null);
        car.setModel("911 GT RS");
        car.setColor("REEEDDD");
        car.setConvertible(true);
        car.setDoor(2);
//        car.model = "model x";
//        car.color = "Red";
//        car.door = 4;
//        car.convertible = true;   
        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());

        car.describeCar();



        Car targa = new Car();

        targa.setMake("Range Rover");
        targa.setModel("Velar");
        targa.setColor("White");
        targa.setConvertible(false);
        targa.setDoor(4);
        targa.describeCar();

    }
}