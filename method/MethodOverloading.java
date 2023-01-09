package method;

public class MethodOverloading {
    public static void main(String[] args) {


    }
    public static int calculate(int number1, int number2){
        int result = number1 + number2;
        return result;
    }
    public static int calculate(int number1, int number2, int number3){
        int result = number1 + number2 + number3;
        return result;
    }

}