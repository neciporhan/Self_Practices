package day09_Tasks;
/* Task01:
     write a program that can check if number is positive negative or equals to zero.
        for example:
            num  = 1
            prints:
                1 is positive number
            num = -6
            print:
                6 is negative number
            num = 0
            print:
                zero

 */

public class warmUpTask1_PositiveNegativeZero {
    public static void main(String[] args) {
        int num =1;


        if(num>=1){
            System.out.println("is positive number");
        }
        if(num<0){
            System.out.println("is negative number");
        }
        if(num==0){
            System.out.println("zero");
        }

    }
}
