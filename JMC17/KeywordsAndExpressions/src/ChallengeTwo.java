public class ChallengeTwo {
    public static void main(String[] args){
        //String pName = "Prajyot";
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Prajyot",highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Prajyot",highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Prajyot",highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Prajyot",highScore);

        highScore = calculateHighScorePosition(25);
        displayHighScorePosition("Prajyot",highScore);

    }
    public static void displayHighScorePosition(String pName, int playPosition){
        System.out.println(pName+ " has managed to get position "+ playPosition +" on the high score list ");
    }
    public static int calculateHighScorePosition(int pScore){
        //int result = 0;
        if(pScore >= 1000){
            return 1;
        }
        else if(pScore >= 500){
            return 2;
        }
        else if(pScore >= 100){
            return 3;
        }

        return 4;
    }

    //mistake 1 - check the exact numbers
    //always look the
}
