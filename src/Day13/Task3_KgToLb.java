package Day13;
/*
 3. write a program that can convert Kg to lb
                MUST use Scanner
 */

import java.util.Scanner;

public class Task3_KgToLb {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
        System.out.println("Enter kg: ");
        double kg = input.nextDouble();
        double lb = kg * 2.2;
        System.out.println(kg + " is " + lb);


    }
}
