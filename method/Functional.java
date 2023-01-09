package method;

public class Functional {
    public static void main(String[] args) {
        System.out.println(calculateScore("Tem", 500));
    }
    public static int calculateScore(String playName, int score){
        System.out.println("player " + playName + " scored " + score + " points");
        return score * 1000;
    }
}
