import java.util.Scanner;

// implement string methods
// task 1:
//  To print the length of input string, accept the input string from user
import java.util.Scanner;
class stringMethod {
    public static void main(String[] args) {
        String str = "hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println("String is : " + input);
        int len = input.length();
        System.out.println("Total number in inputted string is: " + len);
    }
}