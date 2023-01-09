package LoopPackage;

public class Even {
    public static void main(String[] args) {
        isEvenNumber(9);
    }

    public static void isEvenNumber(int number){
        if (number % 2 == 0){
            System.out.println("True");
        }else System.out.println("False");
    }
}
