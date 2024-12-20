public class MainChallenge {
    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        int highScore = calculateScore(gameOver,score, levelCompleted,bonus);
        System.out.println("The final Score is "+highScore);

        System.out.println("The next value is "+ calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted,
                                      int bonus)
    {
        int finalScore = score;

        if (gameOver) {
            //which is equal to gameOver == true
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
        //Return Statement should be at the end

    }
}
