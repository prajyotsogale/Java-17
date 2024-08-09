public class ChallengeOverloaded {
    public static void main(String[] args){

        //double value = calculateToCentimeters(5,8);
        System.out.println(calculateToCentimeters(5,8));
        System.out.println(calculateToCentimeters(68));
    }
    public static double calculateToCentimeters(int heightInInches){
        // inch = 2.54 cm
        //this gives inch*2.54
        //double convertToDouble = (double) (heightInInches);
        //return convertToDouble*2.54;
        return heightInInches*2.54;
    }

    public static double calculateToCentimeters(int heightInFeet, int heightInInches){
        //int feetIntoInches = heightInFeet*12;
        int totalSum = (heightInFeet*12) + heightInInches;
        return calculateToCentimeters(totalSum);

    }

}
