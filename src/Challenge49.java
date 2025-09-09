public class Challenge49 {

    public static void main(String[] args){
        displayHighScore("Kenny", calculateHighscorePosition(1500));
        displayHighScore("Kosta", calculateHighscorePosition(1000));
        displayHighScore("Ivan", calculateHighscorePosition(500));
        displayHighScore("Nemanja", calculateHighscorePosition(100));
        displayHighScore("Jovan", calculateHighscorePosition(50));
    }


    public static void displayHighScore( String name,int position){
        System.out.println(name+" managed to get into position " + position +" on the high score list");
    }

    public static int calculateHighscorePosition(int score){
        if(score >= 1000){
            return 1;
        }else if (score>= 500 && score<1000){
            return 2;
        }else if (score>= 100 && score<500){
            return 3;
        }
            return 4;
    }






}
