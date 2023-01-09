package method;

public class MethodDisplayHigh {
    public static void main(String[] args){
        int highScorePosition =calculateScorePosition(1500);
        displayHighScorePosition("Grace ",highScorePosition);
         highScorePosition =calculateScorePosition(900);
        displayHighScorePosition("Spencer ",highScorePosition);
         highScorePosition =calculateScorePosition(400);
        displayHighScorePosition("Felix ",highScorePosition);
         highScorePosition =calculateScorePosition(50);
        displayHighScorePosition("Josh ",highScorePosition);



    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + "manage to get into position " + highScorePosition + "on the high score table: ");
    }
    public static int calculateScorePosition(int score){
        if (score > 1000){
            return 1;
        }
        if (score > 500 && score < 1000){
            return 2;
        }
        if (score > 100 && score < 500){
            return 3;
        }else {
            return 4;
        }

    }
}
