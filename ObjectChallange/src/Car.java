public class Car {
    private String modelName;
    private int chasisNumber;
    private boolean insurance;
    private String numberPlate;

    public Car(){
        this("No Name",99999, false, "MH48999999");
        System.out.println("empty constructor called");
    }
    public Car(String modelName, int chasisNumber, boolean insurance, String numberPlate ){
        System.out.println("Constructor with all parameters called ");
        this.modelName = modelName;
        this.chasisNumber = chasisNumber;
        this.insurance = insurance;
        this.numberPlate = numberPlate;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(int chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
