package Day13;
/*
Warmup tasks:
    1. write a program that can calculate the area of any given circle
                MUST use Scanner

 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1_CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius of the circle in cm: ");
        double radius = input.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is: " +area );

    }
}
