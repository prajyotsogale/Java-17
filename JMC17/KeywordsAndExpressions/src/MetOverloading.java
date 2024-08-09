public class MetOverloading {
    public static void main(String[] args){
        int newScore = calculateScore("Prajyot",50);
        System.out.println(newScore);
        calculateScore(400);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println(" Player "+playerName+" scored "+score+" score ");
        return score+1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored "+score+" score ");
        return score+1000;
    }

    public static void calculateScore(){
        System.out.println("Unnamed Player scored has no score ");

    }
//    public static int calculateScore(){
//        System.out.println("Unnamed Player scored has no score ");
//          //error
//    }
}
