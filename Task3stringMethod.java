// same as task 2 but print using a method called void display(String input)
import java.util.Scanner;
public class Task3stringMethod {
    void display(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            System.out.println(inputString.charAt(i));
            if (i != inputString.length() - 1) {
                System.out.println(", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println("input: " + input);
        Task3stringMethod obj = new Task3stringMethod();
        obj.display(input);
    }
}