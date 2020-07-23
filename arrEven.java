// To sum the even terms of an array
import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
public class arrEven {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int[] arr = new int[] {
            1,2,3,4,5,6,7,8,9,10
        };
        // int s = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // int arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                sum = arr[i] + sum;
            }
        }
        System.out.println("Sum of Even terms in array is: " + sum);
    }
}