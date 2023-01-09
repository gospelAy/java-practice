package Bike;

import java.util.Scanner;

public class TriangleArea {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Prompt the user to enter the three points of the triangle
            System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            // Compute the three sides of the triangle
            double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
            double side3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

            // Compute the semi-perimeter of the triangle
            double s = (side1 + side2 + side3) / 2;

            // Compute the area of the triangle
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

            // Display the result
            System.out.println("The area of the triangle is " + area);
        }
    }


