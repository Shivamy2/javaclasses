import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
class Demo {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter your age in integer\n");
        int age = sn.nextInt();
        System.out.println("checking if you are eligible for voting...\n");
        if (age >= 18) {
            System.out.println("You are eligible to vote as you are " + age + " now");
        } else {
            System.out.println("You are not eligible till now. You have " + (- age + 18) + " years now to vote");
        }
    }
}