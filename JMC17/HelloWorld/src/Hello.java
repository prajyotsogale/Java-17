public class Hello {
    public static void main(String[] args){
        java.lang.System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            java.lang.System.out.println("It is not an alien");
            java.lang.System.out.println("And I am scared od Aliens");
        }

        int topScore = 80;
        if (topScore >= 100){
            java.lang.System.out.println("You got the high score!!");
        }


        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore<100){
            java.lang.System.out.println("Greater than second top score and less than 100");
            //logical and operator
            //both the conditions needs to be true
            //it works on boolean operands - Checking the conditions are true or false
            /*
            if ((topScore > secondTopScore) && (topScore<100))
            you can also write like this to improve the readability
             */
        }



        if((topScore > 90) || (secondTopScore <=90)){
            System.out.println("Either or both of the statements are true");

            // || is the logical or operator
            // any one of the condition needs to be true
            //it also works on boolean operands
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("this is equal equal or comparison operator");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("Another value is assigned to it!");
        }

        //if we use the assignment operator java will assign the value to it instead of checking it
//        if(isCar = true){
//            System.out.println("Another value is assigned to it!");
//        }
        //instead of using
        //                      if(isCar == true)
        //    we can also use    if(isCar)
        //which is a valid shortcut in java

        //also instead of if(isCar != true)  we can use if(!isCar)

        //the exclamation mark (!), or NOT operator, is also known as
        //Logical Compliment Operator


        //Ternary operator
        //variable = Expression1 ? Expression2: Expression3
        //means
//        if(Expression1){
//            variable = Expression2;
//        }
//        else{
//            variable = Expression3;
//        }

        String makeOfCar = "Mahindra";
        boolean isDomestic = makeOfCar == "Mahindra"? true : false;
        if(isDomestic){
            System.out.println("This car is domestic");
        }

        int discSpace = 64;
        String spaceComment = discSpace >= 64 ? "Managable" :"OUTDATED!!";
        System.out.println("The Disc is " + spaceComment);

        //much simpler way to write the code
        //boolean isDomestic = (makeOfCar != "Mahindra");

        String s = (isDomestic) ? "This car is domestic ":"This car is not domestic";
        System.out.println(s);

        //Note: see    java summery of operators
        //More important :
        //Search for
        //      Java Operator Precedence Table



        //Problem solving

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double addedVar = (firstDouble + secondDouble)*100.00 ;
        double remVar = addedVar%40.00;
        boolean remRes = remVar == 0.00?true:false;
        System.out.println(remRes);

        if(!remRes){
            System.out.println("Got some remainder");
        }

        //my mistakes
        //forget to add d at ending of double



    }
}
