package Day13;
/*
 5. write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
                MUST use Scanner
 */
import java.util.Scanner;

public class Task5_StateTaxFederalTaxSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the annual salary here: ");
        double annualSalary = input.nextDouble();

        System.out.println("Please enter the annual state tax rate here: ");
        double annualStateTaxRate = input.nextDouble();

        System.out.println("Please enter the annual federal tax rate here: ");
        double annualFederalTaxRate = input.nextDouble();

        double totalTax = annualSalary*(annualFederalTaxRate) / 100;
        double annualSalaryAfterTax = annualSalary -totalTax;
        System.out.println("Salary after tax is: "+annualSalaryAfterTax);
    }
}


