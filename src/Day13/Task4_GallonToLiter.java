package Day13;
/*
4. write a program that can convert gallons to litters
                MUST use scanner

 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task4_GallonToLiter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount of gallon here: ");
        double gallon = input.nextDouble();
        double liter = gallon * 3.7854;
        System.out.println("One gallon is: " +liter);
    }
}
