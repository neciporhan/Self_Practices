package day09_Tasks;
/*warmup tasks:

    1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
    4. write a java program that can identify if a person is eligible to buy alcohol
 */
public class WarmUpTasks_Extra {
    public static void main(String[] args) {
        //1.
        int number = 0;
        int number1 =1;
        int number2 = 2;

        if(number2>number1 && number2> number){
            System.out.println(number2+" is the maximum number");
        }
        //2.
        if(number< number1 && number< number2){
            System.out.println(number+" is the minimum number");
        }
        //3.
        if(number1>number && number1< number2){
            System.out.println(number2+" is the medium number");
        }
        //4.
        int age = 20;

        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }
        if(age<=21){
            System.out.println("You are NOT eligible to buy alcohol");
        }

    }
}
