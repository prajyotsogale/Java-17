public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.println(getExplicitType()+"walking");
        }else{
            System.out.println(getExplicitType()+"running");
        }

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType()+" sheds hair all the time");
    }

    @Override
    public void makeNoise() {
        if(type ==  "wolf"){
            System.out.println("barking");

        }else {
            System.out.println("woff");
        }
    }
}
