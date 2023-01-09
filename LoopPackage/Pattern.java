package LoopPackage;

public class Pattern {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(8);
        pattern3(5);
        pattern4(5);
    }
    private static void pattern1(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int number) {
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int number){
        for (int i = number; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}
