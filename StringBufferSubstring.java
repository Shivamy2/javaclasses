import java.util.Scanner;

/**
 * Getting the substring of a stringBuffer
 */
public class StringBufferSubstring {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position string you want: ");
        int pos = sc.nextInt();
        System.out.println("Substring of StringBuffer is :" + sb.substring(pos));
    }
}