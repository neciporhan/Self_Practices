package day06;
/*
task02:
            Create a class CompanyInfo
                Declare variables:
                            companyName
                            address
                            numberOfEmployees
                            revenue
                            isTechCompany
                Print statements and describe each value:
                                Company name is Facebook
                                address is ...
                                Number of employees is 100
                                Annual revenue is 4 000 000
                                is it tech company? - true

 */
public class CompanyInfo {
    public static void main(String[] args) {
        String companyName = "Facebook";
        String address = "4250 Messenger Loop NW Los Lunas, NM 87031";
        int numberOfEmployees = 100;
        int revenue = 4_000_000;
        boolean isTechCompany = true;

        System.out.println("Company name is "+companyName);
        System.out.println("Address is "+address);
        System.out.println("Number of employees is "+numberOfEmployees);
        System.out.println("Revenue is "+revenue);
        System.out.println("Is it tech company?- "+isTechCompany);


    }
}
