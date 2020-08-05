
// input = "Hello World"
// output = "hELLO wORLD"
import java.util.Scanner;

public class Task6StringLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                   //To input the string
        String name = sc.nextLine(); 
        char[] stringToArray = name.toCharArray();            //converts string to character array
        Task6StringLogic ob = new Task6StringLogic();        //creating the object of class Task6StringLogic
        ob.stringlogic(stringToArray);
        System.out.println(stringToArray);                  //printing the output
    }

    void stringlogic(char[] CharCalc) {                                //function for toogling the character of every 
        for (int i = 0; i < CharCalc.length; i++) {
            if (CharCalc[i] >= 'A' && CharCalc[i] <= 'Z') {
                CharCalc[i] = (char) (CharCalc[i] + 'a' - 'A');
            }
            else if (CharCalc[i] >= 'a' && CharCalc[i] <= 'z') {
                CharCalc[i] =(char) (CharCalc[i] + 'A' - 'a');
            }
        }
    }
}