public class PersonalComputer extends Product{
    private Moniter moniter;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Moniter moniter, Motherboard motherboard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.moniter = moniter;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }
    private void drawLogo(){
        moniter.drawPixelAt(1200,50,"blue");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public Moniter getMoniter() {
//        return moniter;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
}
