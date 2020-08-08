/**
 * Check is both the string have same length and same set of characters eg:-
 * rama,amar ==> Both string has same length and same set of chars
 */
public class StringJudgement {

    public static void main(String[] args) {
        String str1 = "amar";
        String str2 = "rama";
        int StringOneLeng = str1.length();
        int StringTwoLeng = str2.length();
        char[] stringArray1 = str1.toCharArray();
        char[] stringArray2 = str2.toCharArray();
        StringResultCalc(StringOneLeng, StringTwoLeng, stringArray1, stringArray2);
    }

    public static void StringResultCalc(int StringOneLeng,int StringTwoLeng, char[] stringArray1,char[] stringArray2) {
        int flag = 0;
        if ((StringOneLeng == StringTwoLeng)) {
            for (int i = 0; i < stringArray1.length; i++) {
                for (int j = 0; j < stringArray2.length; j++) {
                    if (stringArray1[i] == stringArray2[j]) {
                        flag = flag + 1;
                        break;
                    } //if statement
                } //inner for loop
            } //outer for loop
        }
        System.out.println(flag);
        if (flag == StringOneLeng) {
            System.out.println("pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}