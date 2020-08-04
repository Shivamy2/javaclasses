import java.util.Scanner;

// print like this:
// input: Hello World
// ? output: H, e, l, l, o,  , W, o, r, l, d
import java.util.Scanner;
public class Task2stringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println("input: " + input);
        // print chars of String using charAt()
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            if (i != input.length() - 1) {
                
            }
            System.out.println(", ");
        }
    }
}