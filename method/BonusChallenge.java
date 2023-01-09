package method;

public class BonusChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }
    private static String getDurationString(long minute, long seconds ){
        if ((minute < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid value";
        }
        long hours = minute / 60;
        long remainingMinutes = minute % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
    private  static  String getDurationString(long seconds){
        if (seconds < 0){
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return  getDurationString(minutes, remainingSeconds);
    }
}
