public class OverLoading {

    public static void main(String[] args){
       int newScore = calculateScore("Kenny",10);
       System.out.println("New score is " + newScore);

       calculateScore(75);
    }

    public static int calculateScore(String playerName, int score){

        System.out.println("Player "+ playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score){

       return calculateScore("unknown player",score);

    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }



}
