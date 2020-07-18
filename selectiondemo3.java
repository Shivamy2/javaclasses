import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
class Demo3 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int guess;
        do{
            System.out.println("\nGuess a number\n");
            guess = sn.nextInt();
            if (guess == 69){
                System.out.println("You have entered correct number\n");
                break;
            }
                System.out.println("Try again!!\n");
        }while(guess!=69);
    }
}