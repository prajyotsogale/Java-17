//public class Car {
//    private String description;
//
//
//
//    public void startEngine(){
//        System.out.println(" Engine started");
//    }
//    public void drive(){
//        runEngine();
//    }
//    protected void runEngine(){
//        System.out.println("Running Engine!!");
//    }
//}
//
//class GasPoweredCar extends Car{
//    private double avgKmPerLitre;
//    private int cylinders;
//
//    public GasPoweredCar(double avgKmPerLitre, int cylinders){
//        this.avgKmPerLitre = avgKmPerLitre;
//        this.cylinders = cylinders;
//    }
//
//    @Override
//    public void startEngine() {
//        super.startEngine();
//    }
//
//    @Override
//    public void drive() {
//        super.drive();
//    }
//}
//
//class ElectricCar extends Car{
//    private double avgKmPerCharge;
//    private int batterySize;
//
//    public ElectricCar(double avgKmPerCharge, int batterySize) {
//        this.avgKmPerCharge = avgKmPerCharge;
//        this.batterySize = batterySize;
//    }
//
//    @Override
//    public void drive() {
//        System.out.println("Driving an electric car");
//    }
//}
//
//class HybridCar extends Car{
//    private double avgKmPerLitre;
//    private int batterySize;
//    private int cylinders;
//
//    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
//        this.avgKmPerLitre = avgKmPerLitre;
//        this.batterySize = batterySize;
//        this.cylinders = cylinders;
//    }
//
//    @Override
//    public void startEngine() {
//        super.startEngine();
//    }
//
//    @Override
//    public void drive() {
//        super.drive();
//    }
//}

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }
    public void startEngine(){
        System.out.println(this.getClass().getSimpleName()+" -> startEngine()");
    }
    public void accelerate(){
        System.out.println(this.getClass().getSimpleName()+" -> accelerate()");
    }
    public void brake(){
        System.out.println(this.getClass().getSimpleName()+" -> brake()");
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
}
class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public void startEngine(){
        System.out.println(this.getClass().getSimpleName()+" -> startEngine()");
    }
    @Override
    public void accelerate(){
        System.out.println(this.getClass().getSimpleName()+" -> accelerate()");
    }
    @Override
    public void brake(){
        System.out.println(this.getClass().getSimpleName()+" -> brake()");
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public void startEngine(){
        System.out.println(this.getClass().getSimpleName()+" -> startEngine()");
    }
    @Override
    public void accelerate(){
        System.out.println(this.getClass().getSimpleName()+" -> accelerate()");
    }
    @Override
    public void brake(){
        System.out.println(this.getClass().getSimpleName()+" -> brake()");
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public void startEngine(){
        System.out.println(this.getClass().getSimpleName()+" -> startEngine()");
    }
    @Override
    public void accelerate(){
        System.out.println(this.getClass().getSimpleName()+" -> accelerate()");
    }
    @Override
    public void brake(){
        System.out.println(this.getClass().getSimpleName()+" -> brake()");
    }
}