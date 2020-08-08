/**
 * To concatenate String buffer and builder objects
 */
public class StringBBConc {

    public static void main(String[] args) {
     StringBuffer sbf = new StringBuffer("Hello ");
     StringBuilder sbl = new StringBuilder("World");
     System.out.println("Concatenated string is : " + sbf + sbl);
    }
}