public class Main {
    public static void main(String[] args){
    int hightScore = calculateScore(true,10000,8,200);
    System.out.println(hightScore);
//    boolean gameOver = true;
//    int score = 10000;
//    int levelCompleted = 8;
//    int bonus = 200;
//    int finalScore = score;
//
//    if (gameOver  == true){
//        finalScore += (levelCompleted *bonus);
//        System.out.println("Your final score was " + finalScore);
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus){
//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
        int finalScore = score;

        if (gameOver == true){
            finalScore += (levelCompleted *bonus);
            finalScore += 1000;
        }

        return finalScore;
    }


}
