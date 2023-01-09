package Array1;

import java.sql.SQLOutput;

public class ArrayLessonOne {
    public static void main(String[] args){
        int[] age = new int[5];
        double[] height = {2.40, 23.89, 89.34, 98.9, 94.0};
//        height[0] = 5.3;
//        height[1] = 8.9;
//        height[2] = 67.9;
//        height[3] = 89.9;
//        height[4] = 98.0;
        System.out.println("The first child height is " + height[0]);
        System.out.println("The second child height is " + height[1]);
        System.out.println("The third child height is " + height[2]);
        System.out.println("The fourth child height is " + height[3]);
        System.out.println("The fifth child height is " + height[4]);




        age[0] = 4;
        age[1] = 6;
        age[2] = 7;
        age[3] = 8;
        age[4] = 9;

        System.out.println("\n\nThe fist child age is " + age[0]);
        System.out.println("The second child age is " + age[1]);
        System.out.println("The third child age is " + age[2]);
        System.out.println("The fourth child age is " + age[3]);
        System.out.println("the fifth child age is " + age[4]);
    }
}
