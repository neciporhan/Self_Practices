package Day13;
/*
2. write a program that calculate the area of any given rectangle
                MUST use scanner

 */
import java.util.Scanner;

public class Task2_RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the height and width of the rectangle: ");
        double height = 6;
        double width = 8;
        double area = height * width;
        System.out.println("The area of the rectangle is: " +area);
    }
}
