// to print the table of a given content using for loop

import java.util.Scanner;
class forDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no * i);
        }
    }
}