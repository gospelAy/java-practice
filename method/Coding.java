package method;

public class Coding {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
    }
    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("This number is Positive");
        }
        if (number < 0){
            System.out.println("The number is negative");
        }
        if (number == 0){
            System.out.println("zero");
        }
    }
}
