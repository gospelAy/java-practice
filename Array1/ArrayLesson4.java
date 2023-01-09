package Array1;

import java.util.Arrays;

public class ArrayLesson4 {
    public static void main(String[] args){

//          3, 34, 56, 23,
//          89, 98, 7, 9,
//          89, 34, 98, 5,

//
        int [][] numbers = new int[3][4];
        numbers[0][0] = 3;
        numbers[0][1] = 34;
        numbers[0][2] = 56;
        numbers[0][3] = 23;

        numbers[1][0] = 89;
        numbers[1][1] = 98;
        numbers[1][2] = 7;
        numbers[1][3] = 9;

        numbers[2][0] = 89;
        numbers[2][1] = 34;
        numbers[2][2] = 98;
        numbers[2][3] = 5;

        System.out.println(numbers[2][3] + " " + numbers[0][0] + " " + numbers[1][0]);


    }
}
