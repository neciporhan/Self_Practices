package Day13;
/*
6. write a program that can display the selected browser
            1.1  declear a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary
 */
import java.util.Scanner;

public class Task6_SelectedBrowser {
    public static void main(String[] args) {

        String browserName = "safari";
        String result;
        switch (browserName) {
            case "chrome":
            case "firefox":
            case "opera":
            case "safari":
            case "edge":
                result = "valid browser " + browserName;
                break;
            default:
                result = "Invalid Browser Name" + browserName;
        }
        System.out.println(result);

    }
}
