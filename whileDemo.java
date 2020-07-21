// to print the palindrome using while loop in java
import java.util.Scanner;
class whileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = sc.nextInt();
        int reverse = 0;
        while (no!=0) {
            int digit = no % 10;
            System.out.println(digit + ',');
            // System.out.println(',');
            reverse = reverse * 10 + digit;
            no = no / 10;
        }
    }
    
}