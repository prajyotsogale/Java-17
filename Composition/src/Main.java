public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2202","Dell",
                "450");
        Moniter themoniter = new Moniter("24 inch lg ultragear","LG",24,"" +
                "2540x2345");
        Motherboard theMotherboard = new Motherboard("Galax ldu","Galax",
                4,2,"v2,44");

        PersonalComputer thepc = new PersonalComputer("2202",
                "Dell",themoniter,theMotherboard,theCase);


//        thepc.getMoniter().drawPixelAt(5,7,"red");
//        thepc.getComputerCase().pressPowerButton();
//        thepc.getMotherboard().loadProgram("Windows os");

        thepc.powerUp();

    }
}
